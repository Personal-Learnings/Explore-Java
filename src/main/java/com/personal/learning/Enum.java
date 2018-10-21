package com.personal.learning;

public class Enum {

    /*
        1. Enums are used to represent a group of named constants
        2. Implicitly extend java.lang.Enum class
        3. Enums can implement many interfaces.
        4. Internally the enum Weekday is converted as below
        5. toString() method is overridden in java.lang.Enum class, which returns enum constant name.

            class Weekday
            {
                 public static final Weekday MONDAY = new Weekday("BLUE");
                 public static final Weekday TUESDAY = new Weekday("GREEN");
                 ...and so on
            }
     */
    public enum Weekday {

        // Implicitly these below statement will create a no arg Constructor and One Arg Constructor
        MONDAY("BLUE"),
        TUESDAY("GREEN"),
        WEDNESDAY("YELLOW"),
        THURSDAY("ORANGE"),
        FRIDAY("BROWN");

        private Weekday nextDay;

        private String dressColor;

        static {
            MONDAY.nextDay = TUESDAY;
            TUESDAY.nextDay = WEDNESDAY;
            WEDNESDAY.nextDay = THURSDAY;
            THURSDAY.nextDay = FRIDAY;
            FRIDAY.nextDay = MONDAY;
        }

        public Weekday getNextDay() {
            return nextDay;
        }

        public String getDressColor() {
            return dressColor;
        }

        //Always ENUM Constructors will be private
        Weekday(String dressColor) {
            this.dressColor = dressColor;
        }
    }

    public static void main(String args[]) {

        System.out.println("Day " + Weekday.MONDAY.ordinal() + ": " + Weekday.MONDAY);
        System.out.println("Dress Color: " + Weekday.MONDAY.dressColor);
        System.out.println("Day " + Weekday.MONDAY.nextDay.ordinal() + ": " + Weekday.MONDAY.nextDay);
        System.out.println("Dress Color: " + Weekday.MONDAY.getNextDay().getDressColor());
        System.out.println("Day " + Weekday.TUESDAY.getNextDay().ordinal() + ": " + Weekday.TUESDAY.getNextDay());
        System.out.println("Dress Color: " + Weekday.TUESDAY.getNextDay().getDressColor());
    }
}