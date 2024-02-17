 package Mathematics;

public class count_digits {

    void count(int n){
        int res = 0;
        while (n>0){
            n = n/10;
            res++;

        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        count_digits obj = new count_digits();
        obj.count(345235);

    }
}

// Time complexity of this algorithm is O(D) where D is the number of Digits
