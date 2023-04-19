import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class testing {
    

    static int pointsScore(String[] subjectGrades){
        TreeMap<String,Integer> gradeToPoints = new TreeMap<String,Integer>();
        //Mapping higherlevel subjects
        gradeToPoints.put("H1",100);
        gradeToPoints.put("H2",88);
        gradeToPoints.put("H3",77);
        gradeToPoints.put("H4",66);
        gradeToPoints.put("H5",56);
        gradeToPoints.put("H6",46);
        gradeToPoints.put("H7",37);
        gradeToPoints.put("H8",0);
        //Mapping ordinarylevel subjects
        gradeToPoints.put("O1",56);
        gradeToPoints.put("O2",46);
        gradeToPoints.put("O3",37);
        gradeToPoints.put("O4",28);
        gradeToPoints.put("O5",20);
        gradeToPoints.put("O6",12);
        gradeToPoints.put("O7",0);
        gradeToPoints.put("O8",0);

        int score=0;
        ArrayList<Integer> allScores = new ArrayList<Integer>();
        for(int i=0;i<subjectGrades.length;i++){
            allScores.add(gradeToPoints.get(subjectGrades[i]));
        }
        Collections.sort(allScores);
        Collections.sort(allScores, Collections.reverseOrder());
        

        for(int j=0;j<6;j++){
            score += allScores.get(j);
        }
        return score;
        

    }
    public static void main(String[] args){
        String[] subjectGrades = {"H1","H1","H1","H1","O4","H1","H1"};
        System.out.println(pointsScore(subjectGrades));
    }
}
