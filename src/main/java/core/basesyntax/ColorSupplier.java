package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        int index = (int)(Math.random() * Color.values().length);
        return Color.values()[index].toString();
    }
}
