package hackerrank;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

abstract class HackerRankSupport {

    private Scanner scanner;
    private PrintStream printStream;
    private int casesNumber;

    HackerRankSupport(InputStream stream, PrintStream printStream) {
        scanner = new Scanner(stream);
        this.printStream = printStream;
        casesNumber = scanner.nextInt();
        if (scanner.hasNext()) {
            scanner.nextLine();
        }
    }

    void run() {
        while (casesNumber-- > 0) {
            execute();
        }
    }

    public abstract void execute();

    int readInt() {
        return scanner.nextInt();
    }

    void println(String s) {
        printStream.println(s);
    }

    List<Integer> readList() {
        return stream(scanner.nextLine().split(" "))
                .map(Integer::new)
                .collect(toList());
    }
}