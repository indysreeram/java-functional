package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        //Function example takes 1 argument and produces one argument
        final int increment = incrementByOne(1);
        System.out.println(increment);

        final Integer increment2 = incrementByOneFunction.apply(1);

        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        final Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction example takes 2 argument and produces one argument

        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneAndMultiplyByFunction.apply(4, 100));

    }

    static  Function<Integer,Integer> incrementByOneFunction =
            number -> number+1;


    static Function<Integer,Integer> multiplyBy10Function =
            number -> number * 10;

    static int incrementByOne(int number){
        return number+1;
    }

   static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBY){
        return (number + 1) * numToMultiplyBY;
    }
}
