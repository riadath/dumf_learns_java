package LabExam1;

public class Memory {
    private int physicalAddress;
    private int n;
    private int m;

    Memory(int physicalAddress, int n, int m){
        this.physicalAddress = physicalAddress;
        this.n = n;
        this.m = m;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setM(int m) {
        this.m = m;
    }
    public int getM() {
        return m;
    }
    public int getN(){
        return n;
    }
}
