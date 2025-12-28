//LINK: https://leetcode.com/problems/find-words-containing-character/description/?envType=problem-list-v2&envId=array
import java.util.*;
public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                lst.add(i);
            }
        }

        return lst;
    }
    public static void main(String[] args) {
        FindWordsContainingCharacter solution = new FindWordsContainingCharacter();
        String[] words = {"apple", "banana", "cherry", "date"};
        char x = 'a';
        List<Integer> result = solution.findWordsContaining(words, x);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
