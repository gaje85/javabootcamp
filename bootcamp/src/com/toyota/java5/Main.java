package com.toyota.java5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        Person person = new Person("John", 25);
        
        Person person1 = new Person("John", 25);
        
        System.out.println(person.equals(person1));
        System.out.println(person.hashCode() + "   "+person1.hashCode());
        Person person2 = (Person) person.clone();
        
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad.exe");
        
    
    }
    
}
