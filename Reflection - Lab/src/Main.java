import reflect.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> reflection = Reflection.class;
        System.out.println( "class " + reflection.getSimpleName());
        Class<? super Reflection> superClass = reflection.getSuperclass();
        System.out.println(superClass);

        Class[] interfaces = reflection.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Constructor<Reflection> ctor = Reflection.class.getDeclaredConstructor(
                String.class, String.class, String.class
        );

        ctor.setAccessible(true);

               Reflection reflection1 = ctor
                .newInstance("Name", "WebAddress", "example@example.com");


        System.out.println(reflection1.toString());
    }
}
