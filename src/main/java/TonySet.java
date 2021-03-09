import javax.sound.midi.Soundbank;

public class TonySet {

    private int size = 0;
    Object[] oarr = new Object[5];

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isExist(Object other) {
        boolean exist = false;
        for(int i=0;i<oarr.length;i++){
            if(other.equals(oarr[i])){
                return true;
            }
        }
        return exist;
    }

    public void add(Object other) {
        if(!isExist(other)){
            oarr[size] = other;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void remove(Object other) {
        boolean ind = false;
        if(isExist(other)){
            for(int i=0;i<oarr.length-1;i++){
                if(other.equals(oarr[i]) || ind){
                    oarr[i] = oarr[i+1];
                    //Once the indicator is true shift the elements
                    ind = true;
                }else{
                    oarr[i] = oarr[i];
                }
            }
        }
    }
}
