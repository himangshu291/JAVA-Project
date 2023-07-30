import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int num1,num2, result,opr;
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            try
            {
                System.out.println("\n==================Basic Calculator==================");
                System.out.print("Enter first number :");
                num1=sc.nextInt();
                System.out.print("Enter second number: ");
                num2=sc.nextInt();
                System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Mod");
                System.out.print("Choose any option:");
                opr=sc.nextInt();
                sc.nextLine();
                switch(opr)
                {
                    case 1:
                        result = num1 + num2;
                        System.out.println("Sum of "+num1+" and "+num2+" is:"+result);
                        break;
                    case 2:
                        result=num1 - num2;
                        System.out.println("Sum of "+num1+" and "+num2+" is:"+result);
                        break;
                    case 3:
                        result=num1 * num2;
                        System.out.println("Sum of "+num1+" and "+num2+" is:"+result);
                        break;
                    case 4:
                        result=num1 / num2;
                        System.out.println("Sum of "+num1+" and "+num2+" is:"+result);
                        break;
                    case 5:
                        result=num1 % num2;
                        System.out.println("Sum of "+num1+" and "+num2+" is:"+result);
                        break;
                    default:
                        System.out.println("Invalid option!");
                        break;
                }
                System.out.print("\nDo you want to calculate again?(Yes/No):");
                play=sc.nextLine().toLowerCase();
            }
            catch(ArithmeticException e)
            {
                System.out.println("A number can't divide by zero");
                System.out.println("Try again!");
            }
            catch(Exception e1)
            {
                System.out.println("An Exception occurred!");
                e1.printStackTrace();
            }
        }
    }
}