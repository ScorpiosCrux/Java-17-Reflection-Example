package Testing;

import java.lang.reflect.*;


public class TestReflection {


    public static void main(String[] args) {
        TestReflection reflection_is_cool = new TestReflection();
        reflection_is_cool.reflectionMethod("Testing.HelloWorld");

    }

    private void reflectionMethod(String class_name) {
        try {
            Class<?> rec_class = Class.forName(class_name);                         // returns the class object with the name of a class
            Object obj = rec_class.getDeclaredConstructor().newInstance();          // Creates an object of type
            Method method = rec_class.getMethod("printHelloWorld");             // get method name
            method.invoke(obj);                                                     // invoke the method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
