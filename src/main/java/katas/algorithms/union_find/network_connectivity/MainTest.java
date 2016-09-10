package katas.algorithms.union_find.network_connectivity;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintStream printStream = new PrintStream(out);


    @Test
    public void given_just_two_connected_friends_should_print_that_date() {
        new Main(getInputStream("" +
                "1 2 01/01/16"), printStream).run();
        assertEquals("01/01/16", out.toString());
    }

    @Test
    public void given_none_friends_should_return_empty_string() {
        new Main(getInputStream(""), printStream).run();
        assertEquals("", out.toString());
    }

    @Test
    public void given_friendship_with_just_one_friend_should_print_empty() {
        new Main(getInputStream("" +
                "1 01/01/16"), printStream).run();
        assertEquals("", out.toString());
    }

        @Test
    public void given_not_connected_friends_should_not_return_date() {
        new Main(getInputStream("" +
                "1 2 01/01/16\n" +
                "3 4 01/02/16"), printStream).run();
        assertEquals("", out.toString());
    }

    @Test
    public void given_friends_indirect_connected_all_should_be_connected(){
        new Main(getInputStream("" +
                "1 2 01/01/16\n" +
                "3 4 01/02/16\n" +
                "1 4 01/03/16"), printStream).run();
        assertEquals("01/03/16", out.toString());
    }

    @Test
    public void given_not_all_friends_connected_all_should_be_not_connected(){
        new Main(getInputStream("" +
                "1 2 01/01/16\n" +
                "3 4 01/02/16\n" +
                "5 6 01/03/16\n" +
                "1 4 01/04/16"), printStream).run();
        assertEquals("", out.toString());
    }

    @Test
    public void connected_date_should_not_be_always_the_last_one(){
        new Main(getInputStream("" +
                "1 2 01/01/16\n" +
                "3 4 01/02/16\n" +
                "5 6 01/03/16\n" +
                "1 4 01/04/16\n" +
                "3 6 01/05/16\n" +
                "3 6 01/06/16"), printStream).run();
        assertEquals("01/05/16", out.toString());
    }


    private InputStream getInputStream(String str) {
        return new ByteArrayInputStream(str.getBytes(UTF_8));
    }

}
