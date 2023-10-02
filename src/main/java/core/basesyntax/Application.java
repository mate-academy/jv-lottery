package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            Ball ball1 = Lottery.getRandomBall();
            System.out.println(ball1.toString());
        }


        // create three balls using class Lottery and print information about them in console
    }
}
