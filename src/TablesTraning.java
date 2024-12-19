import java.util.Arrays;

public class TablesTraning {

    public static void main(String[] args) {
        // Tworzenie tablicy 10x10
        int[][] matrix = new int[10][10];

        // Wypełnienie tablicy
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    matrix[i][j] = i; // Na przekątnej umieszczamy liczby od 0 do 9
                } else {
                    matrix[i][j] = 0; // Poza przekątną ustawiamy 0
                }
            }
        }

        // Wyświetlenie tablicy
        System.out.println(Arrays.deepToString(matrix)
                .replace("], ", "]\n") // Formatuje wyjście, by każdy wiersz był w nowej linii
                .replace("[[", "[")   // Usuwa podwójne nawiasy z początku
                .replace("]]", "]")); // Usuwa podwójne nawiasy z końca
    }
}
