import java.util.*;

public class Calculator 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int choice = sc.nextInt();

        int Addition = a + b;
        int Substraction = a - b;
        int Multipliction = a * b;
        float Division = a / b;
        int Module = a % b;

        switch(choice)
        {
            case 1 : System.out.println(Addition);
            break;
            case 2 : System.out.println(Substraction);
            break;
            case 3 : System.out.println(Multipliction);
            break;
            case 4 : if(b == 0){
                      System.out.println("Invalid Division");
            }
            else{
                System.out.println(Division);
            }
            break;
            case 5 : if(b == 0){
                System.out.println("Invalid Division");
      }
      else{
        System.out.println(Module);
      }
            break;
            default : System.out.println("Invalid Choice");
        }
    }
}
