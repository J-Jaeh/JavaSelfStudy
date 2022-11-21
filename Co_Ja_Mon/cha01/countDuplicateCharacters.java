package Co_Ja_Mon.cha01;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateCharacters {
    public static Map<Character,Integer> contDuplicateCharacters(String str){
     Map<Character,Integer> result = new HashMap<>();
     for(int i=0;i<str.length();i++){
         char ch = str.charAt(i);
         result.compute(ch,(k,v)->(v==null)?1:++v);
     }
     return result;
    }

    public static void main(String[] args) {
        System.out.println(contDuplicateCharacters("asdfsdafsadfqoeqwioeuqwioe"));

    }
}




