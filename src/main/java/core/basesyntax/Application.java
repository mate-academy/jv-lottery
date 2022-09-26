package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for(int a=0;a<3;a++){
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());

        }


    }
}
