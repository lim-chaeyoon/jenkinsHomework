package gcu.homework.homework;

public class Homework {

    public String hello() {
        return "Hello!";
    }

    public String selfIntroductions(String name, int age) {
        String selfIntroductions = "My name is" + name + "\nI am " + age + " years old.";
        return selfIntroductions;
    }

    public String contact(String phone) {
        String contact = "Please contact me.\n" + phone;
        return contact;
    }
}
