package combinatorpattern2;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern2.ValidateCarRegistration.ValidationResult;
import static combinatorpattern2.ValidateCarRegistration.ValidationResult.*;

public interface ValidateCarRegistration extends Function<Car, ValidationResult> {

    static  ValidateCarRegistration isValidCarNumber(){
        return car -> car.getCarnumber().startsWith("K") ? SUCCESS : NOT_VALID_CAR_NUMBER;
    }

    static  ValidateCarRegistration isValidCarToBeDriven(){
        return car -> Period.between(car.getYearofmanufacture(), LocalDate.now()).getYears()>60 ? IS_TOO_OLD_TO_BE_DRIVEN : SUCCESS;
    }

    static  ValidateCarRegistration isValidCarDriversId(){
        return car -> car.getDriverid().startsWith("DR") && car.getDriverid().length()==10 ? SUCCESS : NOT_A_VALID_ID;
    }

    static  ValidateCarRegistration isValidDriverPhoneNumber(){
        return car -> car.getDriverphonenumber().startsWith("07") && car.getDriverphonenumber().length()==10 ? SUCCESS : NOT_A_VALID_PHONE_NUMBER;
    }

    static ValidateCarRegistration isAnAdultDriver(){
        return car -> Period.between(car.getDriveryearofbirth(), LocalDate.now()).getYears()>18 ? SUCCESS :NOT_AN_ADULT;
    }

    static  ValidateCarRegistration isValidCarRegisteredCarDriver(){
        ValidateCarRegistration registered = car ->
                car.getDriverregistrationstatus().startsWith("Y") &&
                        car.getDriverregistrationstatus().contains("E") &&
                        car.getDriverregistrationstatus().endsWith("S")
                        ? SUCCESS : NOT_REGISTERED;
        return registered;
    }

    default ValidateCarRegistration and(ValidateCarRegistration other){
        return car -> {
            ValidationResult result=this.apply(car);
            return result.equals(SUCCESS) ? other.apply(car) :result;
        };
    }
    enum ValidationResult{
        SUCCESS,
        NOT_VALID_CAR_NUMBER,
        IS_TOO_OLD_TO_BE_DRIVEN,
        NOT_A_VALID_ID,
        NOT_A_VALID_PHONE_NUMBER,
        NOT_AN_ADULT,
        NOT_REGISTERED
    }
}
