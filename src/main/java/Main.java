public class Main {
    public static void main(String[] args) {
        Lottery firstRandomBall = new Lottery();
        Lottery secondRandomBall = new Lottery();
        Lottery thirdRandomBall = new Lottery();

        System.out.println(firstRandomBall.getRandomBall());
        System.out.println(secondRandomBall.getRandomBall());
        System.out.println(thirdRandomBall.getRandomBall());

    }
}
