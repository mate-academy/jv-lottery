package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery lt1 = new Lottery();
        Lottery lt2 = new Lottery();
        Lottery lt3 = new Lottery();
        System.out.println(lt1.getRandomBall());
        System.out.println(lt2.getRandomBall());
        System.out.println(lt3.getRandomBall());
    }
}
