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
	static boolean vowel;
	static String cv;

	public static boolean isVowel(String s){
		if (s.substring(0,1) == "a" || (s.substring(0,1) == "e") || (s.substring(0,1) == "i") || (s.substring(0,1) == "o") || (s.substring(0,1) == "u")){
			return true;
		}
		else{
			return false;
		}
	}

	public static String convertWord(String s)
	{
		//if (s.substring(0,1) == "a" || (s.substring(0,1) == "e") || (s.substring(0,1) == "i") || (s.substring(0,1) == "o") || (s.substring(0,1) == "u")){
			
		

     		 return "";      // This statement is provided to allow initial compiling.
	}  
   
}
