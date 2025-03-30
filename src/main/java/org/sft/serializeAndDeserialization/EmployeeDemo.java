package org.sft.serializeAndDeserialization;

import java.io.*;

public class EmployeeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeDetails employeeDetails = new EmployeeDetails();
        File file = new File(System.getProperty("user.dir")+"/testData/empDetails.txt");
        employeeDetails.setId(500);
        employeeDetails.setName("Siva");
        employeeDetails.setEmail("siva@yopmail.com");

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employeeDetails);
        objectOutputStream.close();
        fileOutputStream.close();

        EmployeeDetails employeeDetails1 = null;
        //De-Serialization
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        employeeDetails1 = (EmployeeDetails) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println(employeeDetails1.getEmail());
        System.out.println(employeeDetails1.getName());
        System.out.println(employeeDetails1.getId());
    }
}
