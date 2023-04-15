package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        System.out.println("Enter the color and number of three balls.");
        System.out.println("You can use numbers from 0 to 100 and next colors:\n"
                + "BLUE,\n"
                + "YELLOW,\n"
                + "RED,\n"
                + "GREEN,\n"
                + "WHITE,\n"
                + "BLACK\n");
        System.out.println("---------------------------------");

        System.out.println("Entered results: ");

        Ball firstBall = new Ball();
        firstBall.setColour("GREEN");
        firstBall.setNumber(54);
        System.out.println(firstBall);

        Ball secondBall = new Ball();
        secondBall.setColour("RED");
        secondBall.setNumber(81);
        System.out.println(secondBall);

        Ball thirdBall = new Ball();
        thirdBall.setColour("BLUE");
        thirdBall.setNumber(4);
        System.out.println(thirdBall + "\n");

        System.out.println("---------------------------------");

        System.out.println("Lottery results: ");

        for (int i = 0; i < 3; i++) {
            ColorSupplier ball = new Lottery();
            System.out.println(ball.getRandomBall());
        }
    }
}
