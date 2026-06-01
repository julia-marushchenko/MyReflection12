/**
 *  Java program to demonstrate reflection to access to method of the class and its return type.
 */

package com.myreflection;

import java.lang.reflect.Method;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of the class TestClass.
        TestClass tc = new TestClass();

        // Getting all public the methods of TestClass.
        Method[] methods = tc.getClass().getMethods();

        // Printing methods to console.
        for (Method element : methods) {
            System.out.println("Method is: " + element.getName());
        }

        // Getting all declared methods of TestClass.
        Method[] allMethods = tc.getClass().getDeclaredMethods();

        // Printing methods to console.
        for (Method element : allMethods) {

            // Printing name of the method.
            System.out.println("Method is: " + element.getName());

            // Printing return value of the method.
            System.out.println("Return value of method is: " + element.getReturnType());
        }

    }
}

/**
 * TestClass class.
 */
class TestClass {

    // Method testMe().
    void testMe() {
        System.out.println("In testMe() method");
    }

    // Method testMe().
    private String testMeToo() {
        return "In testMeToo() method";
    }
}