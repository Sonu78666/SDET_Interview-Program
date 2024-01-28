package Strings;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abab";
		int start=0;
		int end=0;
		int max_length=0;
		//int longestStart = 0;
		List<Character>list=new ArrayList<Character>();
		while(end<s.length())
		{
			if(!list.contains(s.charAt(end)))
			{
				list.add(s.charAt(end));
				end++;
				max_length=Math.max(max_length,list.size());
			}
			
			/* to print substring with length
			 *if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                if (list.size() > max_length) {
                    max_length = list.size();
                    longestStart = start;
                } 
			 * 
			 */
			else
			{
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
			
		}
		//checking git jffj
		//String longestSubstring = s.substring(longestStart, longestStart + max_length);
        //System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length of the longest substring: " + max_length);
					
	}

}
