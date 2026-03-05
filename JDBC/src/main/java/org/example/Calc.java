package org.example;

public class Calc {
//    int add(int a,int b){
//        return a +b;
//    }
    //Using Generics
//    public <T extends Number> double add(T a, T b){
//        return a.doubleValue() + b.doubleValue();
//    }
    //For handling different types of arguments
//    public double add(Object a, Object b){
//        Double num1 = parseToDouble(a);
//        Double num2 = parseToDouble(b);
//        return num1+num2;
//    }
//    public double parseToDouble(Object val){
//        if(val instanceof Number){
//            return ((Number)val).doubleValue();
//        }
//        if(val instanceof String){
//            try{
//                return Double.parseDouble((String)val);
//            }
//            catch(NumberFormatException e){
//                throw new IllegalArgumentException("Enter number only ");
//            }
//        }
//        throw new IllegalArgumentException("Invalid Argument");
//    }
    //For parameterized
public double add(Object a, Object b) {
    Double num1;
    Double num2;
    if (a instanceof Number) {
        num1 = ((Number) a).doubleValue();
    }
    else if (a instanceof String) {
        try {
            num1 = Double.parseDouble((String) a);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Enter number only ");
        }
    }
    else{
        throw new IllegalArgumentException("Enter numbers only");
    }
    if (b instanceof Number) {
        num2 = ((Number) b).doubleValue();
    }
    else if (b instanceof String) {
        try {
            num2 = Double.parseDouble((String) b);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Enter number only ");
        }
    }
    else{
        throw new IllegalArgumentException("Enter numbers only");
    }
    return num1 + num2;
}

}
