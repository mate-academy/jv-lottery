package core.basesyntax;

public class Lottery {
    @Override
    public String getRandomColor() {
    String supered = super.getRandomColor();
    Random inted = new Random();
    int ran = inted.nextInt(100) + 1;
    return "Color: " + supered + ", number: " + ran;
}