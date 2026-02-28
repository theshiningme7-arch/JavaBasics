package conditionalstatements;

public class EnhancedSwitch {
public static void main(String[] args) {
    // -> = lambda
    String c ="Sun";
    String result = switch (c) {
        case "Mon","Tue","Wed","Thu","Fri"-> "Weekday";
        case "Sat","Sun"->{
            System.out.println("Weekend");
            yield "Hurrah!!";
        }
        default->"Enter vlaid day with  1st 3 letter and 1st letter as capital letter.";
       
} ;
System.out.println("result = "+ result);
}
}
