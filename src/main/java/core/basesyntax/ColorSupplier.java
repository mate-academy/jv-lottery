package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        int index = Application.random.nextInt(Color.values().length);
        return Color.values()[index].toString();
    }
}
