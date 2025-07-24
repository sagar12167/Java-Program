
import java.util.Scanner;
import java.util.Random;

public class Arithmetic_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter Your Name : "); // Asking to user name
        String name = sc.nextLine();
        System.out.println("welcome to the Questions "+name + "!.."); // Welcome message to user
        int a,b ,score=0;// number a , b and the score
        a=random.nextInt(30);
        b=random.nextInt(30);
        System.out.print("ADD to number "+ a +" + " + b+ ": "); // first question
        int c=sc.nextInt();
        /*FirstQuestion first = new FirstQuestion();
        first.firstquestion(c);*/
        if(c==(a+b)){
            score+=2;
            System.out.println(" The answer is correct");
        }else{
            //System.out.println("You have enter the Answer = "+ c );
            System.out.println("The Correct Answer is "+ (a+b));
        }
        System.out.print("ADD to number "+ a +" - " + b + ": "); // Second question
        int d=sc.nextInt();
        if(d==(a-b)){
            score+=2;
            System.out.println("The answer is correct");
        }
        else{
            // System.out.println("You have enter the Answer = "+ d );
            System.out.println("The Correct Answer is "+(a-b));
        }
        System.out.print("ADD to number "+ a +" * " + b+ ": "); // Third question
        int e=sc.nextInt();
        if(e==(a*b)){
            score+=2;
            System.out.println("The answer is correct ");
        }else{
            // System.out.println("You have enter the Answer = "+ e );
            System.out.println("The Correct Answer is "+ (a*b));
        }
        System.out.print("ADD to number "+ a +" / " + b+ ": ");  //Fourth question
        float f=sc.nextFloat();
        float g = (float) a/b;
        if(f==g){
            score+=2;
            System.out.println("The answer is correct");
        }else{
            // System.out.println("You have enter the Answer = "+ f );
            System.out.println("The Correct Answer is " + g);
        }
        System.out.println();
        System.out.println("Your score is : " + score +"/8"); // Display the score
    }
}
