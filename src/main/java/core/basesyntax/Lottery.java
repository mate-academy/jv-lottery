package core.basesyntax;
import java.util.Random;

public class Lottery extends Ball {
    public String getRandomBall(){
        return "Ball's number is: " + number + ", ball's color is: " + color.getRandomColor();
    }
}
