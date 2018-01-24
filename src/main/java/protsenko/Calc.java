package protsenko;

import java.util.Objects;

public final class Calc {

    private final int arg;

    public Calc(int arg) {
        this.arg = arg;
    }

    public Calc add(Calc arg) {
        return new Calc(this.arg + arg.arg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calc calc = (Calc) o;
        return arg == calc.arg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(arg);
    }
}
