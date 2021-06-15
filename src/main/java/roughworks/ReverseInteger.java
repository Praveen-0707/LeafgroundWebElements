package roughworks;

public class ReverseInteger {

	public static void main(String[] args) {
		int val = 3489;
		int num = 0;
		
		while (val != 0)
		{
			num = num*10 + val % 10;
			val = val / 10;
		}
		System.out.println(num);
		
//		comparing Integer values - Range is -128 to 128
		Integer val1 = 127;
		Integer val2 = 127;
		
		if (val1 == val2)
		{
			System.out.println("True");
		}
	}

}
