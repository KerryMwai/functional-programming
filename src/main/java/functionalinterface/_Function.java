package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
//        Function one argument and produces one result
        int increment=IncrementByOne(20);

        System.out.println(increment);

        int num2=IncrementBy20.apply(45);
        System.out.println(num2);

        int multiply=MultiplyBy10.apply(200);
        System.out.println(multiply);

        Function<Integer, Integer> IncrementByOneAndThenMultiplyByTen = IncrementBy20.andThen(MultiplyBy10);

        System.out.println(IncrementByOneAndThenMultiplyByTen.apply(125));

//        Function two arguments and produces one result
        int incrementAndMultiply1=IncrementAndMultiply(12,41);
        System.out.println(incrementAndMultiply1);
        int incrementAndMultiply2=BiFunctionIncrementAndMultiply.apply(12,41);
        System.out.println(incrementAndMultiply2);
    }

    static Function<Integer,Integer>IncrementBy20=number->number+20;
    static Function<Integer,Integer>MultiplyBy10=number->number*10;
    static BiFunction<Integer,Integer,Integer>BiFunctionIncrementAndMultiply=
            (num1,num2)->(num1+10)*num2;

    static int IncrementAndMultiply(int num1, int num2){
        return (num1+10)*num2;
    }
    static int IncrementByOne(int num){
        return num+1;
    }

}
