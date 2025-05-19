package com.mycompany._interface;

public class _interface {

    public static void main(String[] args) {
        // Creating object of class dog (which implements interface animal)
        dog a1 = new dog();
        
        // Calling the implemented methods
        a1.eat();   // Output: the dog is eating
        a1.sleep(); // Output: the dog is sleeping
    }

    // Defining an interface named 'animal'
    public static interface animal {
        void eat();   // Abstract method (must be implemented)
        void sleep(); // Abstract method (must be implemented)
    }

    // Class 'dog' implements the 'animal' interface
    public static class dog implements animal {

        // Overriding 'eat' method from interface
        @Override
        public void eat() {
            System.out.println("the dog is eating");
        }

        // Overriding 'sleep' method from interface
        @Override
        public void sleep() {
            System.out.println("the dog is sleeping");
        }
    }

}
