package com.personal.learning;

public class ShutdownHook {
    public static void main(String args[]) {
        try {
            System.out.println("Inside Method Execution ...");

            // Runs just before JVM Shutdown, can be used to clean up memories and resources.
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {

                    System.out.println("Shutdown Hook is running ...");

                    // When we supply this statement inside shutdown, then the program would go to infinite loop as the System.exit
                    // would again call Shutdown Hook.
                    //System.exit(1);

                    //This will terminate the JVM Forcefully and Even Stops the Execution of Shutdown Hook
                    Runtime.getRuntime().halt(1);

                    System.out.println("Shutdown Hook Execution Completed ...");
                }
            });
        }
        finally {
            System.out.println("Executing Finally Block ...");
        }
        System.out.println("Main Method Terminating ...");
    }
}