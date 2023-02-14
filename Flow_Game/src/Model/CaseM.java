package Model;

public class CaseM {
    private int x,y;
    private CaseType Type;

    public CaseM(int x, int y, CaseType type) {
        this.x = x;
        this.y = y;
        Type = type;
    }



    @Override
    public String toString() {
        return "CaseM{" +
                "x=" + x +
                ", y=" + y +
                ", Type=" + Type +
                '}';
    }
}
