package Formas;

public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    public double getLado() {
        return super.getBase();
    }

    public void set(double lado) {
        super.set(lado, lado);
    }

    public String toString() {
        return "Lado: " + super.getBase();
    }
}