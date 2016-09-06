package katas.hackerrank;

import katas.IOSupport;

import java.io.InputStream;
import java.io.PrintStream;

import static java.util.Arrays.stream;

public abstract class HackerRankSupport extends IOSupport {
    private int casesNumber;

    protected HackerRankSupport(InputStream stream, PrintStream printStream) {
        super(stream, printStream);
        casesNumber = nextInt();
        if (hasNext()) {
            nextLine();
        }
    }

    @Override
    public void run() {
        while (casesNumber-- > 0) {
            execute();
        }
    }

    protected abstract void execute();
}