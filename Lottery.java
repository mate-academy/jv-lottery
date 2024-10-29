import java.util.Random;
public class Lottery {
    public static ball getRandomBall(){
        Random random = new Random();
        int numb = random.nextInt(100);
        ColorSupplier ColorsSupplier = new ColorSupplier();
        Colors gege = ColorsSupplier.getRandomColor();
        Ball sum = new Ball(numb, sum);
        return ball;
    }
}
