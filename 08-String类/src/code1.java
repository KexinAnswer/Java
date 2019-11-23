import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code1 {
    /*static void shuffle(int[] arr){
        int len = arr.length;
        int n = len/2;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; ++i){
            arr1[i] = arr[i];
        }
        for(int i = 0; i < n; ++i){
            arr2[i] = arr[n+i];
        }

        for(int i = 0; i < n; i++){
            arr[2*i] = arr1[i];
            arr[2*i+1] = arr2[i];
        }
    }

    static void Print(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.printf("%d ",arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int count = 0;
        while(in.hasNext()){
            count = in.nextInt();
            for(int i = 0; i < count;  ++i){
                int n = in.nextInt();
                int k = in.nextInt();
                int[] arr = new int[2*n];
                for(int j = 0; j < 2 * n; ++j){
                    arr[j] = in.nextInt();
                }
                for(int j = 0; j < k; ++j){
                    shuffle(arr);
                }
                Print(arr);
            }
            System.out.printf("\n");
        }
    }

     */
    static void Print(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.printf("%d ",arr[i]);
        }
    }
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        for(int i = 0; i < count; ++i){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[2*n];
            for(int j = 0; j < 2 * n; ++j){
                int index = in.nextInt();
                int tmp = j+1;
                for(int l = 0; l < k; ++l){
                    if(tmp <= n){
                        tmp = 2 * (tmp -n);
                    }else{
                        tmp = tmp - n + 1;
                    }
                }
                arr[tmp-1] = index;
            }
            Print(arr);
        }
        System.out.printf("\n");
    }

     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        for(int i = 0; i < arr.size(); ++i){
            System.out.println(arr.get(i));
        }
    }
}

