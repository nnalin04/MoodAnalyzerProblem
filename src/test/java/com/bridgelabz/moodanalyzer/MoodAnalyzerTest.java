package com.bridgelabz.moodanalyzer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    /*
     * function to test for sad mood.
     */
    public void givenMessage_whenSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    /*
     * function to test for any thing but sad mood.
     */
    public void givenMessage_whenNotSad_shouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
        String mood = moodAnalyzer.analyzeMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    /*
     * function to test for NULL input.
     */
    public void givenMessage_whenNull_shouldThrowException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        try{
            String mood = moodAnalyzer.analyzeMood();
        }catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    /*
     * function to test for NULL input.
     */
    public void givenMessage_whenEmpty_shouldThrowException(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        try{
            String mood = moodAnalyzer.analyzeMood();
        }catch (MoodAnalyzerException e){
            Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
        }
    }
}
