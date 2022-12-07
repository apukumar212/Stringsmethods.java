package com.pack1;

public class Stringsmethods 
{
	void meth1() 
	{
String s1="JAVA";
String s2=new String("JAVA");
String s3="JAVA";
String s4=new String("JAVA");

   System.out.println("------equals-----");
   System.out.println(s1.equals(s2));
   System.out.println(s2.equals(s3));
   System.out.println(s3.equals(s1));
   System.out.println(s2.equals(s4));
   System.out.println(s1.equals("JAVA"));
   System.out.println(s1.equals("java"));
   System.out.println(s1.equalsIgnoreCase("JAVA"));
   System.out.println("--------------------");
   System.out.println(s1==s2);
   System.out.println(s2==s3);
   System.out.println(s1==s3);
   System.out.println(s2==s4);
   System.out.println(s1=="JAVA");
   System.out.println("JAVA"==s2);
   System.out.println("JAVA"=="JAVA");
   System.out.println(s1==new String("JAVA"));
   System.out.println(new String("JAVA")=="JAVA" );
   System.out.println(s2==new String("JAVA"));
   System.out.println(new String("JAVA")==new String("JAVA"));
}
public static void main(String[] args) 
{
	Stringsmethods aobj=new Stringsmethods();
	aobj.meth1();
}
}












