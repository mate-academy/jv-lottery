import java.util.Random;

public class Ball {
	String color;
	int num;

	@Override
	public String toString(){
     return "";
	}
	public Ball(String color, int num){
		this.num = num;
		this.color = color;

	}

	public static void main(String[] args) {

		Ball[] balls = new Ball[3];
		ColorSupplier BallColor = new ColorSupplier();
		String my_ball;
		Lottery ballwin = new Lottery();
        String Win = ballwin.getRandomBall();
		for (int i=0; i< balls.length; i++){
			balls[i] = new Ball (BallColor.getRandomColor(),new Random().nextInt(100));
			my_ball = balls[i].color + " " + balls[i].num;

			if (my_ball.equals(Win)) {
				System.out.println("You are win!");
			} else {
				System.out.println("Try again!");
			}
		}

		System.out.println(ballwin.getRandomBall());
	}

}
