import java.io.*;
public class pangram {
    static boolean checkPangram(String str){
        boolean[] mark = new boolean[26];
        String upper = str.toUpperCase();

        int index =0;

        for(int i=0; i<upper.length();i++){
            if('A' <= upper.charAt(i) && upper.charAt(i)<='Z'){
                index =upper.charAt(i)-'A';
            }
            else{
                continue;
            }
            mark[index]=true;
        }
        for(int i=0;i<=25;i++){
            if(mark[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str
        = "This is a Java based assignment";

    if (checkPangram(str) == true)
        System.out.print(str + " is a pangram.");
    else
        System.out.print(str + "is not a pangram.");

    }
}