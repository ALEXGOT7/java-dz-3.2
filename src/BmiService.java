public class BmiService {

    public double calculate(double kg, double m) {
        double result = kg / (m * m);
        return result;

    }
}
