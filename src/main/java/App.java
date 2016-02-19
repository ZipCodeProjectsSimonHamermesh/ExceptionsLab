/**
 * Created by simonhamermesh on 2/19/16.
 */
public class App {

    public static void main(String[] args) {

            System.out.println(Calculator.add(1, 2));
            System.out.println(Calculator.add(2, 3));

            System.out.println(Calculator.subtract(2,1));
            System.out.println(Calculator.subtract(3, 2));

            System.out.println(Calculator.multiply(1, 2));
            System.out.println(Calculator.multiply(2, 3));

        try{
            System.out.println(Calculator.divide(4,2));
        } catch (DivisionByZeroException  e){
            System.out.println("There has been an error");
        }


        try{
            System.out.println(Calculator.divide(2,0));
        } catch (DivisionByZeroException  e){
            System.out.println("There has been an error");
        }

        try{
            System.out.println(Calculator.squareRoot(4));
        } catch (ComplexNumberException e){
            System.out.println("There has been an error");
        }

        try{
            System.out.println(Calculator.squareRoot(0));
        } catch (ComplexNumberException e){
            System.out.println("There has been an error");
        }


    }
}
