package src.iterator;

public class SimpleListTest {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.add("A car");
        list.add("B car");
        list.add("C car");
        list.add("D car");
        list.add("E car");

        Iterator<Object> iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator.next();
    }
}
