package core.colors;

//import core.enumcolors.Color;
import java.util.Random;

public class ColorSupplier {
    enum Color {
        Aquamarine,
        Azure,
        BurlyWood,
        CadetBlue,
        Gainsboro,
        Gold,
        Gray,
        Khaki,
        LawnGreen,
        LightGreen,
        LightSkyBlue,
        Linen,
        MediumOrchid,
        MediumPurple,
        MistyRose,
        Olive,
        OliveDrab,
        Orange,
        OrangeRed,
        Orchid,
        PaleTurquoise,
        Peru,
        Pink,
        Plum,
        RoyalBlue,
        SandyBrown,
        SeaGreen,
        SteelBlue;
    }

    public String getRandomColor() {
        Random random = new Random();
        Color[] color = Color.values();
        return color[random.nextInt(color.length)].toString();
    }
}
