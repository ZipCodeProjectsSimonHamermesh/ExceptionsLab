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

    public static int divide(int x, int y) throws DivisionByZeroException {
        if(y ==0){throw new DivisionByZeroException();}
        return x/y;
    }

    public static double squareRoot(double x) throws ComplexNumberException{

        if(x<= 0){throw new ComplexNumberException();}
        return Math.sqrt(x);
    }
}
