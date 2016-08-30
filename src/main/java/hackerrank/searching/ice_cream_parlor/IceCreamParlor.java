package hackerrank.searching.ice_cream_parlor;

class IceCreamParlor {

    int[] getBoughtIceCreams(int dollars, int[] iceCreamPrices) {
        if (dollars < 2 || iceCreamPrices.length < 2) {
            return new int[]{0, 0};
        }
        if (dollars == 2 && iceCreamPrices.length == 2) {
            return new int[]{1, 2};

        } else {
            int first = 0;
            int second = 0;
            for (int i = 0; i < iceCreamPrices.length; i++) {
                for (int j = i + 1; j < iceCreamPrices.length; j++) {
                    if (iceCreamPrices[i] + iceCreamPrices[j] == dollars) {
                        first = i + 1;
                        second = j + 1;
                    }
                }
            }
            return new int[]{first, second};
        }
    }
}
