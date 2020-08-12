package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    String message;

    MoodAnalyzer(){}

    MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood() {
        try{
            if(message.contains("Sad")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "Happy";
        }
    }
}