package SundayAssessment;

public class Repl7_2 {
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
	public static String minVowels(String[] words)
	{
		int min=countVowels(words[0]);
		String minW= words[0];
		for (int i=0; i<words.length; i++) {
			if (countVowels(words[i])<min) {
				minW=words[i];
			}else if (countVowels(words[i])==min) {
				minW= (words[i].length()<minW.length())? words[i]: minW;
			}
		}
		
		return minW;
	}
	public static int countVowels(String s)
	{
		int numVow=0;
		for (int i=0; i<s.length(); i++) {
			if (isVowel(s.charAt(i))){
				numVow++;
			}
		}
		
		return numVow;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}

}
