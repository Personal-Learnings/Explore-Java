package com.personal.learning;

public class Datatype {

    public static void main(String args[]) {

        // 1 Byte = 2^8 or 100000000 or 256. In java -128 0 127 = 256 bytes
        // No sign bit because java uses 2s Compliment so for sign bit (it takes the binary of bit reverse it and adds one.

        System.out.println("Byte " + Byte.MIN_VALUE + "   " + Byte.MAX_VALUE);
        System.out.println("Character " + Character.MIN_VALUE + "   " + Character.MAX_VALUE);
        System.out.println("Short " + Short.MIN_VALUE + "   " + Short.MAX_VALUE);
        System.out.println("Integer " + Integer.MIN_VALUE + "   " + Integer.MAX_VALUE);
        System.out.println("Long " + Long.MIN_VALUE + "   " + Long.MAX_VALUE);
        System.out.println("Float " + Float.MIN_VALUE + "   " + Float.MAX_VALUE);
        System.out.println("Double " + Double.MIN_VALUE + "   " + Double.MAX_VALUE);

    }
}
