package Enum;

public enum Methods {

    MATHEMATICAL {
        @Override
        public String toString() {
            return ("Математические вычисления");
        }
    },
    PRACTICAL {
        @Override
        public String toString() {
            return ("Практические вычисления");
        }
    }
}