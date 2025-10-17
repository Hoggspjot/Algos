package october.day171025.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);

        System.out.println(fib(n, mem));


    }

    public static long fib(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if(n <= 1) return n;

        long result = fib(n - 1, mem) + fib(n - 2, mem);
        mem[n] = result;
        return result;
    }

}
