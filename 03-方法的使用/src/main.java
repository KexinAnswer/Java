import java.util.Scanner;

public class main {

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int factorialNor(int n){
        int res = 1;
        for (int j = 1; j <= n; j++) {
            res *= j;
        }
        return res;
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static double add(double x, double y){
        return x + y;
    }
    public static void Swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int res = 0;
        // for (int i = 1; i <= num ; i++) {
        //     System.out.println(factorial(i));
        //     res += factorial(i);
        // }
        // System.out.println(res);

        //System.out.println(add(2,3));

        // int[] arr = {10, 20};
        // Swap(arr);
        // System.out.println(arr[0] + " " + arr[1]);

        // System.out.println(add(2,3));
        // System.out.println(add(1.1,2.2));

        // System.out.println(factorial(5));
        // System.out.println(factorialNor(5));


    }
}
