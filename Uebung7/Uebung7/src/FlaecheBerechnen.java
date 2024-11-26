
public class FlaecheBerechnen {

    public static float flaecheBerechnen(float[][] coord) {
        int n = coord.length;
        float sum = 0.0f;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            sum += (coord[i][0] + coord[j][0]) * (coord[j][1] - coord[i][1]);
        }

        return Math.abs(sum) / 2.0f;
    }

    public static void main(String[] args) {
        /*
        float[][] quadrat = {
            {0, 0},
            {1, 0},
            {1, 1},
            {0, 1}
        };

        float total = flaecheBerechnen(quadrat);
        System.out.println(total);
         */
    }
}
