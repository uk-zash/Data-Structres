package Mathematics;
//
//public class LCM {
//
//     int lcm(int a , int b){
//
//        int res  = Math.max(a , b);
//        while(true){
//            if((res%a==0) &(res%b==0)){
//                return res;
//            }
//            res++;
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        LCM o = new LCM();
//        System.out.println(o.lcm(2,3));
//
//
////        Time complexity of this code is O(a*b - max(a,b))
//    }
//}


class Euclid{

    int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b , a % b);
    }

    int lcm (int a , int b){
        return a*b/gcd(a , b);
    }


    public static void main(String[] args) {
        Euclid o = new Euclid();
        System.out.println(o.lcm(2,3));
//        Time complexity of this algorithm is O(log(min(a , b))
    }



        }