package com.it;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {
  public String  m1(String s1, int b){
	  if(b > 0){
		  System.out.println("hello welcome to Debugging example by ==>"+s1);
		  int a , c;
		  a= b =100;
		  c = a/ (b/10);
		  System.out.println(c);
		  s1= "dummy";
	  }
	  else{
		  System.out.print("u ");
		  System.out.print("dummy ");
		  System.out.print("fellow ");
		  System.out.print("1st get vasi yoga ");
		  s1= "gnani";
	  }
	  return s1;
  }
}
