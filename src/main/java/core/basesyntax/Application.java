package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball[] ballsArray = new Ball[3];
        for (int i = 0; i < ballsArray.length; i++) {
            Lottery lottery = new Lottery();
            ballsArray[i] = lottery.getRandomBall();
        }
        for (Ball element: ballsArray) {
            System.out.println(element.toString());
        }
    }
}
