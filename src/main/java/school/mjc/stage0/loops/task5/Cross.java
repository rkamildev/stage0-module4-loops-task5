package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        char[][] carr = new char[sideLength][sideLength];
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if ( (i == (sideLength- 1) / 2) || (j == (sideLength-1) / 2) )
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
