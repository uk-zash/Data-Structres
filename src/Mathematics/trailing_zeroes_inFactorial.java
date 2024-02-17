// package Mathematics;

public class trailing_zeroes_inFactorial {

    int trailing_zeroes(int n){
        int sum = 0;
        int i = 5;
        while(i<=n){
            sum += n/i;
            i = i* 5;
        }
        return  sum;
    }


    public static void main(String[] args) {

        trailing_zeroes_inFactorial o = new trailing_zeroes_inFactorial();
        System.out.println(o.trailing_zeroes(10));

    }
}
