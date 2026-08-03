import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
      
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        Map<Character, Integer> vowelMap = new HashMap<>();
        Map<Character, Integer> consonantMap = new HashMap<>();

    
        for(char c : s.toCharArray()){
            if(vowels.contains(c)){
                vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            } else {
                consonantMap.put(c, consonantMap.getOrDefault(c, 0) + 1);
            }
        }

       
        int maxVowel = 0;
        for(int freq : vowelMap.values()){
            maxVowel = Math.max(maxVowel, freq);
        }

       
        int maxConsonant = 0;
        for(int freq : consonantMap.values()){
            maxConsonant = Math.max(maxConsonant, freq);
        }

        
        return maxVowel + maxConsonant;
    }
}
