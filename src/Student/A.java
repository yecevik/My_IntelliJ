package Student;

public class A extends Marks{


    A(double exam1, double exam2, double exam3) {
        super(exam1, exam2, exam3);
    }

    @Override
    void getPercentage() {
        System.out.println("percentage is: "+(exam1+exam2+exam3)/3);
    }
}
