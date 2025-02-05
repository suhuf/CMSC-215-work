import java.math.BigInteger;

public class bignumbertest
{
    public static void  main(String[] args){

        BigInteger num = new BigInteger("92222222222222222222222222222222222222222222222222222222222222222222");
        BigInteger b = new BigInteger("2");

        BigInteger c = num.multiply(b);

        System.out.println(c);

        // wont work for big integer  System.out.println(num * b);



    }

}
