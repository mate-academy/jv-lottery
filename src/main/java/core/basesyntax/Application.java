package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        Lottery bal1 = new Lottery();
        Lottery bal2 = new Lottery();
        Lottery bal3 = new Lottery();
        System.out.println(
                "Color is: "
                        + bal1.color + "\n"
                        +"Number is: "
                        +bal1.numberofBall + "\n"
        );
        System.out.println(
                "Color is: "
                        + bal2.color + "\n"
                        +"Number is: "
                        +bal2.numberofBall + "\n"
        );
        System.out.println(
                "Color is: "
                        + bal3.color + "\n"
                        +"Number is: "
                        +bal3.numberofBall + "\n"
        );

    }
}
