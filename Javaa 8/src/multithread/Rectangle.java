package multithread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialization in Java is a mechanism of writing the state of an object into a byte-stream. 
//It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.
//The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
//For serializing the object, we call the writeObject() method of ObjectOutputStream class, and 
//for deserialization we call the readObject() method of ObjectInputStream class.
public class Rectangle implements Serializable{
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length * breadth;
    }
       int length;
       int breadth;
       int area; // transient int area;     Transient variables are not serialized. 
       //If you don't want to serialize any data member of a class, you can mark it as transient.
       
       
    //How	do	you	serialize	an	object	using	Serializable	interface?
/*
     FileOutputStream	fileStream = new FileOutputStream("Rectangle.ser");
     ObjectOutputStream	objectStream	=	new ObjectOutputStream(fileStream);
     objectStream.writeObject(new Rectangle(5,	6));
     fileStream.close();
     objectStream.close();

     //How do you de-serialize in	Java?
     FileInputStream  fileInputStream = new FileInputStream("Rectangle.ser");
     ObjectInputStream  objectInputStream = new ObjectInputStream(fileInputStream);
     Rectangle rectangle = (Rectangle)objectInputStream.readObject();
     fileInputStream.close();
     objectInputStream.close();
      System.out.println(rectangle.length);//	5
      System.out.println(rectangle.breadth);//	6
      System.out.println(rectangle.area);//	3
*/
      // Transient variables are not serialized. (transient int area;)
}
