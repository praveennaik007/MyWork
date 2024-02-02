package Manasa_Mam;

import java.util.Arrays;

public class Longest_Common_Prifix {
public static void main(String[] args) {
	String strs[]= {"flower","flow","flight"};
	Arrays.sort(strs);
    String str="";
   char a[]=strs[0].toCharArray();
   char b[]=strs[strs.length-1].toCharArray();
   for(int i=0;i<a.length;i++){
       if(a[i]==b[i]){
           str+=a[i];
       }
      else{
          break;
      }
   } 
   //return str;
   System.out.println(str);
}
}
