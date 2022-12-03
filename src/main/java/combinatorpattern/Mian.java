package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Mian {
    public static void main(String[] args) {
        Customer customer=new Customer(
                "Kerry Wangamati",
                "kerrywangamati@gmail.com",
                "0798567357",
                LocalDate.of(2000,12,30)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

//        Using the combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        if(result!=ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }else {
            System.out.println(result);
        }
    }
}
