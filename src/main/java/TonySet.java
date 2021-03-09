public class TonySet {

    private int size = 0;
    Object[] oarr = new Object[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object other) {
        oarr[size] = other;
        size++;
    }

    public int size() {
        return size;
    }
}
