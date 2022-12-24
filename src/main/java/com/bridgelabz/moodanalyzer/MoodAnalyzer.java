package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String analyzeMood(String message){
        if (message.contains("sad")){
            return "SAD";
        }
        else if(message.contains("happy")){
            return "HAPPY";
        }
        else {
            return "";
        }
    }

}
