package roughworks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CharOccurence {

	public static void main(String[] args) {
		
		String str = "AachuaahQuasheah";
		
		char[] eachChar = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (char val : eachChar)
		{
			Integer count = map.get(val);
			if (count == null)
			{
				map.put(val, 1);
			}
			else
			{
				map.put(val, ++count);
			}
		}
		System.out.println("Values stored in Map: "+ map);
		
		Set<Entry<Character, Integer>> mapValues = map.entrySet(); // to read map values
		TreeSet <Integer> highestOccChar = new TreeSet <Integer>(); // saving map unique values into Set
		
//		Adds all unique values from Map in Set
		for (Entry<Character, Integer> repChar : mapValues)
		{
			int data =  repChar.getValue();
			highestOccChar.add(data);
		}
		
//		Prints the Highest Occurrence Char
		for (Entry<Character, Integer> repChar : mapValues)
		{
			int data =  repChar.getValue();
			int indexNum = highestOccChar.last();
			if (data == indexNum)
			{
				System.out.println("Highest Occured Char is - " + repChar.getKey() + " Occurred - " + repChar.getValue() + " times.");
			}
		}	
	
	//Alternate approach - finding specific char count
	String strValue = "AachuaahQuasheah";
	char charOccurence = 'h';
	
	char[] charArray = strValue.toCharArray();
	int charCount = 0;
	
	for (int i=0; i<charArray.length; i++)
	{
		if (charArray[i] == charOccurence)
		{
			charCount += 1;
		}
	}
	System.out.println("Character "+ charOccurence + " in " + strValue + " occured: " +charCount+ " times.");
	}
}
