
public class FizzBuzz {

	public static void main(String[] args) {
		int max = 100;
		for(int i =1; i<=max; i++) {
			String output = "";
			if (i%3==0) {
				output += "Fizz";
			}
			if(i%5==0) {
				output += "Buzz";
			}
			if (output.equals("")) {
				output += Integer.toString(i);
			}
			System.out.println(output);
			//System.out.println(System.identityHashCode(i));
		}
	}
}
