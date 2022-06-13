package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        int index = Lottery.randomNumber(Color.values().length);
        return Color.values()[index].toString();
    }
}
