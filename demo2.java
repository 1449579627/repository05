package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c1 = Class.forName("反射.Student");
        Constructor<?> cn = c1.getConstructor(String.class,int.class,String.class);
        Object obj = cn.newInstance("林青霞",36,"西安");
        System.out.println(obj);
    }
}
