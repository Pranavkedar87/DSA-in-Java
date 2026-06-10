package Strings;
import java.util.*;
public class InputOutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
    }
}