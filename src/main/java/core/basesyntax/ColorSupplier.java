package core.basesyntax;

public class ColorSupplier {

    public Colors getRandomColor() {
        return Colors.values()[Random.getRandom().nextInt(Colors.values().length)];
    }
}
