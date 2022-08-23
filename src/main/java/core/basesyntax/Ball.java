package core.basesyntax;

public class Ball {
    private int nomber;
    private String color;

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "nomber=" + nomber
                + ", color='" + color + '\''
                + '}';
    }
}
