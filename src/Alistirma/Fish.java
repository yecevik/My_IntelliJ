package Alistirma;

public class Fish implements Prey,Predetor{

    @Override
    public void hunt() {
        System.out.println("Fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("Fish is fleeing");
    }
}
