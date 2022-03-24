package core.basesyntax;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        return "Color: " + getRandomColor() + " " + "Number: " + getNumber();
    }
}
