package org.example;

public class MoodAnalyser {
    private String mood;

    // Step 1: Constructor to initialize mood
    public MoodAnalyser(String mood) {
        this.mood = mood;
    }

    // Step 2: Method to analyze mood with exception handling for NULL
    public String analyseMood() throws MoodAnalysisException {
        if (mood == null) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD, "Mood is null.");
        }
        return mood.toLowerCase().contains("sad") ? "SAD" : "HAPPY";
    }
}