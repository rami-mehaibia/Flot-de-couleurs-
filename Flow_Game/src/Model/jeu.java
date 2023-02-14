package Model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.ArrayList;
public class jeu {
    //initialisation le tab par les case Model
    private ArrayList<CaseType[][]> levels;
    private CaseType[][] level1;
    private CaseType caseType;

    public jeu() {
        levels = new ArrayList<CaseType[][]>();
        level1 = level1();
        levels.add(level1);
    }


    private CaseType[][] level1() {
        level1 = new CaseType[6][6];
        level1[0][0] = CaseType.S1;
        level1[0][1] = CaseType.S2;
        level1[0][2] = CaseType.S3;
        level1[0][4] = CaseType.S4;
        level1[0][5] = CaseType.S5;
        level1[1][4] = CaseType.S6;
        level1[2][2] = CaseType.S3;
        level1[3][2] = CaseType.S4;
        level1[4][0] = CaseType.S1;
        level1[4][2] = CaseType.S2;
        level1[5][0] = CaseType.S6;
        level1[5][2] = CaseType.S5;
        return level1;
    }

    public CaseType[][] getLevel1() {

        return level1;
    }

    public void setLevel1(CaseType[][] level1) {

        this.level1 = level1;
    }


}
