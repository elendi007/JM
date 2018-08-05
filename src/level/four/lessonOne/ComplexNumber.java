package level.four.lessonOne;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object obj) {
        ComplexNumber complexNumber = (ComplexNumber) obj;
        return this.im == complexNumber.im & this.re == complexNumber.re;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

}
