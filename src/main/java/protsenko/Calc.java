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

    public Calc diff(Calc arg) {
        return this.add(arg.neg());
    }

    public Calc neg() {
        return new Calc((-1) * this.arg);
    }

    public Calc square() {
        return new Calc(this.arg * this.arg);
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
