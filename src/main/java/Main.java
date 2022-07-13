import exercises.Exercise1;
import exercises.Exercise2;
import exercises.Exercise3;

public class Main {

    public static void main(String[] args) {

        Exercise1 exercise1 = new Exercise1();
        exercise1.distinct();
        exercise1.filter();
        exercise1.map();
        exercise1.cantidadCorreos();
        exercise1.cantidadCorreosGmailHotmailOutlook();
        exercise1.listChangeState();

        Exercise2 exercise2 = new Exercise2();
        exercise2.chat();

        Exercise3 exercise3 = new Exercise3();
        exercise3.calculateDerivate();
        exercise3.calculateIntegral();

    }

}
