/**
 * Created by simonhamermesh on 2/19/16.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testCalculator_add_testAddition(){

        assertTrue(Calculator.add(1,2) == 3);

    }

    @Test
    public void testCalculator_subtract_testSubtraction(){

        assertTrue(Calculator.subtract(3,2) == 1);

    }

    @Test
    public void testCalculator_multiply_testMultiplication(){

        assertTrue(Calculator.multiply(2,3) == 6);

    }

    @Test
    public void testCalculator_divide_testDivisionValidInputs(){
        try{ assertTrue(Calculator.divide(4,2) == 2);} catch (DivisionByZeroException e){
            System.out.println("There has been an Arithmetic Error");
        }

    }



    @Test
    public void testCalculator_divide_testDivisionByZero(){

       try{ assertTrue(Calculator.divide(2,0) == 0);} catch (DivisionByZeroException e){
           System.out.println("There has been an Arithmetic Error");
       }

    }

    @Test
    public void testCalculator_squareRoot_testValidInput(){

        try{ assertTrue(Calculator.squareRoot(4) == 2);} catch (ComplexNumberException e){
            System.out.println("That number produces a complex number.");
        }

    }

    @Test
    public void testCalculator_squareRoot_testInvalidInput(){

        try{ assertTrue(Calculator.squareRoot(-4) == 2);} catch (ComplexNumberException e){
            System.out.println("That number produces a complex number.");
        }

    }



}
