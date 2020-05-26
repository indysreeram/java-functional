package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Sreeram",GENDER.MALE),
                new Person("Nivethiha",GENDER.FEMALE),
                new Person("Alex",GENDER.MALE)
        );

        System.out.println("Imperative approach !!");

        List<Person> femalesI = new ArrayList<>();

        for (Person person:people)
              {

                  if(GENDER.FEMALE.equals(person.gender)){
                      femalesI.add(person);
                  }

        }

        for (Person female:femalesI)
              {

                  System.out.println(female);

        }


        System.out.println("Declarative approach ");
        List<Person> females = people.stream()
                               .filter(person -> GENDER.FEMALE.equals(person.gender))
                                .collect(Collectors.toList());

                females.forEach(System.out::println);

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
        MALE,FEMALE
    }
}
