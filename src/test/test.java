package test;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.remove(1);
        arrayList.add(1, 3);
        arrayList.set(1, 4);
        arrayList.add(5);
        System.out.println(arrayList);
    }
}
