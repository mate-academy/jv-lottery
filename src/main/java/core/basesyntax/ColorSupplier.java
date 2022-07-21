package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        int index = Lottery.random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }
}
