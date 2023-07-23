package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        char[][] carr = new char[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (j >= i && j <= height - i - 1)
                    carr[i][j] = '8';
                else
                    carr[i][j] = ' ';
            }
        }

        for (int i = height - 1; i > Math.round(height / 2) - 1; i--) {
            for (int j = 0; j < height; j++) {
                if ( j >= height - i -1 && j <= i )
                    carr[i][j] = '8';
                else
                    carr[i][j] = ' ';
            }
        }
        for (char[] c: carr) {
            System.out.println(c);
        }
    }
}
