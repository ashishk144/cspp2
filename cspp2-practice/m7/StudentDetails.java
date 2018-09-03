
class Student {
    String name, id;
    double grade1, grade2, grade3;
    Student(String name, String id, double grade1,
        double grade2, double grade3) {
        this.name = name;
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }
    public double CalculateGPA() {
        return (this.grade3 + this.grade2 + this.grade1)/3.0;
    }
}

class StudentDetails {
    /**
     * Main function
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
    Student st1 = new Student("Sangay", "IT201985001", 7.5, 7.0, 8.0);
    Student st2 = new Student("Bidhya", "IT201985003", 8.5, 6.0, 7.5);
    Student st3 = new Student("Kelzang", "IT201985065", 7.5, 8.0, 9.0);
    System.out.format("%.1f\n", st1.CalculateGPA());
    System.out.format("%.1f\n", st2.CalculateGPA());
    System.out.format("%.1f\n", st3.CalculateGPA());
    }
}