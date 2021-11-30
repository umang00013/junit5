package businesscode;
import static java.lang.System.*;
import static java.lang.Math.*;
public class StaticImportDemo {

	public static void main(String[] args) {
		
		/* 
		 * without static import
		
System.out.println(Math.sqrt(121));	
System.out.println(Math.pow(10,2));
System.out.println(Math.abs(55.55));

	 */
	
//with static import of math
System.out.println(sqrt(121));	
System.out.println(pow(10,2));
System.out.println(abs(55.55));

	

//with static import of math and system
out.println(sqrt(121));	
out.println(pow(10,2));
out.println(abs(55.55));


	
	}

}