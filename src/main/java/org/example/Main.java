package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TC 3.1: EMPTY Mood
        try {
            MoodAnalyser analyser = new MoodAnalyser("");
            System.out.println("UC3 - TC3.1 - Mood: " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("UC3 - TC3.1 - Exception: " + e.getType() + " - " + e.getMessage());
        }

        // TC 3.2: Valid Mood
        try {
            MoodAnalyser analyser = new MoodAnalyser("I am in a happy mood");
            System.out.println("UC3 - TC3.2 - Mood: " + analyser.analyseMood()); // Output: HAPPY
        } catch (MoodAnalysisException e) {
            System.out.println("UC3 - TC3.2 - Exception: " + e.getType() + " - " + e.getMessage());
        }
    }
}