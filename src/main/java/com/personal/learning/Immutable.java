package com.personal.learning;

/**
 *  How to Create a Immutable Object ?
 *      1. Class must be declared as final (So that child classes can’t be created).
 *      2. Data members in the class must be declared as final (So that we can’t change the value of it after object creation).
 *      3. A parameterized constructor to set desired values.
 *      4. Getter method for all the variables in it.
 *      5. No setters(To not have option to change the value of the instance variable).
 *
 *  What are the Advantages ?
 *      1. Immutable objects are thread-safe so you will not have any synchronization issues.
 *      2. Immutability makes it easier to parallelize your program as there are no conflicts among objects.
 *      3. References to immutable objects can be cached as they are not going to change.
 *
 *  Limitations:
 *      1. Immutability can have a performance cost, since when an object cannot be mutated we need to copy it if we want to write to it.
 *
 *  Classes should be immutable unless there's a very good reason to make them mutable.
 *  If a class cannot be made immutable, limit its mutability as much as possible.
 *
 */
public final class Immutable {

    private final String socialSecurity;

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public Immutable() {
        this.socialSecurity = "NO DATA";
    }

    public Immutable(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public Immutable formatSocialSecurity() {
        return new Immutable("Formatted SSN Number: " + this.socialSecurity);
    }
}

class TestImmutable {

    public static void main(String args[]) {

        Immutable immutable = new Immutable("111-11-1111");
        System.out.println(immutable.getSocialSecurity());

        immutable.formatSocialSecurity();
        System.out.println(immutable.getSocialSecurity());

        Immutable immutableFormatted = immutable.formatSocialSecurity();
        System.out.println(immutableFormatted.getSocialSecurity());

        Immutable immutableEmpty = new Immutable();
        System.out.println(immutableEmpty.getSocialSecurity());
    }
}