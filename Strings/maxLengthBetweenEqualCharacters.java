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
    public static void main(String args[]){
        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(check(s));
    }
}
