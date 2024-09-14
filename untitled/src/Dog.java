import javax.management.MBeanRegistrationException;

public class Dog {
    private String name;
    private int age;
    private String breed;

    // method
    public static void bark() {
        System.out.println("Dog is barking");
    }

    Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    Dog(){}

    public static void main(String[] args) {

    }
}
