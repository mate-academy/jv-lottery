package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    public String getRandomColor() {
        int randomInt = new SecureRandom().nextInt(9);
        Color ballcolor = Color.values()[randomInt];
        return ballcolor.toString();
    }

}
