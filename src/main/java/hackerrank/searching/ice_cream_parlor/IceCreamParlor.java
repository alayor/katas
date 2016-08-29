/* Copyright 2016 Sabre Holdings */
package hackerrank.searching.ice_cream_parlor;

public class IceCreamParlor {

    public int[] getBoughtIceCreams(int dollars, int[] iceCreamPrices) {
        if (dollars < 2 || iceCreamPrices.length < 2) {
            return new int[0];
        }

        int[] iceCreamIndexes = new int[2];
        int index = 0;
        for (int i = 0; i < iceCreamPrices.length; i++) {
            if(iceCreamPrices[i] > dollars)
                continue;

            iceCreamIndexes[index % 2] = i + 1;
            index++;
        }
        return iceCreamIndexes;
    }
}
