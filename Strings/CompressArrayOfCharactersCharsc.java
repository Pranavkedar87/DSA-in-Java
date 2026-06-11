package Strings;

public class CompressArrayOfCharactersCharsc {
    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        int i=0;
        while(i != chars.length){
            int count =1;
            while(i < chars.length-1 && chars[i] == chars[i+1]){
                i++;
                count++;
            }
            sb.append(chars[i]);
            if(count > 1){
                sb.append(count);
            }
            i++;
        }
            //char result[] = new char[sb.length()];
            for(int j=0;j<sb.length();j++){
                chars[j] = sb.charAt(j);
            }
        return sb.length();
    }
    public static void main(String args[]){
        char ch[] = {'a','a','b','b','c','c','c'}; 
        //char ch[] = {'a'};
        System.out.println(compress(ch));
}
}
