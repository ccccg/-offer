package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 会有重复字母
 */
public class StringPermute {
    public ArrayList<String> Permutation(String str) {
        if(str.length() == 0){
            return new ArrayList<String>();
        }

        char[] chars = new char[str.length()];
        for(int i = 0;i<chars.length;i++){
            chars[i] = str.charAt(i);
        }
        Arrays.sort(chars);
        ArrayList<String> list = Permutation(chars,0);
        Collections.sort(list);
        return list;

    }
    public ArrayList<String> Permutation(char[] chars,int start){
        if(start >= chars.length){
            String s =  "";
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = start;i<chars.length;i++){
            if(chars[i]==chars[start]&&i!=start){
                continue;
            }
            swap(chars,i,start);
            for(String s:Permutation(chars,start+1)){
                list.add(chars[start]+s);
            }
            swap(chars,i,start);
        }
        return list;
    }
    public void swap(char[] chars, int a, int b){
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }
}
