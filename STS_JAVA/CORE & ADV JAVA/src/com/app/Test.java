package com.app;

public class Test{
	public static void main(String[] args) {
		Trial ob=new Trial();
		ob.setName("ABC");
		ob.setSal(11.55f);
		ob.setSid(20);
		System.out.println(ob.getName());
		System.out.println(ob.getSid());
		System.out.println(ob.getSal());
		
		Trial ob1=new Trial();
		ob1.setName("ABC");
		ob1.setSal(11.55f);
		ob1.setSid(20);
		System.out.println(ob1.getName());
		System.out.println(ob1.getSid());
		System.out.println(ob1.getSal());
		System.out.println();
		
		boolean b=ob.equals(ob1);
		System.out.println(b);
		System.out.println();
		
		Trial ob2=new Trial();
		ob2.setName("ABCZ");
		ob2.setSal(11.555f);
		ob2.setSid(21);
		System.out.println(ob2.getName());
		System.out.println(ob2.getSid());
		System.out.println(ob2.getSal());
		System.out.println();
		
		boolean b1=ob1.equals(ob2);
		System.out.println(b1);
		
		System.out.println(ob2);		
		
	}
	
}
