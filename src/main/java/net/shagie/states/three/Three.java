package net.shagie.states.three;

public class Three implements Zero, One, Two {
    int value;

    public Three() {
        value = 0;
    }

    public Zero start() {
        return this;
    }

    public int build() {
        return value;
    }

    public Three zero() {
        value *= 2;
        return this;
    }

    public Three one() {
        value *= 2;
        value += 1;
        return this;
    }

}
