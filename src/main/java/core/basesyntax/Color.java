package core.basesyntax;

public enum Color {
    red,
    yellow,
    green,
    blue,
    purple;

    public Color getValueByInt(int index) {
        Color result = null;
        switch (index) {
            case 0 :
                result = Color.red;
                break;
            case 1 :
                result = Color.yellow;
                break;
            case 2 :
                result = Color.green;
                break;
            case 3 :
                result = Color.blue;
                break;
            case 4 :
                result = Color.purple;
                break;
            default:
        }
        return result;
    }
}
