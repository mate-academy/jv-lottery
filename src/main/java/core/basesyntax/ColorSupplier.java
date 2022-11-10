package core.basesyntax;

public class ColorSupplier extends Lottery {
    int randomIndex = random.nextInt(Color.values().length);
    public String getRandomColor() {

        return String.valueOf(Color.values()[randomIndex]);
    }
}
