package com.bridgelabz.moodanalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class MoodAnalyserTest {

        @Test
        public void givenMessage_WhenProper_ShouldReturnSad() { //TC 1.1 "I am in sad mood"
            MoodAnalyzer moodAnalyser=new MoodAnalyzer("I am in sad mood");
            String result=moodAnalyser.analyzeMood();
            Assertions.assertEquals("SAD", result);
        }
        @Test
        public void givenMessage_WhenProper_ShouldReturnHappy() { //TC 1.1 "I am in happy mood"
            MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy mood");
            String result1 = moodAnalyser.analyzeMood();
            Assertions.assertEquals("Happy", result1);
        }
        @Test
        public void testMoodAnalysis_whenMoodIsNull() { //tc 2.1
            MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
            String mood2 = moodAnalyzer.analyzeMood();
            Assertions.assertEquals(mood2,"HAPPY");
        }
}
