package org.netscape.controller;

import java.util.Properties;

class A
{
   static String str;
   public void A() 
   {
      System.out.println("In constructor");
      str = "Hello World";
   }
   public static void main(String [] args)
   {
      A c = new A();
      System.out.println(str);
   }
}
