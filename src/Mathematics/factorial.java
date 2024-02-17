package Mathematics;


import java.util.Scanner;

//  Simple approach
public class factorial {

    int fact (int n){
        int res = 1;
        for (int i = 1 ; i<=n ; i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        factorial o = new factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((o.fact(n)));
    }
//  The time complexity is O(n) , aux Space  O(1)

}


// Recursive

class fact{

    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n* factorial(n-1);
    }



    public static void main(String[] args) {
        fact o = new fact();
        System.out.println(o.factorial(5));
    }
//    ime complexity is O(n) but the auxilary space complexiy is is O(n) as in recursion we have to store the values as each time function calls
//     SO that's why iterative approach is considered better
}
