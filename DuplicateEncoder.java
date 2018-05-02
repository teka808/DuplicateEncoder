package co.kr.ibeauty.codewars;

public class DuplicateEncoder {
    static String encode(String word){
        String result = "";
        char[] s = word.toLowerCase().toCharArray();
        for(int i=0; i<s.length; i++){
            String words = removeCharAt(word.toLowerCase(), i);
            if(words.contains(String.valueOf(s[i])))
                result += ")";
            else
                result += "(";
        }
        return result;
    }

    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
