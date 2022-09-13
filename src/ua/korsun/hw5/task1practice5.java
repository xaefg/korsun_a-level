public class task1practice5 {
    public static void main(String[] args) {
        int[] studentsHeight = {140, 145, -180, 154, -172, 157, -175, -172, 140, 145, -180, 154, -172, 157, -175, -172,
                140, 145, -180, 154, -172, 157, -175, -172, -176};
        System.out.println(averageStudentHeight(studentsHeight));

    }
    public static String averageStudentHeight(int[] studentsHeight) {
        int boysHeight = 0;
        int boysCount = 0;
        int girlsHeight = 0;
        int girlCount = 0;
        for (int j : studentsHeight) {
            if (j < 0) {
                boysHeight += j;
                boysCount++;
            } else {
                girlsHeight += j;
                girlCount++;
            }
        }
        boysHeight = Math.abs(boysHeight) / boysCount;
        girlsHeight = girlsHeight / girlCount;
        return "girls average " + girlsHeight + " boys average " + boysHeight;
    }
}