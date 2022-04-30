package com.xpanxion.myapp.student0;

public class Person {

    //
    // Data Members
    //

    private static int personCount;
    private int ssn;
    private byte age;
    private String firstName;
    private String lastName;

    //
    // Constructors
    //

    Person() {
        personCount++;
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        personCount++;
    }

    Person(String firstName, String lastName, Byte age, Integer ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        personCount++;
    }

    //
    // Accessors
    //

    public static Integer getPersonCount() {
        return personCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    //
    // Public Methods
    //

    public static String test() {
        return "Test";
    }

    public String speak() {
        String retval = "";
        if (this.firstName == null && this.lastName == null) {
            retval = "I don't have a name.";
        }
        else {
            retval = "My name is " + this.firstName + " " + this.lastName;

            if (this.age != 0) {
                retval += " and I am " + this.age + " years old.";
            } else {
                retval += ".";
            }
        }
        return retval;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        String retval = "";
        if (this.firstName == null && this.lastName == null) {
            retval = "N/A";
        }
        else {
            retval = this.firstName + " " + this.lastName;

            if (this.ssn > 0) {
                retval += " " + Integer.toString(this.ssn).substring(5);
            }
        }
        return retval;
    }

    //
    // Private Methods
    //



}
