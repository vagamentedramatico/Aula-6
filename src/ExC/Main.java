package ExC;

import ExC.Retangulo;

public class Main {

    public static void main(String[] args) {
        Retangulo a = new Retangulo(2, 3);
        Retangulo b = new Retangulo(3);

        System.out.println(a.gerArea());
        System.out.println(b.isQuadrado());
        System.out.println(b.getDiagonal());
        System.out.println(a.getPerimetro());
    }
}
