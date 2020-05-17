package Formas;

public class Retangulo extends Paralelogramo {
    public Retangulo(final double lado1, final double lado2) {
        super(lado1, lado2, Math.PI / 2.0);

    }

    public double getLado1() {
        return super.getBase();
    }

    public double getLado2() {
        return super.getAltura();
    }

    public void set(final double lado1, final double lado2) {
        super.SetValores(lado1, lado2, Math.PI / 2.0);
    }

    public String toString() {
        return "Lado1:" + super.getBase() + " lado2:" + super.getAltura();
    }
}