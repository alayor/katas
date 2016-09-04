package algorithms.union_find.network_connectivity;

import java.util.Map;
import java.util.TreeMap;

class Network {
    private Map<Integer, Friend> friends = new TreeMap<>();
    private Map<Integer, Integer> groupSize = new TreeMap<>();

    void connect(Friend friendA, Friend friendB) {
        friendA.setParentId(getRoot(friendB.getId()));
        increaseGroupSize(friendA);
        increaseGroupSize(friendB);
    }

    private void increaseGroupSize(Friend friendA) {
        int size = getSize(friendA.getId());
        groupSize.put(friendA.getId(), ++size);
    }

    int getRoot(int id) {
        Friend friend = friends.get(id);
        while (friend.isNotRoot()) {
            friend = friends.get(friend.getParentId());
        }
        return friend.getId();
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

    int getSize(int id) {
        return groupSize.get(id);
    }
}
