package com.bridgelabz.ExerciseProblems;

public class LegacyAPI {
    static void oldFeature(){
        System.out.println("This is the old Feature");
    }
    static void newFeature(){
        System.out.println("This is the new Feature");
    }

        public static void main(String[] args){
            LegacyAPI api= new LegacyAPI();

            api.oldFeature();
            api.newFeature();
        }
}
/*
This is the old Feature
This is the new Feature
 */