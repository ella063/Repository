package pl.testuj.oop;

import pl.testuj.access.Person;

public class Student extends Person {

    public void example(final int age) {
        Student student = new Student();
        System.out.println(student.firstname);

        System.out.println(age);
    }
}
