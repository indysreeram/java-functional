package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Sreeram", GENDER.MALE),
                new Person("Nivethiha", GENDER.FEMALE),
                new Person("Alex", GENDER.MALE),
                new Person("Mike",GENDER.PREFER_NOT_TO_SAY)
        );


        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(name -> name.length())
                .forEach(System.out::println);


    }


    static class Person {
        private final String name;
        private GENDER gender;

        public Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum GENDER {
        MALE,FEMALE,PREFER_NOT_TO_SAY
    }

}
