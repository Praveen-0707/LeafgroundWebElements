package roughworks;

public class ExecuteLineWithoutSemicolon {

	public static void main(String[] args) {
		
		if (System.out.printf("Hello" + "\n") == null) {}
		
		if (System.out.append("Hello" + "\n") == null) {}
		
		if (System.out.append("Hello" + "\n").equals(null)) {}
		
		for (int i=0; i<1; System.out.println("Hello" + "\n"))
		{
			i++;
		}

	}

}
