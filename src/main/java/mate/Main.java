package mate;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + new Lottery().getRandomBall().toString());
        }
    }
}
