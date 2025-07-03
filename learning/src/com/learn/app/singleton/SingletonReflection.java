package com.learn.app.singleton;

import java.lang.reflect.Constructor;


/**
 * After running this class, you will see that hashCodes are different which means, 
 * 2 objects of the same class are created and the singleton pattern has been destroyed. 
 * 
 * 
 * 
 * @author santo
 *
 */

public class SingletonReflection {

	public static void main(String[] args) {
		
		
		SingletonDemo instance1 = SingletonDemo.getInstance();
		SingletonDemo instance2 =null;
		
		System.out.println("main");
		
		try {
            Constructor[] constructors
                = SingletonDemo.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton
                // pattern
                constructor.setAccessible(true);
                instance2
                    = (SingletonDemo)constructor.newInstance();
                break;
            }
        }
 
        catch (Exception e) {
            e.printStackTrace();
        }
		
		System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
		System.out.println("instance2.hashCode():- "
                + instance2.hashCode());
		
	}

}
