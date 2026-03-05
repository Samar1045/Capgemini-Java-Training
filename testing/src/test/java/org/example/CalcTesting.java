package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTesting {
    // For non parameterized method
//    @Test
//    void addTest(){
//        Calc calc = new Calc();
//        int result = calc.add(10,20);
//        Assertions.assertEquals(30,result);
    //For parameterized method
//    @ParameterizedTest
//    @CsvSource(
//            {
//                    "10,20,30",
//                    "5,2,7",
//                    "-10.5,10.5,0"
//            }
//    )
//    void Test(int a, int b, int expected){
//        Calc calc=new Calc();
//        int result = calc.add(a,b);
//        Assertions.assertEquals(expected,result);
//    }
    // Using generics
//    void Test(double a, double b, double expected){
//        Calc calc=new Calc();
//        double result = calc.add(a,b);
//        Assertions.assertEquals(expected,result);
//    }
    //For handling exceptions for non parameterized
//    @Test
//    void addInvalidStringTest(){
//        Calc calc = new Calc();
//        Assertions.assertThrows(IllegalArgumentException.class,()->calc.add(11,"25"));
//    }
    // For handling exceptions for parameterized
    @ParameterizedTest
    @CsvSource(
            {
                    "'11',23",// fails for this as both are numeric and it expects illegalArgumentException
                    "34,'hello'"
            }
    )
    void addInvalidStringTest(String a, String b){
        Calc calc= new Calc();
        Assertions.assertThrows(IllegalArgumentException.class,()->calc.add(a,b));
    }
}
