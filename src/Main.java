public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 63F;
        float growth = 165F;
        float index = service.calculate(weight, growth);
        System.out.println(index);
    }
}
