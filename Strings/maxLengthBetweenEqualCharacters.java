package Strings;

public class maxLengthBetweenEqualCharacters {
    public static int check(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i=0;i<n-1;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                count++;
                if(s.charAt(i) == s.charAt(j)){
                    if(max < count){
                        result = count;
                        max = count;
                    }
                }
            }
        }
        return result-1;
    }
    public static int check2(String s) {
        int n = s.length();
        int max = Integer.MIN_VALUE;
        int result = 0;
        int j=0;
        int count =0;
        for(int i=j+1;i<n-1;i++){
                count++;
                if(s.charAt(j) == s.charAt(i)){
                    if(max < count){
                        result = count;
                        max = count;
                    }
                }
                if((i+j) == (n-1) && j<(n-1)){
                    j++;
                }
                if((i+j) == (n-1)){
                    count=0;
                }
            }
        return result-1;
    
        }

    public static void main(String args[]){
        String s = "aacecaaa";
        System.out.println(check2(s));
    }
}
