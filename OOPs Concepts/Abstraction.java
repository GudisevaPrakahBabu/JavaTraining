// Main class
public class Abstraction{

    // Main method
    public static void main(String[] args) {
        
        Animal dog = new Dog(); // Creating dog as an reference variable to initialize Dog sub class which extends to Animal 
        Animal cat = new Cat(); // Creating cat as an reference variable to initialize Cat sub class which extends to Animal
        
        //Demonstration of Polymorphism --- Method Overriding
        dog.makeSound(); // Dog() overrides method makeSound() in its parent class Animal
        cat.makeSound(); // Cat() overrides method makeSound() in its parent class Animal

        //Demonstration of Polymorphism --- Method OverLoading
        dog.makeSound(2); // Overload's the method makeSound() with int parameter
        cat.makeSound(3); // Overload's the method makeSound() with int parameter
    }

} 


//Parent Class -- Animal 
abstract class Animal                // Abstract class
{
    abstract void makeSound();       // Abstract Method 

    abstract void makeSound(int n);  // Abstract method with same name but different parameters --- Method Overloading
}


// Subclass(Dog) which extends to parent class(Animal)
class Dog extends Animal
{

    @Override
    //Dynamic Polymorphism which overrides the makeSound() in Parent class Animal 
    void makeSound()                // Method Overriding  
    {
        System.out.println("Dog is making sound: Woof! Woooof!" );
    }

    @Override
    // Static Polymorphism --- Method OverLoading
    public void makeSound(int n) 
    {
    	System.out.println("\nDog says: ");
    	for (int i = 0; i < n; i++) 
    	{
    		System.out.println("Woof! ");
    	}
    }

}


//sub-class(Cat) which extends to parent class(Animal)
class Cat extends Animal
{
	
    @Override
    //Dynamic Polymorphism which overrides the makeSound() in Parent class Animal
    void makeSound()                // Method overriding
    {
        System.out.println("Cat is making sound: Meow! Meow!" );
    }

    @Override
    // Static Polymorphism --- Method OverLoading
    public void makeSound(int n) 
    {
    	System.out.println("\nCat says: ");
    	for (int i = 0; i < n; i++) 
    	{
    		System.out.println("Meow! ");
    	}
    }

}

