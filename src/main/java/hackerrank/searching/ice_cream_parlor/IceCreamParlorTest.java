package hackerrank.searching.ice_cream_parlor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IceCreamParlorTest {

    @Test
    public void given_less_than_zero_dollars_should_return_0_0() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
       int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(-1, new int[0]);
        //then
        assertEquals(0, boughtIceCreams[0]);
        assertEquals(0, boughtIceCreams[1]);
    }
}
