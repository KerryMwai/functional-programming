package consumers;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer kerry=new Customer("Kerry Wangamati","078463826374");
        Customer phillip=new Customer("Phillip Wangamati","0112345245");
        Customer daniel=new Customer("Daniel Nielson","068+123");
        Customer maison=new Customer("Andrew Madson","021345");
        Customer kevin=new Customer("Kevin Nyongesa","5678765");
        Customer robai=new Customer("Robai Nakhumicha","3565432");
//        Normal function
        greetCustomer(kerry);
        greetCustomerV2(daniel,true);
        greetCustomerV2(robai,false);
//        Consumer function interface
        greetCustomerConsumer.accept(kevin);
//        BiConsumer function interface
        greetCustomerBiConsumer.accept(phillip,false);
        greetCustomerBiConsumer.accept(maison,true);
    }
//Normal function
    static void greetCustomer(Customer customer){
        System.out.println(
                "Hello "+customer.customerName+" thanks for registering phone number "+customer.customerPhoneNumber
        );
    }
    static void greetCustomerV2(Customer customer, boolean showNumber){
        System.out.println(
                "Hello "+customer.customerName+" thanks for registering phone number "+(showNumber ? customer.customerPhoneNumber :"***********")
        );
    }
//    Consumer function
    static Consumer<Customer>greetCustomerConsumer=customer ->  System.out.println(
        "Hello "+customer.customerName+" thanks for registering phone number "+customer.customerPhoneNumber
);
//    BiConsumer function
    static BiConsumer<Customer,Boolean>greetCustomerBiConsumer=(customer,showNumber)->System.out.println(
            "Hello "+customer.customerName+" thanks for registering phone number "+(showNumber ? customer.customerPhoneNumber :"***********")
);

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
