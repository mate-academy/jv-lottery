package core.basesyntax;

public enum Color {
    YELLOW {
        @Override
        public String toString() {
            return "Yellow";
        }
    },
    GREEN {
        @Override
        public String toString() {
            return "Green";
        }
    },
    BLUE {
        @Override
        public String toString() {
            return "Blue";
        }
    },
    RED {
        @Override
        public String toString() {
            return "Red";
        }
    }
}
