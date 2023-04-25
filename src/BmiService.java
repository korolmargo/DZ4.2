public class BmiService {

    public int calculate(int m, int h) {

       int height = h * h;
        int height2 = height.intValue();
        int calculate = m / height2;

        return calculate;
    }


}
