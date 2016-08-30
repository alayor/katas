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

    @Test
    public void given_less_than_1_dollars_should_return_0_0() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(0, new int[0]);
        //then
        assertEquals(0, boughtIceCreams[0]);
        assertEquals(0, boughtIceCreams[1]);
    }

    @Test
    public void given_less_than_2_dollars_should_return_0_0() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(1, new int[0]);
        //then
        assertEquals(0, boughtIceCreams[0]);
        assertEquals(0, boughtIceCreams[1]);
    }

    @Test
    public void given_2_dollars_and_0_ice_cream_prices_should_return_0_0() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[0]);
        //then
        assertEquals(0, boughtIceCreams[0]);
        assertEquals(0, boughtIceCreams[1]);
    }

    @Test
    public void given_2_dollars_and_1_1_ice_cream_prices_should_return_1_2() throws Exception {
        //given
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[] {1, 1});
        //then
        assertEquals(1, boughtIceCreams[0]);
        assertEquals(2, boughtIceCreams[1]);
    }

    @Test
    public void given_2_dollars_and_2_1_1_ice_cream_prices_should_return_2_3() throws Exception {
        //give
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[] {2, 1, 1});
        //then
        assertEquals(2, boughtIceCreams[0]);
        assertEquals(3, boughtIceCreams[1]);
    }

    @Test
    public void given_2_dollars_and_2_2_1_1_ice_cream_prices_should_return_3_4() throws Exception {
        //give
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(2, new int[] {2, 2, 1, 1});
        //then
        assertEquals(3, boughtIceCreams[0]);
        assertEquals(4, boughtIceCreams[1]);
    }

    @Test
    public void given_100_dollars_and_5_75_25_ice_cream_prices_should_return_2_3() throws Exception {
        //give
        IceCreamParlor iceCreamParlor = new IceCreamParlor();
        //when
        int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(100, new int[] {5, 75, 25});
        //then
        assertEquals(2, boughtIceCreams[0]);
        assertEquals(3, boughtIceCreams[1]);
    }
}
