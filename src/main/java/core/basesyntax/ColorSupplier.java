package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        int index = (int)(Math.random() * Color.length);
        return Color.values()[index].toString();
    }
}
