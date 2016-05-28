/**
 * Defines the service that calls our hello world interface
 */
public interface GreetingService {
    /**
     *
     * @param greeting The service that generates our greeting
     * @return The generated greeting
     */
    String callHelloWorld(final Greeting greeting);
}
