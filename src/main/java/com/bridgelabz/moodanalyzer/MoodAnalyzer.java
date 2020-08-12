package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    public String analyzeMood(String message) {
        if(message.contains("Sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}