package loops;

public class predictFutureTuition {
    public static void main (String [] args) {
        // Suppose the tuition for a university is $10,000 for the current year
        // and increases by 7 percent every year.
        //In how many years will the tuition be doubled?
        double tuition = 10000;
        int years = 1;
        double doubleTuition =  tuition * 2;
        while (tuition <= doubleTuition) {
            tuition = tuition * 1.07;
            //System.out.println(tuition);
            years++;
        }

        System.out.println("In " + years + " years the tuition will be doubled");
    }
}
