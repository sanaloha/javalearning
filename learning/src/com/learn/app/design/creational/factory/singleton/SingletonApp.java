package com.learn.app.design.creational.factory.singleton;

/**
 * Eager Initialization:
 * **/
public class SingletonApp {
	
	// Single instance created at the time of class loading
    private static final SingletonApp instance = new SingletonApp();

    // Private constructor to prevent instantiation
    private SingletonApp() {}

    // Public method to provide access to the instance
    public static SingletonApp getInstance() {
        return instance;
    }

}

/**
 * Lazy Loading
 * **/
class SingletonLazyLoading {
	
	// Instance is not created until needed
    private static SingletonLazyLoading instanceLazy;

    // Private constructor to prevent instantiation
    private SingletonLazyLoading() {}

    // Public method to provide access to the instance
    public static SingletonLazyLoading getInstance() {
        if (instanceLazy == null) {
        	instanceLazy = new SingletonLazyLoading();
        }
        return instanceLazy;
    }
}

/***
 * Thread-Safe Singleton (Double-Checked Locking)
 * 
 * */

 class DoubleCheckSingleton {
    // Volatile ensures visibility of changes across threads
    private static volatile DoubleCheckSingleton instance;

    // Private constructor to prevent instantiation
    private DoubleCheckSingleton() {}

    // Public method to provide access to the instance
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
