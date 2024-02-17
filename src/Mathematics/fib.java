// package Mathematics;

import java.util.Scanner;

public class fib {

    int fibonacci (int n){
        if(n==0 || n==1){
            return n;
        }
        int a = 0 ; int b = 1;
        int c = 0;
        for (int i = 2 ; i<=n ; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return c;
    }



    public static void main(String[] args) {
       fib o = new fib();
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(o.fibonacci(n));
        sc.close();




    }
}

//  This solution requires space and auxilary space complexity is O(1)  , as we are using constant number os variables not dependent on n