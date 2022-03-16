public class Grades {
    public int[] grades;
    public int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void addNumber(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    int lastGrade = grades[grades.length - 1];

    int gradeNumber;
    int average;

    public void averageGrade() {
        if (this.size < gradeNumber) {
            average = grades[gradeNumber] + average;
        }
    }

    public int result = average / grades.length;

    public void main(String[] args) {
        addNumber(2);
        System.out.println(result);
    }
}
