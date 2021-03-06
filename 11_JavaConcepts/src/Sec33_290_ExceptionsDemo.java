
public class Sec33_290_ExceptionsDemo {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 0;

		try {
			int k = b / c;
			System.out.println(k);
		} catch (ArithmeticException k) {
			System.out.println("Catch arithmetic exceptions");
		}

		// Exception e is generic exception and parent exception class
		catch (Exception e) {
			System.out.println("Catch exceptions");
		}
		finally {
			System.out.println("Execute irrespective of exception is there or not");
		}

	}

}
