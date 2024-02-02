package Manasa_Mam;

public class Reverse_Words_In_A_String {
public static void main(String[] args) {
	String s="the sky is blue";
	 s=s.trim();
     
     String str[]=s.split(" ");
     String st="";
     for(int i=str.length-1;i>=0;i--){
        String strs=str[i];
        strs=strs.trim();
        if( i==0&&strs.equals("")!=true ){
            st+=strs;
        }
        else if(strs.equals("")!=true){
            st+=strs+" ";
        }
     }
     //return st;
     System.out.println(st);
}
}
