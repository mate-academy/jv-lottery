package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        int index = Lottery.RANDOM.nextInt(Colors.values().length);
        return Colors.values()[index].name();
    }
}
