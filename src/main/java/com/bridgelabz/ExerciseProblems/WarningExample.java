package com.bridgelabz.ExerciseProblems;
import java.util.ArrayList;

public class WarningExample {

        @SuppressWarnings("unchecked")
        public void uncheckedWarningExample() {
            ArrayList list = new ArrayList();
            list.add("Sehaj");
            list.add(8);

            System.out.println("List contents: " + list);
        }

        public static void main(String[] args) {
            WarningExample example = new WarningExample();
            example.uncheckedWarningExample();
        }

}
/*
List contents: [Sehaj, 8]
 */