import java.util.Scanner;

public class Latin
{
	public static void main (String[] args)
	{
      		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String str = input.nextLine();
        		 	
		String piggie = PigLatin.convertWord(str);
		System.out.println();
		System.out.println("Converted word: " + piggie);
	}
}

class PigLatin
{
	static String cv;

	public static boolean isVowel(String l){
		boolean vowel = false;
		if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")){
			vowel = true;
		}
		return vowel;
	}

	public static String startsVowel(String s){
		return s + "way";
	}

	public static String startsConsonant(String s){
		s = s.substring(1) + s.substring(0,1) + "ay";
		return s;
	}

	public static String convertWord(String s)
	{	
		String letter = s.substring(0,1);
		boolean b = isVowel(letter);
		if (b == true){
			String newWord = startsVowel(s);
			return newWord;
		}
		else{
			String newWord = startsConsonant(s);
			return newWord;
		}
		
	}  
   
}
