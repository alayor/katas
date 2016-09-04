package algorithms.union_find.network_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    private Network network;
    private Friend friendA;
    private Friend friendB;

    @Before
    public void setUp() throws Exception {
        network = new Network();
        friendA = new Friend();
        friendB = new Friend();
    }

    @Test
    public void it_should_have_a_method_connect_that_receives_two_friends() {
        network.connect(friendA, friendB);
    }

    @Test
    public void if_just_two_friends_are_connected_they_should_have_the_same_parent_id() {
        network.connect(friendA, friendB);
        assertEquals(friendA.getParentId(), friendB.getParentId());
    }

    @Test
    public void given_just_one_friend_its_root_should_be_the_same_as_its_id(){
        assertEquals(friendA.getId(), network.getRoot(friendA));
    }

    @Test
    public void given_two_connected_friends_their_roots_should_be_the_same(){
        network.connect(friendA, friendB);
        assertEquals(network.getRoot(friendA), network.getRoot(friendB));
    }
}
