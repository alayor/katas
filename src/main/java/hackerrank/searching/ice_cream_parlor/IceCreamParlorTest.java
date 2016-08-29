/* Copyright 2016 Sabre Holdings */
package hackerrank.searching.ice_cream_parlor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IceCreamParlorTest {

    @Test
    public void given_less_than_zero_dollars_should_return_empty_array() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
       int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(-1, new int[0]);
        //then
        assertTrue(boughtIceCreams.length == 0);
    }

    @Test
    public void given_1_dollar_should_return_empty_array() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
      int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(1, new int[1]);
        //then
        assertTrue(boughtIceCreams.length == 0);
    }

    @Test
    public void given_1_ice_cream_should_return_empty_array() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[1]);
        //then
        assertTrue(boughtIceCreams.length == 0);
    }

    @Test
    public void given_2_dollar_and_1_1_ice_creams_should_return_1_2() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[] {1, 1});
        //then
        assertEquals(2, boughtIceCreams.length);
        assertEquals(1, boughtIceCreams[0]);
        assertEquals(2, boughtIceCreams[1]);
    }

    @Test
    public void given_2_dollar_and_3_1_1_ice_creams_should_return_2_3() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[] {3, 1, 1});
        //then
        assertEquals(2, boughtIceCreams.length);
        assertEquals(2, boughtIceCreams[0]);
        assertEquals(3, boughtIceCreams[1]);
    }
}
