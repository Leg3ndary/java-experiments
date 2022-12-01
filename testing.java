/*
 * CodingBat Java Activity "makeBricks" from Logic-2 section.
 * codingbat.com
 */

public class testing 
{
    public static int gcf(int a, int b)
    {   
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
    
    public static void main(String[] args)
    {
        System.out.println(gcf(24, 12));
    }
}