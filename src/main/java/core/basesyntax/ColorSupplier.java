package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return Colors.values()[Lottery.random.nextInt(Colors.values().length)].toString();
    }
}
