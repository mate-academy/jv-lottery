import java.util.Random;

public class Lottery {
    public static Ball getRandomBall(){
        Random random = new Random();
        int numb = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        Colors color = colorSupplier.getRandomColor();
        Ball ball = new Ball(numb, color);
        return ball;
    }
    }