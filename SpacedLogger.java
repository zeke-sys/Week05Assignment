package week05Assignment;

public class SpacedLogger implements Logger {

	@Override
	public void log(String str) {
		for (int i = 0; i < str.length(); i++) { //loop through each character in the string
			System.out.print(str.charAt(i));
			
			//print a space after each character except the last one
			if (i < str.length() - 1) {
				System.out.print(" ");
			}
		}//end of loop
	}

	@Override
	public void error(String str1) {
		
		//Print "ERROR: " preceding the spaced out input
		System.out.print("\nERROR: ");
		
		for (int i = 0; i < str1.length(); i++) { //loop through each character in the string
			System.out.print(str1.charAt(i));
			
			//print "ERROR: " preceding the String with space in between the characters
			if (i < str1.length() - 1) {
				System.out.print(" ");
			}
		}
	}
	
	
	
	

} //end of class
