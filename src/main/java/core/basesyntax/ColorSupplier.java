package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor(int random) {
        return Colors.values()[random].toString();
    }
}
