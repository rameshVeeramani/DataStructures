import java.math.BigInteger;

public class Mlnumber
{

    /*
    * Reason that the below code has different exec time for different java vesion 8 , 10 , 12
    *
    * The reason been that different algo is used when the multiplication is invloves big integer
    *
    * karatasuba, toomkcook are the different methods that are invokded
    * */

    public static void main (String ... args){

        BigInteger b = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(b);

        for(int i =0;i<5;i++){
            b = b.multiply(b).subtract(BigInteger.ONE);
        }
        System.out.println(b);
        System.out.println(b.bitCount());
    }
}
