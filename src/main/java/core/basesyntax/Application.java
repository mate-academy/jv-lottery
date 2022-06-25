package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < 3; i++) {
            System.out.println(new Lottery().getRandomBall());
        }
    }
}

//        System.out.println(new ColorSupplier().getRandomColor()); testing getRandomColor
//        System.out.println(new Lottery().getRandomBall());        testing getRandomBall
//To test the program, in main() method, create three balls using getRandomBall() method from Lottery class.
// And print information about them in the console