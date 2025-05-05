import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier randColor = new ColorSupplier();
        Random rand = new Random();
        int randNumber = rand.nextInt(101);
        return new Ball(randColor.getRandomColor(), randNumber);
    }
}
