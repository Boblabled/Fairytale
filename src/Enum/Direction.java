package Enum;

public enum Direction {

    UP {
        @Override
        public String toString() {
            return ("вверх");
        }
    },
    DOWN {
        @Override
        public String toString() {
            return ("вниз");
        }
    }
}

