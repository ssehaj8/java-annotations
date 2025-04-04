package com.bridgelabz.ExerciseProblems;

public class AnimalSound {
    static class Animal{
        public void makeSound() {
            System.out.println("Some geniric animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }

        public static void main(String[] args){
            Animal myDog=new Dog();
            myDog.makeSound();

    }
}
/*
Woof! Woof!
 */