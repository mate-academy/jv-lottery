package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Ball one = new Lottery().getRundomBall();
        Ball two = new Lottery().getRundomBall();
        Ball three = new Lottery().getRundomBall();
        
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }
}
