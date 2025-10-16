package october.day161025.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println(fib(100));

    }

    public static long fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return (fibo(n - 1) + fibo(n - 2));
    }

    public static long fib(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
