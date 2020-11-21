public class BmiService {
    public float calculate(float weight, float growth) {
        float index = weight / growth / growth * 100 * 100;
        return index;
    }
}
