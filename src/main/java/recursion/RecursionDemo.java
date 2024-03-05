package recursion;

public class RecursionDemo {

	private char ch = 'A';


	public static void main(String[] args) {

		RecursionDemo recDemo = new RecursionDemo();
		System.out.println("MAIN CALL");
		int result = recDemo.factInfo(5);
		System.out.println("RESULT  |  " + result);
		System.out.println("END MAIN");

		System.out.println(recDemo.fact(5));
	}

	public int a(int number) {
		System.out.println("a CALL  |  " + number);
		int result = b(number+1);
		System.out.println("a RETURN  |  " + result);
		return result;
	}

	public int b(int number) {
		System.out.println("  b CALL  |  " + number);
		int result = c(number+1);
		System.out.println("  b RETURN  |  " + result);
		return result;
	}

	public int c(int number) {
		System.out.println("    c CALL  |  " + number);
		int result = number + 1;
		System.out.println("    c RETURN  |  "  + result);
		return result;
	}

	public int rec(int number) {
		char thisMethodIteration = ch;
		ch = (char) (ch + 1);
		String spaces = addSpace(thisMethodIteration);
		if(ch == 'G') {
			System.out.println(spaces + thisMethodIteration + "  RETURN |  BASE CASE  |  RESULT: " + number);
			return number;
		}
		System.out.println(spaces + thisMethodIteration +  "  RECURSIVE CALL  |  ARG: " + number);
		int result = rec(number);
		return result + 10;
	}

	private String addSpace(int thisMethodIteration) {
		String spaces = "";
		for(int i = 0; i < thisMethodIteration - 'A'; i++) {
			spaces = spaces + "   ";
		}
		return spaces;
	}

	public int fact(int number) {
		if(number <= 1) {
			return number;
		}
		return number * fact(number-1);
	}

	public int factInfo(int number) {
		char thisMethodIteration = ch;
		ch = (char) (ch + 1);
		String spaces = addSpace(thisMethodIteration);
		if(number <= 1) {
			System.out.println(spaces + thisMethodIteration + "  RETURN |  BASE CASE  |  RESULT: " + number);
			return number;
		}
		int arg = number - 1;
		System.out.println(spaces + thisMethodIteration +  "  RECURSIVE CALL  |  ARG: " + number + " * fact(" + arg + ")");
		int result = number * factInfo(number-1);
		System.out.println(spaces + thisMethodIteration + " RETURN  |  RESULT: " + number + " * fact(" + arg + ") = " + result);
		return result;
	}
}
