package lambdas_Streams;

import java.util.List;

public class Program_2_B {
	public static void main(String args[])
	{
		
	}
	
	public int countWords(List<String> words, char c, char d, int len)
	{
		System.out.println( words.stream().filter(s-> s.contains(""+c)).filter(s-> !s.contains(""+d)).filter(s->s.length() == len));
		return len;
		
	}

}
