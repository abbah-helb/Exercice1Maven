package hello;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
public class GreeterTest {
    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.SayHello(), containsString("Hello"));
    }
}
