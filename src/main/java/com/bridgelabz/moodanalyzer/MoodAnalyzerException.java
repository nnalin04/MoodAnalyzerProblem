package com.bridgelabz.moodanalyzer;

public class MoodAnalyzerException extends RuntimeException{

    enum ExceptionType{
        EMPTY, NULL
    }

    ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
