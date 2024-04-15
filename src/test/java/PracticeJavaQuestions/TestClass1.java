package PracticeJavaQuestions;

public class TestClass1 {


    public static void main(String[] args) {

        String abc = "ankur";

        char [] strArray = abc.toCharArray();

        for(int i=strArray.length-1;i>=0;i--){
            System.out.print(strArray[i]);

        }
    }
}
