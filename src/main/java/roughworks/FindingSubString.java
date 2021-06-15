package roughworks;

public class FindingSubString {

	public static void main(String[] args) {
		
		String str = "I'm a java programmer by profession";
		boolean val1 =  str.matches("(.*)" + "gram" + "(.*)");
		boolean val2 =  str.contains("gram");
		System.out.println(val1);
		System.out.println(val2);
		
	}

}
