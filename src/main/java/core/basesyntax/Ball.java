package core.basesyntax;

import javax.swing.text.rtf.RTFEditorKit;

public class Ball {
    private Colors color;
    private int number;

    public Ball(Colors color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.number + " " + this.color;
    }

    public enum Colors {
        WHITE, BLACK, YELLOW, BLUE, RED, GREEN, BROWN
    }


}