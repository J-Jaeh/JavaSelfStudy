package Co_Ja_Mon.cha01;
/*
반복되지 않는 첫번째 문자열 찾기
 음   내생각은 일단 흠..반복되지 않으려면 ..
 첫번째문제에서 착안 .  벨류 값이 1 인거 linkedHashmap 조회 for문 +if문 브레이크
 */
public class Cha01_02 {
//약간 돌아가는 풀이
    private static final int EXTENDED_ASCII_CODES =256;

    public static char firstNonRepeatedCharacter(String str){
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for(int i = 0;i<flags.length;i++){
            flags[i] = -1;
        }
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(flags[ch]==-1){
                flags[ch] = i;
            }else{
                flags[ch] = -2;
            }
        }
     int position = Integer.MAX_VALUE;

     for(int i =0;i<EXTENDED_ASCII_CODES;i++){
         if(flags[i] >=0){
             position = Math.min(position,flags[i]);
         }
     }
     return position == Integer.MAX_VALUE?
             Character.MAX_VALUE : str.charAt(position);
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepeatedCharacter("aabbsdqwqe"));
        System.out.println(Integer.MAX_VALUE);
    }
}
