package com.bridgelabz.moodanalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class MoodAnalyserTest {

        @Test
        public void givenMessage_WhenProper_ShouldReturnSad() {
            MoodAnalyzer moodAnalyser=new MoodAnalyzer();
            String result=moodAnalyser.analyzeMood("I am in sad mood");
            Assertions.assertEquals("SAD", result);
        }
        @Test
        public void givenMessage_WhenProper_ShouldReturnHappy() {
            MoodAnalyzer moodAnalyser = new MoodAnalyzer();
            String result1 = moodAnalyser.analyzeMood("I am in Happy mood");
            Assertions.assertEquals("Happy", result1);
        }
}
