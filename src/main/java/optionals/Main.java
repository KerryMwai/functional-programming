package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Object value = Optional.ofNullable("How are you doing")
//                .orElseGet(() -> "Default value");

//        String value = Optional.ofNullable("Hello men how are you people")
//                .orElseThrow(() -> new IllegalStateException("Oops wrong value"));

//        Optional.ofNullable("kerrywangamati@gmail.com")
//                        .ifPresent(email-> System.out.println("Sending message to "+email));
//        Optional.ofNullable(null)
//                        .ifPresent(email-> System.out.println("Sending message to "+email));
        Optional.ofNullable("phillip@gmail.com")
                .ifPresentOrElse(email-> System.out.println("Sending message to "+email),
                        ()->{
                            System.out.println("Cannot send an message");
                        }
                );
        Optional.ofNullable(null)
                      .ifPresentOrElse(
                              email-> System.out.println("Sending message to "+email),
                              ()->System.out.println("Cannot send an message")
                              );
    }
}
