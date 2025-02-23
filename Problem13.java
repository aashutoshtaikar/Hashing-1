import java.util.HashMap;

/**
 * s30 problem 13 - easy
 * https://leetcode.com/problems/isomorphic-strings/submissions/
 * 
 * Constraints:

    1 <= s.length <= 5 * 104    ==> n
    t.length == s.length
    s and t consist of any valid ascii character.
 * 
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.
 * 
 * time complexity: O(n) => O(1)
 * space complexity: O(26) => O(1) - 26 letters in english
 * 
 */
public class Problem13{

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            if(!sMap.containsKey(schar)){
                sMap.put(schar, tchar);
            } else {
                if(sMap.get(schar) != tchar){
                    return false;
                }
            }
            
            if(!tMap.containsKey(tchar)){
                tMap.put(tchar, schar);
            } else {
                if(tMap.get(tchar) != schar){
                    return false;
                }
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        
    }
}