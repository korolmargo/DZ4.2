public class BmiService {

    public int calculate(double weight, double  height ) {

        double height2 = height * height;
        double calculate = weight / height2;

        return (int) calculate;
    }


}
