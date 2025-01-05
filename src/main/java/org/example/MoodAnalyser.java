package org.example;

public class MoodAnalyser {

    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood
    public String analyseMood() {
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }
}