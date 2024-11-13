package core.basesyntax;

public class ColorSupplier {
    Random rmd = new Random();
    public String getRandomColor() {
        int i = rmd.nextInt(Color.values().length);
        String colored = Color.values()[i];
        return colored;
    }
}
