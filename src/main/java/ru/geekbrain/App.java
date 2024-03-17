package ru.geekbrain;

import com.google.gson.Gson;

import javax.imageio.IIOException;
import java.io.*;

public class App {

    public static void main(String[] args) throws IOException, Exception {
        /*
//        Person person=new Person("Maksim","Maks",18);
//        serialObj(person,"ser");

        Person person1 =(Person) deSerialObj("ser");
        System.out.println(person1);

    }

    public static void serialObj(Object o, String file) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }
    public static Object deSerialObj(String file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }*/
        Person person1 = new Person("Maksim", "Maks", 18);
        Person person2 = new Person("Maksim", "Maks", 18);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person1);

        Gson gson = new Gson();

        String json = gson.toJson(person1);
        Person read = gson.fromJson(json, Person.class);
        System.out.println(read.firstName);


    }
}
