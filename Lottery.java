import java.util.Random;

public class Lottery {
    public static Ball getRandomBall(){
        Random random = new Random();
        int numb = random.nextInt(100);
        ColorSupplier ColorsSupplier = new ColorSupplier();
        Colors color = ColorsSupplier.getRandomColor();
        Ball Ball = new Ball(numb, color);
        return Ball;
    }

    }

