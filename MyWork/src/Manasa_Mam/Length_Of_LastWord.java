package Manasa_Mam;

public class Length_Of_LastWord {
public static void main(String[] args) {
	String s="   fly me   to   the moon  ";
	s=s.trim();
//    String str[] = s.split(" ");
//    //return str[str.length-1].length();
//    System.out.println(str[str.length-1].length());
     int count=0;
   for(int i=s.length()-1;i>=0;i--){
       if(s.charAt(i)!=' '){
           count++;
       }
       else{
           break;
       }
   }  
   //return count;
   System.out.println(count);
}
}
