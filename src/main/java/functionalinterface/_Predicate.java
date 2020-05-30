package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        System.out.println( "Phone number is valid and contains 3 = "+
                isPhoneNumberValidPredicate.and(contains3).test("07000000003"));
        System.out.println( "Phone number is valid and contains 3 = "+
                isPhoneNumberValidPredicate.and(contains3).test("09000000003"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){

        return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() ==11;


    static  Predicate<String> contains3 =
            phoneNumber -> phoneNumber.contains("3");
}
