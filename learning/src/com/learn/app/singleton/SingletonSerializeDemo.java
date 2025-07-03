package com.learn.app.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializeDemo {

	public static void main(String[] args) {
		
		
		try {
			SingletonDemo instance1 = SingletonDemo.getInstance();
            ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
 
            // deserialize from file to object
            ObjectInput in = new ObjectInputStream(
                new FileInputStream("file.text"));
 
            SingletonDemo instance2
                = (SingletonDemo)in.readObject();
            in.close();
 
            System.out.println("instance1 hashCode:- "
                               + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                               + instance2.hashCode());
        }
 
        catch (Exception e) {
            e.printStackTrace();
        }
				
		
	}

}
