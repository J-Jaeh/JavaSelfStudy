package Co_Ja_Mon.cha01;

import java.util.LinkedHashMap;
import java.util.Map;

public class cha01_02_02 {
    public static char firstNonRepeatedCharacter(String str){
        Map<Character,Integer> chars = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            chars.compute(ch,(k,v)->(v==null)?1:++v);
        }
        for(Map.Entry<Character,Integer> entry:chars.entrySet()){
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
       char a = cha01_02_02.firstNonRepeatedCharacter("진진재진재진재진재니잰진재혁잰");
        System.out.println(a);
    }
}
