import java.math.BigInteger;

public class fibonacci {
    public static BigInteger of(int j){
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        for(int i = 1; i < j; i++){
            b = b.add(a);
            a = b.subtract(a);
      }
      return a;
    }
    public static void main(String[] args) {  
        for (int i = 1; i <= 200; i++) {  
             System.out.println(fibonacci.of(i) );
        }  
    }  

}