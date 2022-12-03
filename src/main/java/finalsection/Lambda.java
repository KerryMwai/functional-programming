package finalsection;

import java.util.function.BiFunction;

public class Lambda {
    public static void main(String[] args) {
        BiFunction<String, Integer, String>upperCaseName=(name,age)->{
            if(name.isBlank())
                throw new IllegalStateException("No name was provided");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Dominic", 20));
        System.out.println(upperCaseName.apply("", 50));
    }
}
