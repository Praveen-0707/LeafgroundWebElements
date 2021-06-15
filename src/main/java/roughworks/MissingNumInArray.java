package roughworks;

public class MissingNumInArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,8,9};
		
		int sum1 = 0, sum2 = 0;
		
		for (int i=0; i<num.length; i++)
		{
			sum1 = sum1 + num[i];
		}
		
		for (int j=1; j<=9; j++)
		{
			sum2 = sum2 + j;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2-sum1);
	}

}
