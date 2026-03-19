import java.util.*;

class Function2
{
    public static int Addition(int Value1, int Value2)
    {
        int Result = 0;
        Result = Value1 + Value2;
        return Result;
    }
    
    public static void main(String[] args) 
    {
        int No1 = 0, No2 = 0, Ans = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter first number : ");
        No2 = sobj.nextInt();

        Ans = Addition(No1, No2);

        System.out.println("Addition is : "+Ans);
        
    }
}