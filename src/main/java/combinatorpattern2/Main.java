package combinatorpattern2;

import java.time.LocalDate;
import static combinatorpattern2.ValidateCarRegistration.*;
public class Main {
    public static void main(String[] args) {
        Car car=new Car(
                "Toyota",
                "KCD 120D",
                LocalDate.of(1979,8,25),
                "Transporter John",
                "0756784765",
                "DRSWNKTY00",
                LocalDate.of(2000,3,9),
                "YES"
        );

        ValidationResult validationresults = isAnAdultDriver()
                .and(isValidCarDriversId())
                .and(isValidDriverPhoneNumber())
                .and(isValidCarRegisteredCarDriver())
                .and(isValidCarToBeDriven())
                .and(isValidCarNumber())
                .apply(car);

        System.out.println(validationresults);
    }
}
