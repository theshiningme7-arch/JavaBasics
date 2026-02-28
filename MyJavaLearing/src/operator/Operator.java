package operator;

public class Operator {
    public static void main(String[] args) {
        // int a = 10;//value 10 is assigned to a(variable)
        // int b = 20;
        // System.out.println("1: "+ (a>b));
        // System.out.println("2: "+ (a<b));
        // System.out.println("3: "+ (a>=b));
        // System.out.println("4:"+ (a<=b));
        // System.out.println("5:"+ (a==b));//LHS=RHS 
        // System.out.println("6:"+ (a!=b)); 
        // boolean c= true;
        // boolean d = false;
        // System.out.println("And "+(c&&d));//false 1*0=0
        // System.out.println("OR "+(c||d));//1+0=1 true
        // System.out.println("NOT "+(!c));//false !1 =0
        // int i = 3;//incremenet
        // // System.out.println("++i = " + (++i));//3+1=4
        // // System.out.println(i);//i=4

        // System.out.println("i++"+(i++));
        // System.out.println(i);//3+1=4
        // int j = 6;//decrement
        // // System.out.println("--j = "+(--j));//j=j-1=6-1=5 pre
        // // System.out.println(j);//5

        // System.out.println("j--"+ (j--));//post
        // System.out.println(j);//6-1= 5
        // int a = 6;
        // int b = 3;
        // System.out.println("&= "+ (a&b));
        // System.out.println("|= "+ (a|b));
        // System.out.println("^= " + (a^b));
        // System.out.println("~=  "+ (~b));//-3-1=-4
        // System.out.println("<<"+(5<<1));
        // System.out.println(">> "+ (20>>2));

        boolean result = (3>2)?true:false;
        System.out.println(result);
        String result2String = (9>=10)? "Right":"Wrong";
        System.out.println(result2String);
        int res3 =(3==3)? 1:0;
        System.out.println(res3);
    }
}
