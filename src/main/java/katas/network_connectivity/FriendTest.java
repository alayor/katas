package katas.network_connectivity;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendTest {

    private Friend friendA;
    private Friend friendB;

    @Before
    public void setUp() throws Exception {
        friendA = new Friend();
        friendB = new Friend();
    }

    @Test
    public void should_be_able_to_get_id_assigned() {
        friendA.getId();
    }

    @Test
    public void a_new_friend_should_have_id_greater_than_0() {
        assertTrue(friendA.getId() > 0);
    }

    @Test
    public void two_friends_should_not_have_the_same_id() {
        assertNotEquals(friendA.getId(), friendB.getId());
    }

    @Test
    public void we_should_be_able_to_set_parent_id() {
        friendA.setParentId(1);
    }

    @Test
    public void parent_id_should_be_positive_integer() {
        assertTrue(friendA.getParentId() > -1);
    }

    @Test
    public void we_should_get_same_parent_id_that_we_set() {
        friendA.setParentId(1);
        assertEquals(1, friendA.getParentId());
    }

    @Test
    public void if_two_friends_are_not_connected_then_the_parent_of_any_friend_should_not_be_the_id_of_the_other() {
        assertNotEquals(friendA.getParentId(), friendB.getId());
        assertNotEquals(friendB.getParentId(), friendA.getId());
    }

    @Test
    public void if_two_friends_are_not_connected_then_they_should_have_different_parent_ids() {
        assertNotEquals(friendA.getParentId(), friendB.getParentId());
    }

    @Test
    public void if_id_and_parent_id_are_different_should_return_not_root() {
        friendA.setParentId(friendA.getId() + 1);
        assertTrue(friendA.isNotRoot());
    }
}
