public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;
        double height = 1.7;
        double imt = service.calculate(weight, height);
        System.out.println(imt);
    }
}