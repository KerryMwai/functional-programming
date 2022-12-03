package predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without a Predicate");
        System.out.println(IsPhoneNumberValid("0787647588"));
        System.out.println(IsPhoneNumberValid("0687947588"));
        System.out.println(IsPhoneNumberValid("078764758"));
        System.out.println(IsPhoneNumberValid("0700011144"));

        System.out.println("With a Predicate");

        System.out.println(IsPhoneNumberValidPredicate.test("0787647588"));
        System.out.println(IsPhoneNumberValidPredicate.test("0687947588"));
        System.out.println(IsPhoneNumberValidPredicate.test("078764758"));
        System.out.println(IsPhoneNumberValidPredicate.test("078764758"));
        System.out.println(IsPhoneNumberValidPredicate.test("078764758"));

        //    Composite predicate
        System.out.println(
                "Is phone number valid and contains 3="+
                IsPhoneNumberValidPredicate.and(IsPhoneNumberValidAndContains3).test("0787647588")
        );
        System.out.println(
                "Is phone number valid and contains 3="+
                IsPhoneNumberValidPredicate.and(IsPhoneNumberValidAndContains3).test("078764375")
        );
        System.out.println(
                "Is phone number valid and contains 3="+
                IsPhoneNumberValidPredicate.and(IsPhoneNumberValidAndContains3).test("0787643588")
        );
        System.out.println(
                "Is phone number valid or contains 3="+
                        IsPhoneNumberValidPredicate.or(IsPhoneNumberValidAndContains3).test("0787645880")
        );
//        BiPredicate
        System.out.println(
                "Phone 1 starts with 09 and phone 2 ends with 06 ="+
                        BiPredicateFun.test("0845678", "945678")
        );
        System.out.println(
                "Phone 1 starts with 09 and phone 2 ends with 06 ="+
                        BiPredicateFun.test("0945678", "945678")
        );
        System.out.println(
                "Phone 1 starts with 09 and phone 2 ends with 06 ="+
                        BiPredicateFun.test("0945678", "7867806")
        );
    }

//    Normal function
    static boolean IsPhoneNumberValid(String phonenumber){
        return phonenumber.startsWith("07") && phonenumber.length()==10;
    }
    
//   Predicate function
    static Predicate<String>IsPhoneNumberValidPredicate=phonenumber->phonenumber.startsWith("07") && phonenumber.length()==10;

    static Predicate<String>IsPhoneNumberValidAndContains3=phonenumber->phonenumber.contains("3");

//    BiPredicate
    static BiPredicate<String,String>BiPredicateFun=
        (phone1,phone2)->(phone1.startsWith("09") && phone2.endsWith("06"));

}

