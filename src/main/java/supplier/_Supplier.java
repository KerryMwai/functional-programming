package supplier;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
//        The normal function
        System.out.println(getDBConnection());
//        The supplier
        System.out.println(getDBConnectionSupplier.get());
        System.out.println(getNames.get());
    }
//Normal function
    static String getDBConnection(){
        return "jdbc://localhost:3308/users";
    }

//    Supplier
    static  Supplier<String>getDBConnectionSupplier=
        ()->"jdbc://localhost:3308/users";

    static Supplier<List<String>>getNames=
            ()->List.of(
                    "Kerry Wangamati",
                    "Phillip Juma",
                    "Kevin Nyongesa",
                    "Robai Nakhumicha"
            );
}
