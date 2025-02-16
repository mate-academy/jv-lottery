package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        //Ball ball1 = new Ball();
        //Ball ball2 = new Ball();
        //Ball ball3 = new Ball();
        //Lottery ball2 = new Lottery();
        //Lottery ball3 = new Lottery();
        
        Ball ball1 = new Lottery().getRamdomBall();
        Ball ball2 = new Lottery().getRamdomBall();
        Ball ball3 = new Lottery().getRamdomBall();




        System.out.println("Ball1: " + ball1 + "\nBall2: " + ball2 + "\nBall3: " + ball3);
        // create three balls using class Lottery and print information about them in console
    }
}
