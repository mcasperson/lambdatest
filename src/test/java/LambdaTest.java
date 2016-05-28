import org.junit.Assert;
import org.junit.Test;

/**
 * Tests that demonstrate the various stages converting an anonymous class to a lambda
 */
public class LambdaTest {
    private static final GreetingService HELLO_WORLD_EXECUTOR = new GreetingMatthew();

    @Test
    public void anonymousClass() {
        final String greeting = HELLO_WORLD_EXECUTOR.callHelloWorld(new Greeting() {
            @Override
            public String hello(String name) {
                return "Hello " + name;
            }
        });

        Assert.assertEquals("Hello Matthew", greeting);
    }

    @Test
    public void firstLevel() {
        final String greeting = HELLO_WORLD_EXECUTOR.callHelloWorld((String name) -> {
            return "Hello " + name;
        });

        Assert.assertEquals("Hello Matthew", greeting);
    }

    @Test
    public void secondLevel() {
        final String greeting = HELLO_WORLD_EXECUTOR.callHelloWorld(name -> {
            return "Hello " + name;
        });

        Assert.assertEquals("Hello Matthew", greeting);
    }

    @Test
    public void thirdLevel() {
        final String greeting = HELLO_WORLD_EXECUTOR.callHelloWorld(name -> "Hello " + name);

        Assert.assertEquals("Hello Matthew", greeting);
    }
}
