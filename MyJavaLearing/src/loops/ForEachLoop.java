package loops;

public class ForEachLoop {
public static void main(String[] args) {
    int[] marks = {90, 95, 100, 80, 85};
    int total = 0;
    for(int m:marks){
        total += m; 
        System.out.println("Total marks ="+total);
    }
}
}
