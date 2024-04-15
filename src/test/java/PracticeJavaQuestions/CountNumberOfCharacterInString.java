package PracticeJavaQuestions;

public class CountNumberOfCharacterInString {


    public static void countStringChars(String str) {

        int count = 0;

        char[] charArr = str.toCharArray();

        for (int i = 0; i <= charArr.length - 1; i++) {
            for (int j = i+1; j <= charArr.length - 1; j++) {
                if (charArr[i] == charArr[j]) {//n,k,u,r,s u ro t h i a
                    count++;
                    System.out.println(charArr[j]+" Repeated times = "+count);
                    break;
                }


            }

        }
    }

    public static void main(String[] args) {

        countStringChars("ankursurothia");
    }
}
