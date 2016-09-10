package katas.algorithms.union_find.network_connectivity;

import katas.IOSupport;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.util.Objects.nonNull;
import static java.util.stream.Collectors.toList;

class Main extends IOSupport {

    private Network network = new Network();

    public static void main(String[] args) {
        new Main(System.in, System.out).run();
    }

    Main(InputStream stream, PrintStream printStream) {
        super(stream, printStream);
    }

    @Override
    protected void run() {
        List<Friendship> friendships = getFriendships();
        addFriendsToNetwork(friendships);
        print(getAllConnectedDate(friendships));
    }

    private List<Friendship> getFriendships() {
        List<Friendship> friendships = new ArrayList<>();
        while (hasNextLine()) {
            String record = readLine();
            if(record.isEmpty()) break;

            Friendship friendship = new Friendship(record);
            friendships.add(friendship);
        }
        friendships = filterInvalidFriendships(friendships);
        return friendships;
    }

    private List<Friendship> filterInvalidFriendships(List<Friendship> friendships) {
        friendships = friendships.stream()
                .filter(f -> f.friendA.getId() != -1)
                .filter(f -> f.friendB.getId() != -1)
                .filter(f -> nonNull(f.date))
                .collect(toList());
        return friendships;
    }

    private void addFriendsToNetwork(List<Friendship> friendships) {
        for (Friendship friendship : friendships) {
            network.addFriends(friendship.friendA, friendship.friendB);
        }
    }

    private String getAllConnectedDate(List<Friendship> friendships) {
        for (Friendship friendship : friendships) {
            network.connect(friendship.friendA, friendship.friendB);
            if (network.areAllConnected()) {
                return friendship.date;
            }
        }
        return "";
    }

    private class Friendship {
        private final String date;
        private final Friend friendA;
        private final Friend friendB;

        private Friendship(String record) {
            int idA;
            int idB;
            String date;
            StringTokenizer tokenizer = new StringTokenizer(record, " ");
            try {
                idA = parseInt(tokenizer.nextToken());
                idB = parseInt(tokenizer.nextToken());
                date = tokenizer.nextToken();
            } catch (Exception ex) {
                idA = -1;
                idB = -1;
                date = null;
            }
            friendA = new Friend(idA);
            friendB = new Friend(idB);
            this.date = date;
        }
    }
}
