package core.basesyntax;

/**
 * Represents a lottery ball with a color and a number.
 */
public class Ball {
    private final int number;
    private final Colors color;

    /**
     * Constructs a Ball with the given number and color.
     *
     * @param number the ball number
     * @param color  the ball color
     */
    public Ball(int number, Colors color) {
        this.number = number;
        this.color = color;
    }

    /**
     * Returns a string representation of the ball in the form:
     * Ball {color='COLOR', number=NUMBER}
     *
     * @return the string representation of this ball
     */
    @Override
    public String toString() {
        return "Ball {color='" + color.name() + "', number=" + number + "}";
    }
}
