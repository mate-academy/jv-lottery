package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[Application.getRandom().nextInt(Color.values().length)].toString();
    }
}
