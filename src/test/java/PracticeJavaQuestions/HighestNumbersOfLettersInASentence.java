package PracticeJavaQuestions;

import org.openqa.selenium.remote.http.Routable;

public class HighestNumbersOfLettersInASentence {

    public static void main(String[] args) {

        String input = "hello this is ankur surothia automation tester";

        int characterCount= wordcountFromSentence(input);
        System.out.println(characterCount);
    }

    public static int wordcountFromSentence(String str){

        String[] inputStr = str.split(" ");

        int maxCount = 0;
        for(String word : inputStr ){
            int letterCount = 0;
            for(int i=0;i<word.length();i++){ //[hello]
                if(Character.isLetter(word.charAt(i))){
                    letterCount++;
                }

                if(letterCount>maxCount){
                    maxCount=letterCount;
                }
            }
        }

        return maxCount;
    }
}


