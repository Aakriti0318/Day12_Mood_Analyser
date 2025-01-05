package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TC 1.1: Sad Mood
        MoodAnalyser analyser = new MoodAnalyser("I am in a sad mood");
        System.out.println("UC1 - TC1.1 - Mood: " + analyser.analyseMood()); // Output: SAD

        // TC 1.2: Any other Mood
        analyser = new MoodAnalyser("I am in any mood");
        System.out.println("UC1 - TC1.2 - Mood: " + analyser.analyseMood()); // Output: HAPPY

    }
}