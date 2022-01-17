package core.basesyntax;

import java.security.SecureRandom;

public class ColorSupplier {
    private SecureRandom secureRandom = new SecureRandom();
    public String getRandomColor() {
        int randomInt = secureRandom.nextInt(9);
        Color ballcolor = Color.values()[randomInt];
        return ballcolor.toString();
    }

}
