package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        System.out.println("Random color: " + randomColor);
    }
}
