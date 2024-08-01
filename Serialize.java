package com.posh;

import java.io.*;

class Employee implements java.io.Serializable {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public class Serialize {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setId("E1001");

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(employee);
            System.out.println("Employee object has been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        Employee deserializedEmployee = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Employee object has been deserialized.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Output
        System.out.println("Deserialized Employee: " + deserializedEmployee.getName() + ", " + deserializedEmployee.getId());
    }
}
