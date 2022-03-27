public class Grades {
    public int[] grades;
    public int size;
    int gradeNumber;
    int average;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void addNumber(int value) {
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGeade() {
        return grades[grades.length - 1];
    }

    public double averageGrade() {
        for (int i = 0; i < grades.length; i++){
            average = average + grades[i];
        }
        return average / size;
    }

    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addNumber(4);
        grades.addNumber(2);
        grades.addNumber(4);
        System.out.println(grades.grades[0]);
        System.out.println(grades.size);
        System.out.println(grades.grades.length);
        System.out.println(grades.getLastGeade());
        System.out.println(grades.averageGrade());
    }
}