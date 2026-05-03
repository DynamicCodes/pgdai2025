import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;


interface Add {
    int sum(int a, int b);
}

class LambdasDemo {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;

        System.out.println(add.sum(3, 5));

        //No parameters (takes nothing)
      //👉 Use when the lambda doesn’t need input
       Supplier<String> greet = () -> "Hello!";

        System.out.println(greet.get());

        //One parameter
      Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));

      //Multiple parameters
      BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 9));
      
    }
}
