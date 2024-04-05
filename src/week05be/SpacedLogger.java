package week05be;


public class SpacedLogger implements Logger { // Created a class that implements the Logger interface

    @Override
    public void log(String log) {
        char[] logChars = log.toCharArray();

        for (char a : logChars) {
            System.out.print(a);
            System.out.print(" ");
        }
    }

    @Override
    public void error(String error) {
        System.out.print("Error: ");
        char[] errorChars = error.toCharArray();

        for (char b : errorChars) {
            System.out.print(b);
            System.out.print(" ");
        }
    }




}