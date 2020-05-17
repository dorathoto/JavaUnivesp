package Formas;

public class Paralelogramo {
    private double _base;
    private double _altura;
    private double _angulo;

    public Paralelogramo(double base, double altura, double angulo) {
        this._base = base;
        this._altura = altura;
        this._angulo = angulo;
    }

    // metodo maromba da base :)
    public double OQuetemAiNaBasePoh() {
        return _base;
    }

    public void colocaValorAiNaBasePoh(double valor) {
        _base = valor;
    }

    // arcaico encapsulamento
    public double getBase() {
        return this._base;
    }

    public void setBase(double value) {
        this._base = value;
    }

    public double getAltura() {
        return this._altura;
    }

    public double getAngulo() {
        return this._angulo;
    }

    public void SetValores(double base, double altura, double angulo) {
        this._base = base;
        this._altura = altura;
        this._angulo = angulo;
    }

    public String toString() {
        var txt = "\nbase.: " + this._base;
        txt += "\nAltura.: " + this._altura;
        txt += "\nAngulo.: " + this._angulo;
        txt += "----------------------------";

        return txt;
    }

    /// b * h
    public double calcularArea() {
        return (this._base * this._altura);
    }

    /// 2 * (b * h)
    public double calcularPerimetro() {
        return 2 * (_base * _altura);
    }
}