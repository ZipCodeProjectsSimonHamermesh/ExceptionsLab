/**
 * Created by simonhamermesh on 2/19/16.
 */
public class Calculator{

    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x-y;
    }

    public static int multiply(int x, int y){
        return x*y;
    }

    public static int divide(int x, int y) throws Exception {
        if(y ==0){throw new Exception();}
        return x/y;
    }

}
