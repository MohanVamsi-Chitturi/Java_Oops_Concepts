import java.util.Scanner;
public class BinaryEquivalent
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        BinaryEquivalent b = new BinaryEquivalent();
        String m = b.Binary(n);
        System.out.println("Binary Equivalent:"+m);
    }
    String Binary(int x)
    {
        if(x > 0)
        {
            int a = x % 2;
            x = x / 2;
            return a + "" + Binary(x);
        }
        return "";
    }
}