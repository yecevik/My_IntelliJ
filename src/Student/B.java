package Student;

public class B extends Marks{



    B(double exam1, double exam2, double exam3) {
        super(exam1, exam2, exam3);
    }

    @Override
    void getPercentage() {
        System.out.println("percentage is: "+(exam1+exam2+exam3)/3);
    }
}


