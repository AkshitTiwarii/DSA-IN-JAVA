import org.w3c.dom.css.CSSStyleDeclaration;

import java.util.Scanner;

public class strings {
    public static void main(String[] args){
        String s = "aaabbcc";
        System.out.println(compression(s));
    }
    static boolean isPalindrome(String s){
        int len = s.length();
        for (int i = 0; i < s.length()%2; i++) {

            if(s.charAt(i) == s.charAt(len-i-1)){
                return true;
            }
        }
        return false;
    }
    // Find the shortest path WNEENESENNN
    static void directions(String s){
        int x =0;
        int y =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'N'){
                x++;
            }
            if(s.charAt(i) == 'S'){
                x--;
            }
            if(s.charAt(i) == 'E'){
                y--;
            }
            if(s.charAt(i) == 'W'){
                y++;
            }
        }
        int ans = (int) Math.sqrt(x*x+y*y);
        System.out.println(ans);
    }
    static String compression(String s){
        StringBuilder newStr = new StringBuilder(" ");
        for (int i = 0; i < s.length(); i++) {
            Integer count =1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(s.charAt(i));
            if(count>1){
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }
}
