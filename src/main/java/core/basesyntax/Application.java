package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Lottery ball1 = new Ball();
        Lottery ball2 = new Ball();
        Lottery ball3 = new Ball();

       System.out.println(ball1.getRandomBall()+ " " + ball2.getRandomBall()+" "+ball3.getRandomBall());

    }
}
