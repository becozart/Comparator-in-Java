import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        // First Exercise

        List<String> idList = new ArrayList<>();

        idList.add("8299328");
        idList.add("929287819");
        idList.add("123");
        idList.add("001928");
        idList.add("001019929");
        idList.add("8299328");

        printList(idList);

        Collections.sort(idList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        printList(idList);

        // Second Exercise

        List<String> itemCountList = new ArrayList<>();

        itemCountList.add("shoes 2");
        itemCountList.add("backpack 3");
        itemCountList.add("pencil 4");
        itemCountList.add("notebook 2");
        itemCountList.add("textbook 1");
        itemCountList.add("computer 1");

        printList(itemCountList);

        Collections.sort(itemCountList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] splitO1 = o1.split(" ");
                String[] splitO2 = o2.split(" ");
                int o1Count = Integer.parseInt(splitO1[1]);
                int o2Count = Integer.parseInt(splitO2[1]);

                if(o2Count - o1Count != 0) {
                    return o2Count - o1Count;
                }

                return splitO1[0].compareTo(splitO2[0]);
            }
        });

        printList(itemCountList);

    }

    public static void printList(List<String> list) {
        for(String item : list) {
            System.out.println(item);
        }
        System.out.println();
    }
}
