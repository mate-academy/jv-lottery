package core.basesyntax;

public class ColorSupplier extends Lottery {

    public String getRandomColor() {

        int randomIndex = getRandom().nextInt(Color.values().length);

        return String.valueOf(Color.values()[randomIndex]);
    }
}
