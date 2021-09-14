import java.math.BigInteger;

public class IsPrime {
    public static void main(String[] args) {
        String num = "11";
        BigInteger integer = new BigInteger(num);
        if(integer.isProbablePrime(100)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }


        if (isPrime(13)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    private static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }else{
            for(int i=2; i<= num/2; i++){
                if((num % i) == 0){
                    return false;
                }

            }
            return true;
        }
    }
}
