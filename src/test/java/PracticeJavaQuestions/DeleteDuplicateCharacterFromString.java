package PracticeJavaQuestions;

public class DeleteDuplicateCharacterFromString {

    public static void deleteDuplicateCharacter(String str){

        char[] strToCharArray = str.toCharArray();
        int count =0;
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<= strToCharArray.length-1;i++){
            for(int j=i+1;j<strToCharArray.length-1;j++){
                if(strToCharArray[i] == strToCharArray[j]){
                    count++;
                    break;
                }
            }

            if(count>1){
                sb.append(strToCharArray[i]);
            }
        }
        System.out.println(sb);
    }
}
