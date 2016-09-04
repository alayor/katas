package algorithms.union_find;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SocialNetworkConnectivityTest {

    private Friend friend;

    @Before
    public void setUp() throws Exception {
        friend = new Friend();
    }

    @Test
    public void should_be_able_to_get_id_assigned() {
        friend.getId();
    }

    @Test
    public void a_new_friend_should_have_id_greater_than_0() {
        assertTrue(friend.getId() > 0);
    }

    @Test
    public void two_friends_should_not_have_the_same_id() {
        Friend friend1 = new Friend();
        Friend friend2 = new Friend();
        assertNotEquals(friend1.getId(), friend2.getId());
    }

    @Test
    public void we_should_be_able_to_set_parent_id() {
        friend.setParentId(1);
    }

    @Test
    public void parent_id_should_be_positive_integer() {
        assertTrue(friend.getParentId() > -1);
    }

    @Test
    public void we_should_get_same_parent_id_that_we_set() {
        friend.setParentId(1);
        assertEquals(1, friend.getParentId());
    }

    @Test
    public void when_two_friends_are_connected_the_id_from_one_friend_is_the_parent_id_of_the_other(){
        Friend friend1 = new Friend();
        Friend friend2 = new Friend();
        friend1.connect(friend2);

        assertEquals(friend1.getParentId(), friend2.getId());
    }

    @Test
    public void if_two_friends_are_not_connected_then_the_parent_of_any_friend_should_not_be_the_id_of_the_other(){
        Friend friend1 = new Friend();
        Friend friend2 = new Friend();

        assertNotEquals(friend1.getParentId(), friend2.getId());
        assertNotEquals(friend2.getParentId(), friend1.getId());
    }

    @Test
    public void if_two_friends_are_not_connected_then_they_should_have_different_parent_ids(){
        Friend friend1 = new Friend();
        Friend friend2 = new Friend();

        assertNotEquals(friend1.getParentId(), friend2.getParentId());
    }
    //TODO:
}
