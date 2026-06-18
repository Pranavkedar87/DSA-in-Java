package Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        char statck1[] = new char[s.length()];
        char statck2[] = new char[s.length()];
        int i=0;
        //int j=0;
        while(i <s.length()){
            if(s.charAt(i) == '#'){
                i--;
            }else{
                statck1[i] = s.charAt(i);
            }
        }
        i=0;
        while(i <t.length()){
            if(t.charAt(i) == '#'){
                i--;
            }else{
                statck2[i] = t.charAt(i);
            }
        }
        i=0;
        while(i < statck1.length || i < statck2.length){
            if(statck1[i] != statck2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println(backspaceCompare("ab#c","ad#c"));
    }
}
