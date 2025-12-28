//LINK: https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/description/?envType=problem-list-v2&envId=string

public class FindMostFrequentVowelAndConsonant {
    public boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxFreqSum(String s) {
        int[] freq=new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        int maxVowel=Integer.MIN_VALUE, maxConsonant=Integer.MIN_VALUE;
        
        for(int i=0;i<freq.length;i++){
            char ch=(char)('a'+i);
            if(isVowel(ch)==true){
                maxVowel=Math.max(maxVowel,freq[i]);
                
            }
            else{
                maxConsonant=Math.max(maxConsonant,freq[i]);
            }
        }

        return maxVowel+maxConsonant;
    }

    public static void main(String[] args) {
        FindMostFrequentVowelAndConsonant solution = new FindMostFrequentVowelAndConsonant();
        String s = "examplestring";
        int result = solution.maxFreqSum(s);
        System.out.print(result + " ");
    }
}