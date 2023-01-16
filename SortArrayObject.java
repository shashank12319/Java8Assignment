package com.assigmentjava8;

import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   // public int compareTo(Person other) {
        //return this.age - other.age;
   // }

    public String toString() {
        return name + ":" + age;
    }

	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class SortArrayObject {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 35)
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}
