/*
 * CodingBat Java Activity "makeBricks" from Logic-2 section.
 * codingbat.com
 */

public class testing 
{
    public static boolean closeFar(int numA, int numB, int numC)
    {
        return (Math.abs(numB - numA) < 2 && Math.abs(numC - numA) > 2) ||               
           (Math.abs(numC - numA) < 2 && Math.abs(numB - numA) > 2);
    }

    public static void main(String[] args)
    {
        System.out.println(closeFar(4, 4, 1));
    }
}