package com.bit.day11;

import java.io.File;

public class Ex05 {

   public static void main(String[] args) {
      File file = new File("test02");
      boolean result = file.delete();
      if(!result) {
    	  String[] arr=file.list();
    	  for(int i=0; i<arr.length; i++) {
    		  File temp=new File(file.getName() + "\\" + arr[i]);
    		  temp.delete();
    	  }
      }
      file.delete();
	   
	   
      
      
   }

}