package katas.network_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkTest {

    private Network network;
    private Friend friendA;
    private Friend friendB;
    private Friend friendC;
    private Friend friendD;
    private Friend friendE;
    private Friend friendF;

    @Before
    public void setUp() throws Exception {
        network = new Network();
        friendA = new Friend();
        friendB = new Friend();
        friendC = new Friend();
        friendD = new Friend();
        friendE = new Friend();
        friendF = new Friend();
        network.addFriends(
                friendA, friendB, friendC,
                friendD, friendE, friendF);
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
    public void given_just_one_friend_its_root_should_be_the_same_as_its_id() {
        assertEquals(friendA.getId(), network.getRoot(friendA).getId());
    }

    @Test
    public void given_two_connected_friends_their_roots_should_be_the_same() {
        network.connect(friendA, friendB);
        assertEquals(network.getRoot(friendA), network.getRoot(friendB));
    }

    @Test
    public void given_two_connected_friends_its_group_size_should_be_two() {
        network.connect(friendA, friendB);
        assertEquals(2, network.getSize(friendA));
        assertEquals(2, network.getSize(friendB));
    }

    @Test
    public void given_no_connected_friend_its_size_should_be_one() {
        network.connect(friendA, friendB);
        assertEquals(1, network.getSize(friendC));
    }

    @Test
    public void given_A_connects_to_B_and_C_then_root_of_C_should_be_parent_id_of_B() {
        network.connect(friendA, friendB);
        network.connect(friendA, friendC);
        assertEquals(friendB, network.getRoot(friendC));
    }

    @Test
    public void given_A_connects_to_B_and_C_then_size_of_root_of_B_should_be_3() {
        network.connect(friendA, friendB);
        network.connect(friendA, friendC);
        assertEquals(3, network.getSize(friendB));
    }

    @Test
    public void when_connecting_two_friends_they_should_be_connected() {
        network.connect(friendA, friendB);
        assertTrue(network.areConnected(friendA, friendB));
    }

    @Test
    public void given_two_not_connected_friends_then_they_should_not_be_connected() {
        assertFalse(network.areConnected(friendA, friendB));
    }

    @Test
    public void given_A_connected_to_B_and_B_connected_to_C_then_A_should_be_connected_to_C() {
        network.connect(friendA, friendB);
        network.connect(friendB, friendC);
        assertTrue(network.areConnected(friendA, friendC));
    }

    @Test
    public void given_no_connected_friends_all_friends_should_not_be_connected() {
        assertFalse(network.areAllConnected());
    }

    @Test
    public void test_that_all_friends_are_connected() {
        network.connect(friendA, friendB);
        network.connect(friendB, friendC);
        network.connect(friendC, friendD);
        network.connect(friendD, friendE);
        network.connect(friendE, friendF);
        assertTrue(network.areAllConnected());
    }

    @Test
    public void multiple_connected_friends_should_have_the_same_root() {
        network.connect(friendA, friendB);
        network.connect(friendB, friendC);
        network.connect(friendD, friendE);
        network.connect(friendE, friendF);
        network.connect(friendA, friendF);
        assertEquals(network.getRoot(friendA), network.getRoot(friendF));
    }
}
