package roughworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ListAndMap {

	public static void main(String[] args) {
		
		String data = null;
		int[] A = {51,71,17,42};	//returns single set
//		int[] A = {51,71,17,42,22,76};	//returns all matching combination sets
		List <Integer> arrayList = new ArrayList <Integer> ();
		List <Integer> tempList = new ArrayList <Integer> ();
		Map <Integer, String> map = new TreeMap <Integer, String> ();
		
		for (int temp : A)
		{
			arrayList.add(temp);
		}
		
		tempList.addAll(arrayList);
		System.out.println(tempList);
		int cnt = 0;
		
		for (int i=0; i<arrayList.size(); i++)
		{
			for (int j=1; j<tempList.size(); j++)
			{
				int val = arrayList.get(i) + tempList.get(j);
				if (val == 93)
				{
					String str = "["+ arrayList.get(i) + "," + tempList.get(j) + "]";
					
					if (cnt == 0)
					{
						map.put(cnt, str);
						cnt += 1;
					}
					else
					{
						map.put(cnt, str);
						cnt += 1;
					}
					
				}
			}
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> mapValue : entrySet)
		{
			data = mapValue.getValue();
			System.out.println(data);
		}


	}
}
