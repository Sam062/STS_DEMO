package dailyTask;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsString {

	static void duplicateWords(String inputString)
	{
		String[] words = inputString.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : words)
		{
			if(wordCount.containsKey(word.toLowerCase()))
			{
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			}else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString)
		{
			if(wordCount.get(word) > 1)
			{
				System.out.println(word+" : "+wordCount.get(word));
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Call");
		duplicateWords("hello sathya and Sathya");
		duplicateWords("java is java again java");
		duplicateWords("super man bat man spider man");
	}
}
