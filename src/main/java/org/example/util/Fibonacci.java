package org.example.util;

public class Fibonacci {
    public long getRicorsiva(Long n) {
        if (n == 0)
            return 1L;

        if (n.equals(1L))
            return 1L;
        return getRicorsiva(n - 1) + getRicorsiva(n - 2);

    }

    public void getIterativa(long n) {
        long n1 = 0, n2 = 1, result, i;
        for (i = 0; i < n; i++) {
            if (i <= 1) {
                result = 1;
            } else {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
            }
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        final long LIMIT = 0L;
        Timer t = new Timer();
        t.start();
        for (long i = 1; i < LIMIT; i++) {
            long fibonacci = f.getRicorsiva(i);
            System.out.println("Fibonacci " + i + " -> " + fibonacci);
        }
        f.getIterativa(42L);
        t.stop();
        long elapsed = t.elapsedTime();
        System.out.println("Elapsed Time: " + elapsed + " milliseconds");
    }

}