package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            MoodAnalyser analyser = new MoodAnalyser(null);
            System.out.println("UC2 - TC2.1 - Mood: " + analyser.analyseMood());
        } catch (MoodAnalysisException e) {
            System.out.println("UC2 - TC2.1 - Exception: " + e.getType() + " - " + e.getMessage());
        }
    }
}