package Student;

public abstract class Marks {
    double exam1;
    double exam2;
    double exam3;
    Marks (double exam1,double exam2,double exam3){

        this.exam1=exam1;
        this.exam2=exam2;
        this.exam3=exam3;
    }

    abstract void getPercentage();
}
class Test{
    public static void main(String[] args) {
        A a=new A(50,75,100);
        a.getPercentage();
        B b=new B(60,86,95);
        b.getPercentage();

    }
}