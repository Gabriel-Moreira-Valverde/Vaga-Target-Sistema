package vaga1;

public class Verificar {
    public static boolean quadradoPerfeito(int x) {
        int s = (int) Math.sqrt(x);
        return s * s == x;
    }
        
    public static boolean pertenceAFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        return quadradoPerfeito(5 * n * n + 4) || quadradoPerfeito(5 * n * n - 4);
    }
}
