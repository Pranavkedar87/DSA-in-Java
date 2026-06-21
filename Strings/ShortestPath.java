package Strings;
//import java.util.*;
public class ShortestPath {
    public static float distance(String s){
        int x=0 , y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'N' || s.charAt(i) == 'n'){
            y++;
        }else if(s.charAt(i) == 'E' || s.charAt(i) == 'e'){
            x++;
        }else if(s.charAt(i) == 'S' || s.charAt(i) == 's'){
            y--;
        }else{
            x--;
        }
        }
        x = x*x;
        y = y*y;
        return (float)Math.sqrt(x+y);
    }
    public static void main(String args[]){
        String s = "WNEENESENNN";
        System.out.println(distance(s));
    }
}
