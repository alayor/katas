package hackerrank.searching.ice_cream_parlor;

import hackerrank.HackerRankSupport;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;

class IceCreamParlor {

    public static void main(String[] args) {
        HackerRankSolution hackerRankSolution = new HackerRankSolution(System.in, System.out);
        hackerRankSolution.run();
    }

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

    private static class HackerRankSolution extends HackerRankSupport {

        HackerRankSolution(InputStream stream, PrintStream printStream) {
            super(stream, printStream);
        }

        @Override
        public void execute() {
            IceCreamParlor iceCreamParlor = new IceCreamParlor();
            int dollars = readInt();
            int[] iceCreamPrices = getIceCreamPrices();
            int[] boughtIceCreams = iceCreamParlor.getBoughtIceCreams(dollars, iceCreamPrices);
            println(boughtIceCreams[0] + " " + boughtIceCreams[1]);
        }

        private int[] getIceCreamPrices() {
            readDoubleLine();
            List<Integer> iceCreamPricesList = readList();
            Iterator<Integer> iterator = iceCreamPricesList.iterator();
            int[] iceCreamPrices = new int[iceCreamPricesList.size()];
            for(int i = 0; i < iceCreamPrices.length; i++) {
                iceCreamPrices[i] = iterator.next();
            }
            return iceCreamPrices;
        }
    }
}
