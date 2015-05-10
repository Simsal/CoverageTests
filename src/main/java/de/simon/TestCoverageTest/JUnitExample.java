package de.simon.TestCoverageTest;

public class JUnitExample {
	 private static int result;          // Static variable where the result is stored

	    public void add(int n) {
	        result = result + n;
	    }

	    public void subtract(int n) {
	        result = result - 1;          //Bug : should be result = result - n
	    }

	    public void multiply(int n) {}     //Not implemented yet

	    public void divide(int n) {
	        result = result / n;
	    }

	    public void square(int n) {
	        result = n * n;
	    }

	    public void squareRoot(int n) {
	        for (; ;) ;                    //Bug : loops indefinitely
	    }

	    public void clear() {               // Cleans the result
	        result = 0;
	    }

	    public void switchOn() {          // Swith on the screen, display "hello", beep
	        result = 0;                   // and do other things that calculator do nowadays
	    }

	    public void switchOff() { }	     // Display "bye bye", beep, switch off the screen

	    public int getResult() {
	        return result;
	    }

}
