
public class AE2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc,def,ghi";
		// We create a string array called 'b', with the values of the string 'a' separated by commas.
		String[] b = a.split(",");
		// We print the array's values one by one
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}
}