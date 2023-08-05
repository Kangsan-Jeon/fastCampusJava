package Chapter7.src.grade;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasicGradeEvaluate implements GradeEvaluate{

    HashMap<String , int[]> gradeDefine; // grade: {min_score, max_score}

    public BasicGradeEvaluate() {
        this.gradeDefine.put("A", new int[] {90, 100});
        this.gradeDefine.put("B", new int[] {80, 89});
        this.gradeDefine.put("C", new int[] {70, 79});
        this.gradeDefine.put("D", new int[] {60, 69});
        this.gradeDefine.put("F", new int[] {0, 59});
    }

    @Override
    public char getGrade() {
        return 0;
    }
}
