package notas;

public class Notas {

    public static void main(String[] args) {
        System.out.println("Top students");
        
        String[] students = {"Maria", "Luis", "Pedro", "Sofia", "Carlos"};
        double[] grades = {18.5, 16.0, 19.2, 15.7, 18.5}; 
        
        String top1name = "", top2name = "", top3name = "";
        double top1grade = -1, top2grade = -1, top3grade = -1;
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > top1grade) {
                top3grade = top2grade;
                top3name = top2name;

                top2grade = top1grade;
                top2name = top1name;
    
                top1grade = grades[i];
                top1name = students[i];
            } else if (grades[i] > top2grade) {
                top3grade = top2grade;
                top3name = top2name;

                top2grade = grades[i];
                top2name = students[i];
            } else if (grades[i] > top3grade) {
                top3grade = grades[i];
                top3name = students[i];
            }
        }

        System.out.println("Top 1: " + top1name + " - " + top1grade);
        System.out.println("Top 2: " + top2name + " - " + top2grade);
        System.out.println("Top 3: " + top3name + " - " + top3grade);
    }
}