package conditionalstatements;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----MENU----");
        System.out.println("1.Add, 2. Sub, 3.Mul, 4.Div, 5.Mod");
        System.out.println("Enter Your choice");
        int choice = sc.nextInt();
        int a = 10;
        int b =20;
        switch(choice){
            case 1:
            System.out.println("Add= "+(a+b));
            
            case 2:
            System.out.println("Sub= "+(a-b));
            
            case 3:
            System.out.println("Mul = "+ (a*b));
            
            case 4:
            System.out.println("Div= "+(a/b));
            break;
            case 5:
            System.out.println("Mod= "+(a%b));
            break;
        default:
            System.out.println("Enter a valid choice.");

        }
    }
}
