public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Lottery lottery = new Lottery();
            System.out.println(lottery.getRandomBall());
        }
    }
    
}
