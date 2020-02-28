package lambda_expression;

import java.util.function.Supplier;

public class RandomPasswordGenerate {
	public static void main(String[] args) {
		
		Supplier<String> s=()->{
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYS#$@";
			Supplier<Integer> d=()->(int)(Math.random()*10);
			Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
			String pwd="";
			for (int i = 1; i <=8; i++) {
				if(i%2==0)
					pwd+=d.get();
				else
					pwd+=c.get();
			}
			return pwd;
		};
		System.out.println("Random password is="+s.get());
	}

}
