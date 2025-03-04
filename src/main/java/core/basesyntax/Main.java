package core.basesyntax;
import java.util.Random;
enum Color {
    RED, BLACK, WHITE, GREEN, YELLOW, BLUE, MAGENTA, ORANGE, PURPLE
}

class Ball {
    private Color color;
    private int number;

    public Ball(Color color, int number) {
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Ball [color=" + color + ", number=" + number + "]";
    }
}
public class Main {
    public static void main(String[] args) {

        Ball ball1 = Lottery.getRandomBall();
        Ball ball2 = Lottery.getRandomBall();
        Ball ball3 = Lottery.getRandomBall();

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}


