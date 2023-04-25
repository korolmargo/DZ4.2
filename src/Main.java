public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int IMT = service.calculate(59, 171);

        System.out.println("Ващ результат: " + IMT);
    }
}