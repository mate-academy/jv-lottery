package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Boll[] bolls = new Boll[3];
        for (int i = 0; i < bolls.length; i++) {
            bolls[i] = new Lottery().getRandomBoll();
            System.out.println(bolls[i]);
        }
    }
}
