package katas.network_connectivity;

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
            Friend oldRoot = root;
            root = friends.get(root.getParentId());
            oldRoot.setParentId(root.getParentId());
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

    boolean areConnected(Friend friendA, Friend friendB) {
        return getRoot(friendA) == getRoot(friendB);
    }

    boolean areAllConnected() {
        Friend root = getFirstFriendRoot();
        if (root == null) {
            return false;
        }
        for (Friend friend : friends.values()) {
            if (getRoot(friend) != root) {
                return false;
            }
        }
        return true;
    }

    private Friend getFirstFriendRoot() {
        Friend root = null;
        for (Friend friendA : friends.values()) {
            root = getRoot(friendA);
        }
        return root;
    }
}
