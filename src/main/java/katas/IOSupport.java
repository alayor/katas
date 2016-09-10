package katas;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;

public abstract class IOSupport {
    private Scanner scanner;
    private PrintStream printStream;

    protected IOSupport(InputStream stream, PrintStream printStream) {
        scanner = new Scanner(stream);
        this.printStream = printStream;
    }

    protected boolean hasNext() {
        return scanner.hasNext();
    }

    protected boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    protected void nextLine() {
        scanner.nextLine();
    }

    protected int nextInt() {
        return scanner.nextInt();
    }

    protected abstract void run();

    public int readInt() {
        return scanner.nextInt();
    }

    public void println(String s) {
        printStream.println(s);
    }

    public void print(String s) {
        printStream.print(s);
    }

    public List<Integer> readList() {
        return stream(scanner.nextLine().split("\\s+"))
                .map(Integer::new)
                .collect(toList());
    }

    public String readLine() {
        return scanner.nextLine();
    }

    protected String readString() {
        return scanner.next();
    }

    public void readDoubleLine() {
        scanner.nextLine();
        scanner.nextLine();
    }
}
