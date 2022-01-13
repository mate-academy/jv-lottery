package core.basesyntax;
import java.security.SecureRandom;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomInt = new SecureRandom().nextInt(9 - 0);
          Color ballcolor = Color.values()[randomInt];
          return ballcolor.toString();
    }
public ColorSupplier() {}

}
