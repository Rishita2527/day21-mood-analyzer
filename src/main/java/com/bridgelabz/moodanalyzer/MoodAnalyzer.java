package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;

    public MoodAnalyzer(String message){
        this.message = message;
        analyzeMood();
    }

    public String analyzeMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}
