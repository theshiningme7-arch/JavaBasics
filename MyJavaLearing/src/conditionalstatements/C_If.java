package conditionalstatements;
import java.util.Scanner;
public class C_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Value");
        int n = sc.nextInt();
        if(n != 0){
            if(n ==1){
                System.out.println("Switch is ON");
            }
        }else{
            System.out.println("Switch is off");
        }
    }
}
/*
if(){
    if(){
    ....
    }else{
        ...
        }
} 
        
*/