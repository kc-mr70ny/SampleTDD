public class TonySet {

    private int size = 0;
    Object[] objArr = new Object[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isExist(Object other) {
        for (Object o : objArr) {
            if (other.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void add(Object other) {
        if(!isExist(other)){
            objArr[size] = other;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void remove(Object other) {
        if(isExist(other)){
            for(int i = 0; i < objArr.length; i++){
                if(other.equals(objArr[i])){
                    size--;
                    objArr[i] = objArr[size];
                    objArr[size] = null;
                }
            }
        }
    }
}
