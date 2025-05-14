// Java code template starts here
import java.util.*;
import java.lang.String;

public class Main {

    // Define Animal class here
    public static class Animal{
        String soundAnimalMakes;

        public Animal(String soundGiven){
            soundAnimalMakes = soundGiven;
        }

        public void sound(){
            System.out.println(soundAnimalMakes);
        }
    }
    // Define Dog class here
        public static class Dog extends Animal{
        public Dog(){
            super("Bark!");
        }
    }
    // Define Cat class here
    public static class Cat extends Animal{
        public Cat(){
            super("Meow!");
        }
    }

    public static void main(String[] args) {

        // In this section, you need to add code to receive input
        // and create the corresponding animal object
        Scanner input = new Scanner(System.in);
        String typeOfAnimal = input.nextLine();
        String name = input.nextLine();

        // Replace the placeholders with the appropriate calls
        if(typeOfAnimal.equals("Dog")) {
            Dog dog = new Dog();
            dog.sound();
        } else if(typeOfAnimal.equals("Cat")) {
            Cat cat = new Cat();
            cat.sound();
        } else {
            System.out.println("Animal type not recognized");
        }
    }
} 

// Java code template ends here