
public class StringDemo {
	public static void main(String[] args) {
		
		String str=new String("Shivam");
		str=str.concat("Mishra");
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder("Hello world");
		sb.substring(2, 7);
		sb.append(true);
		        int result = 0;
		        short s = 42;
		        Long x = new Long("42");
		        Long y = new Long(42);
		        Short z = new Short("42");
		        Short x2 = new Short(s);
		        Integer y2 = new Integer("42");
		        Integer z2 = new Integer(42);

		        StringBuilder sba=new StringBuilder("");
		        String sa="";
		        
		        
		        
		        System.out.println(sa.equals(sba.toString()));
		        if (x == y) /* Line 13 */
		            result = 1;
		        if (x.equals(y) ) /* Line 15 */
		            result = result + 10;
		        if (x.toString().equals(z.toString()) ) /* Line 17 */
		            result = result + 100;
		        if (x.equals(x2) ) /* Line 19 */
		            result = result + 1000;
		        if (x.equals(z2) ) /* Line 21 */
		            result = result + 10000;

		        System.out.println("result = " + result);
	}

}
