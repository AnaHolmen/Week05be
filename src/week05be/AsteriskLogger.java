package week05be;


public class AsteriskLogger implements Logger {  // Created an AsteriskLogger class that implements the Logger interface

    @Override
    public void log(String log) {
        System.out.println("***" + log + "***");    // Log method that prints the message out between three asterisks on either side    
    }

    @Override
    public void error(String error) {
        System.out.println("****************" + "*".repeat(error.length()));
        System.out.println("***ERROR: " + error + "***"); // Error method that prints out ERROR: + the message received in a box of asterisks.
        System.out.println("****************" + "*".repeat(error.length()));
    }
}