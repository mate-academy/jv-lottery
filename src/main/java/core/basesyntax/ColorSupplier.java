package core.basesyntax;
import java.security.SecureRandom;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int randomInt = new SecureRandom().nextInt(10 - 1) + 1;
          switch (randomInt) {
              case 1:
                  return String.valueOf(Color.RED);
              case 2:
                  return String.valueOf(Color.BROWN);
              case 3:
                  return String.valueOf(Color.ORANGE);
              case 4:
                  return String.valueOf(Color.GREEN);
              case 5:
                  return String.valueOf(Color.BLUE);
              case 6:
                  return String.valueOf(Color.YELLOW);
              case 7:
                  return String.valueOf(Color.GRAY);
              case 8:
                  return String.valueOf(Color.WHITE);
              case 9:
                  return String.valueOf(Color.PURPLE);
              case 10:
                  return String.valueOf(Color.BLACK);
              default:
                  return String.valueOf(Color.GRAY);
          }

    }
}
