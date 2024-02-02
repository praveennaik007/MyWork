package Manasa_Mam;

import java.util.Arrays;

public class Sort_Colors {
public static void main(String[] args) {
	int nums[]= {2,0,2,1,1,0};
	 int temp=0;
     for(int i=0;i<nums.length;i++){
         for(int j=0;j<nums.length-1-i;j++){
        	
             if(nums[j]>=nums[j+1]){
                 temp=nums[j];
                 nums[j]=nums[j+1];
                 nums[j+1]=temp;    
            }
            
         }
         for (int k = 0; k < nums.length; k++) {
  			System.out.print(nums[k]+" ");
  		}
           System.out.println();
     }
     
    System.out.println("----------");
    System.out.println(Arrays.toString(nums));
}
}
