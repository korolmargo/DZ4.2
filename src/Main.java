public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
       int IMT = service.calculate(59.0, 171.0);

        System.out.println("Ваш результат: " + IMT);
    }
}