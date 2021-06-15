package roughworks;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int[] num = {16, 25, 99, -77, 69, -6, 3};
		
		int smallestNum = num[0];
		int largestNum = num[0];
		
		for (int i=1; i<num.length; i++)
		{
			if (num[i] > largestNum)
			{
				largestNum = num[i];
			}
			else if (num[i] < smallestNum)
			{
				smallestNum = num[i];
			}
		}
		
		System.out.println(smallestNum);
		System.out.println(largestNum);
	}

}
