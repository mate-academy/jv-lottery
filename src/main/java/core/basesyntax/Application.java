package core.basesyntax;

public class Application {

    public static void main(String[] args) {
        Loterry loterry = new Loterry();
        Ball one = loterry.getRandomBall();
        Ball two = loterry.getRandomBall();
        Ball three = loterry.getRandomBall();
        System.out.println("Ball one: color is " + one.getColor() + " nuber is " + one.getNumber());
        System.out.println("Ball two: color is " + two.getColor() + " nuber is " + two.getNumber());
        System.out.println("Ball three: color is " + three.getColor() + " nuber is "
                + three.getNumber());
    }
}
