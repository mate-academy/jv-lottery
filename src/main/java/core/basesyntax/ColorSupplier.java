package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor () {
        return null;
    Random rmd = new Random();
    public Color getRandomColor() {
        int i = rmd.nextInt(Color.values().length);
        String colored = Color.values()[i];
        return colored;
    }
}
}
