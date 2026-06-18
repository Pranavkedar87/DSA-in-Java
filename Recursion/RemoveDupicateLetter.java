package Recursion;

public class RemoveDupicateLetter {
    public static String removeDuplicateLetters(String s,int i,StringBuilder sb,boolean map[]){
        if(i == s.length()){
            return sb.toString();
        }
        if(map[s.charAt(i)-'a'] == true){
            return removeDuplicateLetters(s, i+1, sb, map);
        }else{
            map[s.charAt(i) - 'a']=true;
            return removeDuplicateLetters(s, i+1, sb.append(s.charAt(i)), map);
        }
    }
    public static void main(String args[]){
       // System.out.println((char)(1+'a'));
        //dd("aabbppzz");
        System.out.println(removeDuplicateLetters("cbacdcbc",0,new StringBuilder(),new boolean[26]));
    }
}
