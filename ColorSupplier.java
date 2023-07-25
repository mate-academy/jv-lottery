import java.util.Random;

class ColorSupplier {
    private static final String[] colors = {"BLACK", "RED", "GREY", "YELLOW", "WHITE"};

    public static String getRandomColor() {
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}