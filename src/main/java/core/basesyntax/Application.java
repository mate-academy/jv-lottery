package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery lottery = new Lottery();
        // ves proces randoma proishodit v classe lotery poetomy sozdaem ego kopiy
        Ball ball1 = lottery.getRandomBall();
        Ball ball2 = lottery.getRandomBall();
        Ball ball3 = lottery.getRandomBall();
        // berem shar y kotorogo mi yje est pola color i number,
        // i cherez loteri zovel metod getRandomBall v kotorom proishodit ves random
        printResult(ball1);
        printResult(ball2);
        printResult(ball3);
        // zovem nije napisanij metod i vstavlyaem shto vivesti
    }

    public static void printResult(Ball ball) {
        // pechat rezyltata. (Ball ball) potomy shto metod toString lejit v Ball.java
        System.out.println(ball.toString());
        // nam nado vivesti na ekran a kakim vidom napisano v
        // classe Ball potomy ot tyda i (Ball ball)
    }
}
