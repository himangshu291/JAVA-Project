import java.util.Scanner;
class quiz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        String[] ques= {"\n1. Which of the following access modifiers makes a variable or method accessible only within its own class?\n\nA.public \nB.private \nC.protected \nD.default",
                        "\n2. In Java, which keyword is used to create a subclass from an existing class?\n\nA.extends \nB.subclass \nC.inherits \nD.implements",
                        "\n3. Which data type is used to store integer values without a fractional part?\n\nA.int \nB.float \nC.double \nD.boolean",
                        "\n4. Which loop in Java is used to iterate through a collection (e.g., an array or list)?\n\nA.while loop \nB.do-while loop \nC.for loop\nD.switch loop",
                        "\n5. What is the correct way to declare a constant variable in Java?\n\nA.final int PI = 3.14;\nB.const PI = 3.14; \nC.int PI = 3.14;\nD.static final double PI = 3.14;",
                        "\n6. Which method is called automatically when an object is created from a class?\n\nA.init() \nB.main() \nC.constructor \nD.finalize()",
                        "\n7. What does the 'static' keyword mean in Java when applied to a method or variable?\n\nA.The method or variable is accessible only within its own class. \nB.The method or variable belongs to the class rather than instances of the class. \nC.The method or variable can be accessed from other classes in the same package. \nD.The method or variable can only be used in a static context.",
                        "\n8. What is the purpose of the 'break' statement in Java's switch statement?\n\nA.It ends the current iteration of a loop.\nB.It exits the entire switch statement.\nC.It transfers control to the next case label.\nD.It is used to terminate the program.",
                        "\n9. Which Java keyword is used to explicitly throw an exception?\n\nA.raise \nB.throw \nC.exception \nD.catch",
                        "\n 10. In Java, what is the output of System.out.println(10/3);\n\nA.3.333 \nB.3.33333 \nC.3 \nD.3.0"
                       };
        String[] correct_ans= {"B","A","A","C","D","C","B","B","B","B","C"};
        System.out.println("===========================Welcome to the Quiz Game============================");
        System.out.println("Answer the following questions:");
        for(int i=0; i<ques.length; i++)
        {
            System.out.println(ques[i]);
            System.out.print("\nYour answer: ");
            String ans=sc.nextLine().toUpperCase();
            while(!ans.matches("[A-D]"))				//matches() method is used to check if a string matches a specific expression and It returns a boolean value.
            {
                System.out.println("Choose a valid answer (A, B, C, or D)!");
                System.out.print("\nYour answer: ");
                ans = sc.nextLine().toUpperCase();
            }
            if(ans.equals(correct_ans[i]))
            {
                System.out.println("Correct!");
                System.out.println(" ");
                score++;
            }
            else
            {
                System.out.println("Incorrect!");
                System.out.println("Correct answer is: "+correct_ans[i]);
            }
        }
        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is " + score + " out of " + ques.length);
    }
}


