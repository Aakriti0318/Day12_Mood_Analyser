package org.example;

public class MoodAnalyser {
    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood with exception handling for EMPTY
    public String analyseMood() throws MoodAnalysisException {
        if (mood == null || mood.trim().isEmpty()) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD, "Mood is empty.");
        }
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }

}