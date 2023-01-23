public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int num = 10;
        num = 15;
        System.out.println(num);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
