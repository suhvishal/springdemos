import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		Class<Employee> employeeClass =	Employee.class;
		
		Employee e = employeeClass.newInstance();
		
		
	    Method method =	employeeClass.getDeclaredMethod("showEmp", String.class);
	    
	    method.setAccessible(true);
	    
	    Object retrunValue =	method.invoke(e, "Vinod");
	    
	    System.out.println(retrunValue);
	    
	    System.out.println(method.getReturnType().getName());
	    
		
//		Method[] methods = employeeClass.getDeclaredMethods();		//getMethods()
//		
//		for(Method method : methods) {
//			System.out.println(method.getName());
//		}
		
	}

}
