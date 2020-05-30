package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        final Object value = Optional.ofNullable("Hello world")
                .orElseGet(() -> "default value");
        System.out.println(value);

        Optional.ofNullable("John@gmail.com")
                .ifPresentOrElse( email -> System.out.println("Sending email to .."+ email),
                                  ()-> System.out.println("Cannot send email...")
                                );
    }
}
