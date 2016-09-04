package algorithms.union_find.network_connectivity;

import java.util.Map;
import java.util.TreeMap;

class Network {
    private Map<Integer, Friend> friends = new TreeMap<>();

    void connect(Friend friendA, Friend friendB) {
        addFriends(friendA, friendB);
        friendA.setParentId(getRoot(friendB));
    }

    int getRoot(Friend friend) {
        addFriend(friend);
        Friend current = friends.get(friend.getId());
        while (current.getId() != current.getParentId()) {
            current = friends.get(current.getParentId());
        }
        return current.getId();
    }

    private void addFriend(Friend friend) {
        friends.put(friend.getId(), friend);
    }

    private void addFriends(Friend... friend) {
        for (Friend f : friend) {
            friends.put(f.getId(), f);
        }
    }
}
