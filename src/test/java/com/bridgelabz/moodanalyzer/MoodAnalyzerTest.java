package com.bridgelabz.moodanalyzer;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    /*
     * function to test for sad mood.
     */
    public void testSadMoodAnalysis(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    /*
     * function to test for any thing but sad mood.
     */
    public void testHappyMoodAnalysis(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}
