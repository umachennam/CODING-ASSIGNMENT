import java.util.*;
public class roman_no {
    

    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    int romanTOInteger(String str){
        int result = 0; // We Will Use this variable to store the result

        for(int i=0;i<str.length();i++){
            int s1 = value(str.charAt(i));
            if(i+1<str.length()){ // Check if the i+1 value is below the length of the string
                int s2 = value(str.charAt(i+1));

                if(s1>=s2){    //Check if s1 is greater than or equal
                    result = result+s1;
                }
                else{ 
                    result= result+s2-s1;
                    i++;
                }
        }
        else{
        result=result+s1;
    }
       
    }
   
    return result;
}
public static void main(String[] args) {
    roman_no ob = new roman_no();
 
    
    String str = "MCMIV"; // Input String
    System.out.println(str + " = "+ob.romanTOInteger(str));

}

}