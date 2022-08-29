import java.util.Random;

public class Lottery {

	public String getRandomBall () {

		Random random = new Random();
		int col = random.nextInt(Colors.values().length);
		int num = random.nextInt(100);

		StringBuilder builder = new StringBuilder();
		return  builder.append(Colors.values()[col]).append(" ").append(num).toString();

	}
}
