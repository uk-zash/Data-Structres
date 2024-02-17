// package Mathematics;

public class Palindrome {
    boolean isPal(int n){
        int rev = 0;
        int temp = n;
        while(n!=0){
            int ld = n%10;
            rev = rev*10 + ld;
            n = n/10;

        }




        return (rev == temp);
    }


    public static void main(String[] args) {
        Palindrome o = new Palindrome();

        System.out.println(o.isPal(131));

    }
}


// Time complexity of this algorithm is O(D) where D is the number of digits