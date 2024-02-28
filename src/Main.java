import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>();
        arrayList.add("Banan");
        arrayList.add("Jabłko");
        arrayList.add("Pomarańcza");
        arrayList.add("Wisnia");
        arrayList.add("Gruszka");
        arrayList.add("Truskawka");
        arrayList.add("Malina");
        arrayList.add("Jagoda");
        arrayList.add("Czereśnia");




       for (String owoce : arrayList) System.out.println(owoce);
        System.out.println("----------------------");
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
            }
        });
        for (String owoce : arrayList) System.out.println(owoce);
        System.out.println("----------------------");
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Malina"));
        arrayList.remove("Gruszka");
        System.out.println("----------------------");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.set(5,"Agrest");
        System.out.println(arrayList);


        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("borowka");
        arrayList1.add("pigwa");
        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);

        System.out.println("----------------------");

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(3);
        linkedList = Arrays.asList(4,10,20,43,5,6,7,8,9,11,12,13,14,15,16,17);


        System.out.println(linkedList);
        linkedList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(linkedList);


    }
}
