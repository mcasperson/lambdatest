/**
 * A specific implementation of the hello world executor that greets me
 */
public class GreetingMatthew implements GreetingService {
    @Override
    public String callHelloWorld(final Greeting greeting) {
        return greeting.hello("Matthew");
    }
}
