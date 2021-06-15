package roughworks;

public class FindStringLengthWithoutLenFn {

	public static void main(String[] args) {
		
		String str = "aaBBCCCxyz";
		
		System.out.println(str.split("").length);
		System.out.println(str.toCharArray().length);
		System.out.println(str.lastIndexOf(""));
		
//		WAP to execute comment line
		
		int val = 555;
//		\u000d System.out.println(val);	// --->  unicode considered as newline so prints '555'

	}

}
