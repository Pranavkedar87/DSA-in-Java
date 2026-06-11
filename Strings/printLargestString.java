package Strings;

public class printLargestString {
    public static void main(String args[]){
        String a[] = {"apple","mango","banana"};
        String large = a[0];
        for(int i=1;i<a.length;i++){
            if(large.compareTo(a[i]) < 0){
                large = a[i];
            }
        }
        System.out.println(large);
    }
}
