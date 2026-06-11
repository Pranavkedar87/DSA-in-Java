package Strings;

public class StringCompressionIII {
    public static String compress(String word) {
        StringBuilder comp = new StringBuilder("");
        int i=0;
        while(i != word.length()){
            int count = 1;
            while(i < word.length()-1 && word.charAt(i) == word.charAt(i+1)){
                if(count == 9){
                    break;
                }
                count++;
                i++;
            }
            comp.append(count);
            comp.append(word.charAt(i));
            i++;
        }
        return comp.toString();
    }
    public static void main(String args[]){
        System.out.println(compress("abcdd"));
    }
}
