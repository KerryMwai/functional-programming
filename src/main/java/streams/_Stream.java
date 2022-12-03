package streams;

import java.util.List;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people=List.of(
                new Person("John", MALE,32),
                new Person("Alice", FEMALE,45),
                new Person("Phillip", MALE,17),
                new Person("Debby", FEMALE,23),
                new Person("Paul", MALE,26),
                new Person("Linet", FEMALE,55),
                new Person("Kevin", MALE,33),
                new Person("Elizabeth", FEMALE,60),
                new Person("Bill", NOT_DEFINED,32)
        );

//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
//                .forEach(System.out::println);

//        boolean allfemales = people.stream()
//                .noneMatch(person -> NOT_DEFINED.equals(person.gender));
//        System.out.println(allfemales);

//        boolean males = people.stream()
//                .anyMatch(person -> MALE.equals(person.gender));
//        System.out.println(males);

        boolean allnondefined = people.stream()
                .allMatch(person -> NOT_DEFINED.equals(person.gender));
        System.out.println(allnondefined);
    }
    static class Person{
        private final String name;
        private final Gender gender;
        private final Integer age;

        Person(String name,Gender gender,Integer age) {
            this.name = name;
            this.gender=gender;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE,NOT_DEFINED
    }
}
