import java.util.Random;
public class Lottery {
    public static ball getRandomBall(){
        Random random = new Random();
        int numb = random.nextInt(100);
        ColorSupplier ColorsSupplier = new ColorSupplier();
        Colors gege = ColorsSupplier.getRandomColor();
        ball ball = new ball(numb, gege);
        return ball;
    }
}
