import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.example.BusinessLayer.Singleton;

public class EnumDemo {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Singleton obj = new Singleton(); 
        Class cls=obj.getClass();
        System.out.println(cls.getName());
        Constructor<Singleton1> cons=cls.getConstructor();
        Method[] methods = cls.getMethods();
        System.out.println("The name of constructor is " +
        		cons.getName());
        // Printing method names
        for (Method method:methods)
            System.out.println(method.getName());
       Method addmethodcall=cls.getDeclaredMethod("addItems", int.class);
       addmethodcall.invoke(obj, 2);
       addmethodcall.setAccessible(true);
       
       try {
		Field namefield=cls.getDeclaredField("name");
		namefield.setAccessible(true);
		namefield.set(obj, "jaya");
		System.out.println("name:"+namefield.getName());
	} catch (NoSuchFieldException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       Method namemethod=cls.getDeclaredMethod("getNamepr");
       namemethod.invoke(obj);
		/*
		 * Singleton1 singleton1 = Singleton1.INSTANCE;
		 * System.out.println(singleton.hashCode());
		 * System.out.println(singleton1.hashCode());
		 */


		/*
		 * System.out.println(singleton.getValue()); singleton.setValue(2);
		 * System.out.println(singleton.getValue());
		 */
    }
}
