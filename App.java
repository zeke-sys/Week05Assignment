package week05Assignment;

public class App {

	public static void main(String[] args) {
		
		//Instantiating an instance of each of the logger class
		Logger logger = new AsteriskLogger();
		
		Logger logger1 = new SpacedLogger();
		
		//Testing both methods on both instances
		
		//Testing both methods on first instance - AsteriskLogger()
		logger.log("Hello");
		logger.error("Holla");
		
		//Testing both methods on second instance - SpacedLogger()
		logger1.log("Hello");
		logger1.error("Holla");
		
		
		

	} //end of main
	
} //end of class
