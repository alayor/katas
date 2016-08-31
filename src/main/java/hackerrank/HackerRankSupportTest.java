package hackerrank;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class HackerRankSupportTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintStream printStream = new PrintStream(out);

    @Test
    public void shouldCallExecuteTwice() {

        HackerRankSupport_Spy hackerRankSupport =
                new HackerRankSupport_Spy(getInputStream("2"), printStream);
        hackerRankSupport.run();
        assertEquals(2, hackerRankSupport.timesExecuteCalled);
    }

    @Test
    public void shouldRead2Then4() {
        HackerRankSupport_Spy hackerRankSupport = new HackerRankSupport_Spy(getInputStream(
                "" +
                        "2\n" +
                        "2\n" +
                        "4"
        ), printStream);

        assertEquals(2, hackerRankSupport.readInt());
        assertEquals(4, hackerRankSupport.readInt());
    }

    @Test
    public void shouldPrint2_newline_4() {
        HackerRankSupport_Spy hackerRankSupport =
                new HackerRankSupport_Spy(getInputStream("2"), printStream);

        hackerRankSupport.println("2");
        hackerRankSupport.println("4");
        assertEquals("2\n4\n", new String(out.toByteArray(), UTF_8));
    }

    @Test
    public void shouldReadListOf2_3_4() {
        HackerRankSupport_Spy hackerRankSupport = new HackerRankSupport_Spy(getInputStream(
                "" +
                        "2\n" +
                        "2 3 4"
        ), printStream);

        assertEquals(asList(2, 3, 4), hackerRankSupport.readList());
    }

    private InputStream getInputStream(String str) {
        return new ByteArrayInputStream(
                str.getBytes(
                        UTF_8));
    }

    private static class HackerRankSupport_Spy extends HackerRankSupport {

        int timesExecuteCalled;

        HackerRankSupport_Spy(InputStream stream, PrintStream printStream) {
            super(stream, printStream);
        }

        @Override
        public void execute() {
            timesExecuteCalled++;
        }
    }
}
