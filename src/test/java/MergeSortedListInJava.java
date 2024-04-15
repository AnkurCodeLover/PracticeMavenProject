import java.util.ArrayList;
import java.util.List;

public class MergeSortedListInJava {
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }
 //[1,2]
        // Add remaining elements from list1
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);// i =0;
        list1.add(3);// i =1;
        list1.add(5);// i = 2

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);//j=0;
        list2.add(4);//j=1;
        list2.add(6);//j=2;

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }
}