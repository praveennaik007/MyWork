package Manasa_Mam;

import java.util.Arrays;

public class Third_Max_Element {
public static void main(String[] args) {
	int nums[]= {2,2,3,1};
	 int count=0;
     for(int i=0;i<nums.length;i++){
         for(int j=i+1;j<nums.length;j++){
             if(nums[i]==nums[j]&&nums[j]!=-1000){
                 nums[j]=-1000;
                 count++;
             }
         }
     }
     int o[]=new int[nums.length-count];
     int j=0;
     for( int i=0;i<nums.length;i++){
         if(nums[i]!=-1000){
              o[j++]=nums[i];
         }   
     }
  Arrays.sort(o);
  if(o.length>=3)
  //return o[o.length-3];
	  System.out.println(o[o.length-3]);
  else{
      //return o[o.length-1];
	  System.out.println(o[o.length-1]);
}
}
}
