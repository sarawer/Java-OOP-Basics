
package com.mycompany.abstractclassandmethode;

public class AbstractClassAndMethode {
     public static void main(String[] args) {
        // Creating objects of subclasses
        oilPoweredCar c1 = new oilPoweredCar(40, "TOYOTA", "SUPRA");
        ElectricCar c2 = new ElectricCar(50, "TESLA", "MODEL X");

        // Calling overridden methods
        c1.carType(); // Output: This is a oil powered car
        c2.carType(); // Output: This is a Electric car
    }

    // Abstract class with common properties and abstract method
    static abstract class car {
        String brand;
        String model;

        car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        abstract void carType(); // To be overridden in subclasses
    }

    // Subclass for oil-powered cars
    public static class oilPoweredCar extends car {
        int oilCapacity;

        oilPoweredCar(int oilCapacity, String brand, String model) {
            super(brand, model); // Calls parent constructor to init brand & model
            this.oilCapacity = oilCapacity;
        }

        @Override // Overriding abstract method from 'car'
        void carType() {
            System.out.println("This is a oil powered car");
        }
    }

    // Subclass for electric cars
    public static class ElectricCar extends car {
        int batteryCap;

        ElectricCar(int batteryCap, String brand, String model) {
            super(brand, model); // Calls parent constructor to init brand & model
            this.batteryCap = batteryCap;
        }

        @Override // Overriding abstract method from 'car'
        void carType() {
            System.out.println("This is a Electric car");
        }
    }

}
