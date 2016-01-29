package lambdas_Streams;

import java.util.ArrayList;
import java.util.List;

public class Program_2_B {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>() ;
		list.add("This");
		list.add("Test");
		list.add("List");
		System.out.println(countWords(list,'s','i',4));
	}
	
	public static int countWords(List<String> words, char c, char d, int len)
	{
/*		words.stream()
		.filter(s-> s.contains(""+c))
		.filter(s-> !s.contains(""+d))
		.filter(s->s.length() == len)
		.forEach(System.out::println);*/
		 int wordCount=(int) (words.stream().filter(s-> s.contains(""+c)).filter(s-> !s.contains(""+d)).filter(s->s.length() == len)).count();
		return wordCount;
		
	}

}
