package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery userFirst = new Lottery();
        Lottery userSecond = new Lottery();
        Lottery userThird = new Lottery();
        System.out.println(userFirst.getRandomBall().toString());
        System.out.println(userSecond.getRandomBall().toString());
        System.out.println(userThird.getRandomBall().toString());
    }
}
