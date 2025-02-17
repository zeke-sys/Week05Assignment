package week05Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
		
	}

	@Override
	public void error(String str1) {
		System.out.println("******************");
		System.out.println("***Error: "+ str1 + "***");
		System.out.println("******************");
	}

}
