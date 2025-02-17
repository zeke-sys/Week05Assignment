package week05Assignment;

public interface Logger {
	
	public void log(String str);
	public void error(String str1);
	
	
	/*
	 * 1. Interface named Logger
	 * 2. Add two void methods to the Logger interface, each with a String as an argument (log, error)
	 * 3. Create two classes that implement the Logger interface (AsteriskLogger & SpacedLogger)
	 * 4. Implement the AsteriskLogger methods:
	 * Note:  The AsteriskLogger will use the asterisk or "*".
	 * a. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
	 * 
	 * b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
	 * ****************
	 * ***Error: Hello***
	 * ****************
	 * 5. Implement the SpacedLogger methods:
	 * Note:  The SpacedLogger should add a space or " " between each character of the String argument passed into its methods.
	 * a. If the log method received “Hello” as an argument, it should print H e l l o
	 * b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	 * 6.     Create a class named App that has a main method.
	 * a.  In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	 * b. Test both methods on both instances, passing in Strings of your choice.
	 * 
	 * */
	
	
	
	

} //end of class
