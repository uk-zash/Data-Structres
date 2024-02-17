package Mathematics;
// public class Greatest_CD {
//
//     void GCD(int a , int b){
//         int res = Math.min(a , b);
//         while (res>0){
//             if ((a%res ==0) & (b%res ==0)){
//                 // System.out.println(res);
//                 break;
//
//             }
//             res--;
//
//         }
//     }
//
//
//
//
//     public static void main(String[] args) {
//         Greatest_CD o = new Greatest_CD();
//         o.GCD(4,6);
// //    Time complexity of this algorithm is O(min(a , b))
//
//     }
//
// }


class Euclid1{

    int gcd (int a , int b){
        if (b==0){
            return a;
          
        }

        return gcd(b , a%b);
    }

    

    public static void main(String[] args) {
        Euclid1 ob = new Euclid1();
        System.out.println(ob.gcd(100,25));
    }

}