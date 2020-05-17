package src.iterator;

public class SimpleList {
    private int index = 0;
    private int size = 0;
    private String[] carList = new String[1000];

    public void add(String car) {
        carList[size] = car;
        size++;
    }

    public SimpleIterator getIterator() {
        return new SimpleIterator();
    }

    private class SimpleIterator implements Iterator<Object> {
        @Override
        public boolean hasNext() {
            if (index >= size) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return carList[index++];
            }

            throw new IndexOutOfBoundsException();
        }
    }
}
