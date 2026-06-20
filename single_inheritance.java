// Parent class
 class Animal {
  void eat() {
  System.out.println("This animal eats food.");
}
}
// Child class inheriting from Animal
class Dog extends Animal {
  void bark() {
  System.out.println("The dog barks.");
}
}
 public class single_inheritance {
public static void main(String[] args) {
// Creating an object of Dog class
Dog myDog = new Dog();
// Calling methods from both parent and child classes
myDog.eat(); // Inherited method
myDog.bark(); // Child class method
}
}
