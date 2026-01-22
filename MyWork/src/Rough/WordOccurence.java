package Rough;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOccurence {
	
	
	public static void main(String[] args) {
		String input="programmmmmingggggg";
		String  wordtofind="programming";
		
		Pattern pattern=Pattern.compile(wordtofind);
		Matcher matcher=pattern.matcher( input);
		
		
		int count=0;
		while(matcher.find()) {
			count++;
		}
		
		System.out.println("Occurence of "+wordtofind+" is "+count);
		
	}

}
