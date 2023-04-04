package com.polymorphism;

public class MethodeoverloadExample1 {
          public static void main(String[] args) {
        	  MethodeoverloadExample1 ex1=new MethodeoverloadExample1();
        	  ex1.M1(10,10,20,30);
        	  ex1.M1();
        	 /* byte b=1;
        	  ex1.M1(12.2f,b);*/
    }

         /*void M1() {
	            System.out.println("no para methode");
              }*/
         void M1(Integer a) {
	            System.out.println("single para wraper  methode");
           }
         void M1(int...a) {
	            System.out.println("single para vararg  methode");
        }
         
       /*  void M1(int a,float f) {
	            System.out.println("double para premitive int float methode");
           }*/
      
         void M1(float f,short s) {
	            System.out.println("double para float short premitive methode");
           }
      
         void M1(String s,double d) {
	            System.out.println("double para wrapper primitive methode");
           }
         void M1(Double d,Short s) {
	            System.out.println("double para wrapper methode");
           }
      



}
