import java.util.Random;

public class ColorSupplier {

	public String getRandomColor() {

		Random random = new Random();
		int pos = random.nextInt(Colors.values().length);
		return Colors.values()[pos].toString();

	}


}
