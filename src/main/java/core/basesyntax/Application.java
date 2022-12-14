package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lt = new Lottery();
        Ball[] bl = new Ball[3];

        for(int i = 0; i < bl.length; i++) {
          bl[i] = lt.getRandomBall();
          System.out.println("ball " + (i+1) + " " + bl[i]);
        }
    }
}
