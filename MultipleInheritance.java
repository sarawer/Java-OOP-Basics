package com.mycompany.multipleinheritance;

public class MultipleInheritance {

    public static void main(String[] args) {
        // Creating a SchoolBoy object and passing the name "sarawer"
        SchoolBoy x = new SchoolBoy("sarawer");
        
        // Calling Play method (from Player interface)
        x.Play();//output:"sarawer is playing football."
        
        // Calling Study method (from Student interface)
        x.Study();//output:"sarawer is studying for exams."
    }
    
    // Interface representing a student's behavior
    public interface Student {
        void Study();
    }
    
    // Interface representing a player's behavior
    public interface Player {
        void Play();
    }
    
    // SchoolBoy class implements both Student and Player interfaces
    public static class SchoolBoy implements Student, Player {
    
        
        String name;
        SchoolBoy(String name){
            this.name = name;
        }
        
        // Implementing the Study method from Student interface
        @Override
        public void Study() {
            System.out.println(name + " is studying for exams.");
        }
        
        // Implementing the Play method from Player interface
        @Override
        public void Play() {
            System.out.println(name + " is playing football.");
        }
    }
}
