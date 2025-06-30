public class Fibo {
    public static int fibo(int x) {
        if(x < 0) throw new IllegalArgumentException();
        if(x > 1) return fibo(x-1) +  fibo(x-2);
        return 1;
    }
}
