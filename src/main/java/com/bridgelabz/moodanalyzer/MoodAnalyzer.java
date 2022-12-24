package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public String message;
      //constructor is used to pass the mood message

      //@param message:passed as parameter in constructor

    public MoodAnalyzer(String message) {
        this.message = message;
        analyzeMood();
    }


     // method is used to return either sad or happy
     //@return sad/happy message

    public String analyzeMood() {
        /**
         * try :where the implementation is done,so it return either sad/happy
         * if message is entered is invalid, then null pointer exception is occured and catch block handles it
         */
        try {
            if (message.contains("sad")) {
                return "SAD";
            }return "HAPPY";

        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}


