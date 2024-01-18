/*
+a+b+c+d+=valid
a+b+c+d+=Invalid
+a+b+c+d=Invalid
+a+b++c+d+=Invalid
+a+b+c+de+=Invalid

 */

public class Character_Plus_Validation {

    public static void main(String[] args) {
        String s="+a+b+c+d+";
              boolean ans=  validation(s);
              if(ans){
                  System.out.println("Valid");
              }else {
                  System.out.println("Invalid");
              }
    }
    public static boolean validation(String s){
        if(s.charAt(0)=='+'&& s.charAt(s.length()-1)=='+'){
            for(int i=1;i<s.length()-1;i++){
                if(Character.isLetter(s.charAt(i))){
                    if(s.charAt(i-1)!='+'||s.charAt(i+1)!='+'){
                        return false;
                    }
                }
                if(s.charAt(i)=='+'){
                    if(!Character.isLetter(s.charAt(i-1)) || !Character.isLetter(s.charAt(i+1))){
                        return false;
                    }
                }
            }
        }else {
            return false;
        }
        return true;

    }


}
