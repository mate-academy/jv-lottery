package core.basesyntax;
public class ColorSupplier {
   private int index = Lottery.random.nextInt(Color.values().length);
    public String getRandomColor() {
        return Color.values()[index].toString();
    }
}
