package Analysis_of_algorithm;

public class Sum_of_n {
    public int funct(int[] n , int a){
        int sum = 0;
        for (int i= 1 ; i<a; i++){

               sum = sum + n[i];

        }
        return sum;
    }

    public static void main(String[] args) {

        Sum_of_n o = new Sum_of_n();
        int[] n = {32,32,12,32};
        int a = n.length;
        int b = o.funct(n , a);
        System.out.println(b);

    }

}
