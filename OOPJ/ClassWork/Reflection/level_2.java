// Fields and methods of class (user defined as well as System )
package Basic_Syntax;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import in.india.*;
public class level_2 {

	public static void main(String[] args) {
		Class <?> c =Integer.class;
		Field[] fields= c.getFields();
		for(Field field:fields ) {
		System.out.println(field);}
System.out.println("---------------------------------------------------------------");
		Class <?> c1 =Object.class;
		Method[] method1=c1.getDeclaredMethods();  // All methods
		Method[] method2=c1.getMethods();  // Public  methods 
		for(Method element:method1)
		{
			System.out.println(element);
		}
		System.out.println("--------------------------------------------------------------");
		for(Method element:method2)
		{
			System.out.println(element);
		}
		System.out.println("--------------------------------------------------------------");
		Class <?>c2=ChiefMinister.class; 
		Method[] field2=c2.getDeclaredMethods();
		for(Method element:field2)
		{
			System.out.println(element);
		}
	}

}
