import Formas.*;

public class call_semana2_apoio {
    public static void main(String[] args) {
        Paralelogramo p = new Paralelogramo(4, 1, Math.PI / 4.0);
        Retangulo r = new Retangulo(3, 2);
        Quadrado q = new Quadrado(1);
        q.set(3);
        System.out.println(q.toString());
    }
}