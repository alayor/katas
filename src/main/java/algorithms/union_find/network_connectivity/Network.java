package algorithms.union_find.network_connectivity;

import java.util.Map;
import java.util.TreeMap;

class Network {
    private Map<Integer, Friend> friends = new TreeMap<>();
    private Map<Integer, Integer> groupSize = new TreeMap<>();

    void connect(Friend friendA, Friend friendB) {
        connectRoots(getRoot(friendA), getRoot(friendB));
    }

    private void connectRoots(Friend rootA, Friend rootB) {
        if (getSize(rootA) > getSize(rootB)) {
            rootB.setParentId(rootA.getParentId());
            increaseGroupSize(rootA);
        } else {
            rootA.setParentId(rootB.getParentId());
            increaseGroupSize(rootB);
        }
    }

    private void increaseGroupSize(Friend friendA) {
        int size = getSize(friendA);
        groupSize.put(friendA.getId(), ++size);
    }

    Friend getRoot(Friend friend) {
        Friend root = friends.get(friend.getId());
        while (root.isNotRoot()) {
            root = friends.get(friend.getParentId());
        }
        return root;
    }

    private void addFriend(Friend friend) {
        if (friends.get(friend.getId()) == null) {
            friends.putIfAbsent(friend.getId(), friend);
            groupSize.put(friend.getId(), 1);
        }
    }

    void addFriends(Friend... friends) {
        for (Friend friend : friends) {
           addFriend(friend);
        }
    }

    int getSize(Friend friend) {
        return groupSize.get(getRoot(friend).getId());
    }
}
