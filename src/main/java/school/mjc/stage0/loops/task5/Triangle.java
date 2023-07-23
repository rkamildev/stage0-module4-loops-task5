package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        char[][] carr = new char[cathetusLength][cathetusLength];
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength; j++) {
                if (j > i)
                    carr[i][j] = ' ';
                else
                    carr[i][j] = '8';

            }
        }
        for (char[] c: carr) {
            System.out.println(c);
        }
    }
}
