package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery ball1 = new Lottery(1, "Red");
        Lottery ball2 = new Lottery(2, "Blue");
        Lottery ball3 = new Lottery(3, "Green");

        ball1.displayInfo();
        ball2.displayInfo();
        ball3.displayInfo();
    }
}
