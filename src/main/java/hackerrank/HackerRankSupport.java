package hackerrank;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public abstract class HackerRankSupport {

    private Scanner scanner;
    private PrintStream printStream;
    private int casesNumber;

    protected HackerRankSupport(InputStream stream, PrintStream printStream) {
        scanner = new Scanner(stream);
        this.printStream = printStream;
        casesNumber = scanner.nextInt();
        if (scanner.hasNext()) {
            scanner.nextLine();
        }
    }

    public void run() {
        while (casesNumber-- > 0) {
            execute();
        }
    }

    public abstract void execute();

    protected int readInt() {
        return scanner.nextInt();
    }

    protected void println(String s) {
        printStream.println(s);
    }

    protected List<Integer> readList() {
        return stream(scanner.nextLine().split("\\s+"))
                .map(Integer::new)
                .collect(toList());
    }

    protected void readLine() {
        scanner.nextLine();
    }

    protected void readDoubleLine() {
        scanner.nextLine();
        scanner.nextLine();
    }
}