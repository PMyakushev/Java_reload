package Unit_2.HomeWork;

/**
 * () Отвалидировать доску судоку
 * /Требования
 * Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
 * 1. Каждая строка должна содержать цифру 1-9 без повторения
 * 2. Каждая колонка должна содержать цифру 1-9 без повторения
 * 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без
 * повторения
 * Ограничения
 * • board.length == 9
 * • board[i].length == 9
 * • board[i][j] значение число или '.'
 * 
 * public class Main {
 * public static void main(String[] args) {
 * char[][] board = {
 * {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
 * {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
 * {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
 * {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
 * {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
 * {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
 * {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
 * {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
 * {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
 */

public class Tusk_04 {
    /**
     * @param args
     *             Отвалидировать доску судоку
     *             /*Требования
     *             Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с
     *             правилами
     *             1. Каждая строка должна содержать цифру 1-9 без повторения
     *             2. Каждая колонка должна содержать цифру 1-9 без повторения
     *             3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру
     *             1-9 без повторения
     *             Ограничения
     *             • board.length == 9
     *             • board[i].length == 9
     *             • board[i][j] значение число или '.'
     */
    public boolean isValidSudoku(char[][] board) {

        int rowSize = 9;
        int colSize = 9;

        // Строки
        for (int i = 0; i < rowSize; i++) {

            if (!isValidRow(board, i, colSize))
                return false;
        }

        // Колонки
        for (int i = 0; i < colSize; i++) {

            if (!isValidCol(board, i, rowSize))
                return false;
        }

        // Валидация
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                // i и j -начальный индекс ячейки
                if (!isValidBox(board, i, j))
                    return false;
            }
        }

        return true;
    }

    public boolean isValidRow(char[][] board, int row, int colSize) {

        boolean[] visited = new boolean[colSize + 1];

        for (int i = 0; i < colSize; i++) {

            if (board[row][i] == '.')
                continue;

            int ind = board[row][i] - '0';

            if (visited[ind])
                return false;

            visited[ind] = true;
        }

        return true;
    }

    public boolean isValidCol(char[][] board, int col, int rowSize) {

        boolean[] visited = new boolean[rowSize + 1];

        for (int i = 0; i < rowSize; i++) {

            if (board[i][col] == '.')
                continue;

            int ind = board[i][col] - '0';

            if (visited[ind])
                return false;

            visited[ind] = true;
        }

        return true;
    }

    public boolean isValidBox(char[][] board, int row, int col) {

        boolean[] visited = new boolean[10]; // 0 - 9

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[row + i][col + j] == '.')
                    continue;

                int ind = board[row + i][col + j] - '0';

                if (visited[ind])
                    return false;

                visited[ind] = true;
            }
        }

        return true;
    }
}
