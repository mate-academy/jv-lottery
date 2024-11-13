package core.basesyntax;

public class Lottery {
    public String getRandomBall() {
    String clr = new ColorSupplier();
    clr = clr.getRandomColor();
    Random inted = new Random();
    int ran = inted.nextInt(100) + 1;
    return "Color: " + clr + ", number: " + ran;
}