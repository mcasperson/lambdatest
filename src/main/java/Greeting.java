/**
 * An example functional interface
 */
@FunctionalInterface
public interface Greeting {
    /**
     *
     * @param name The name of the person to greet
     * @return The complete greeting
     */
    String hello(final String name);
}
