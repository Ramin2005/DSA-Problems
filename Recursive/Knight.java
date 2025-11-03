
import java.util.HashSet;
import java.util.Set;

public class Knight {

    public static void f(int[][] board, int size, int[] position, int move, Set<int[][]> resultSet) {
        if (move == size * size + 1) {
            int[][] copy = new int[8][8];
            for (int i = 0; i < size; i++) {
                copy[i] = board[i].clone();
                for (int a : copy[i]) {
                    System.out.print(a + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
            resultSet.add(copy);
        } else {

            int x = position[0];
            int y = position[1];
            //1
            if ((x - 2 >= 0) && (y - 1 >= 0) && (x - 2 < size) && (y - 1 < size)) {
                if (board[x - 2][y - 1] == 0) {
                    board[x - 2][y - 1] = move;
                    int[] temp = {x - 2, y - 1};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x - 2][y - 1] = 0;
                }
            }

            //2
            if ((x + 2 >= 0) && (y - 1 >= 0) && (x + 2 < size) && (y - 1 < size)) {
                if (board[x + 2][y - 1] == 0) {
                    board[x + 2][y - 1] = move;
                    int[] temp = {x + 2, y - 1};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x + 2][y - 1] = 0;
                }
            }

            //3
            if ((x - 2 >= 0) && (y + 1 >= 0) && (x - 2 < size) && (y + 1 < size)) {
                if (board[x - 2][y + 1] == 0) {
                    board[x - 2][y + 1] = move;
                    int[] temp = {x - 2, y + 1};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x - 2][y + 1] = 0;
                }
            }

            //4
            if ((x + 2 >= 0) && (y + 1 >= 0) && (x + 2 < size) && (y + 1 < size)) {
                if (board[x + 2][y + 1] == 0) {
                    board[x + 2][y + 1] = move;
                    int[] temp = {x + 2, y + 1};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x + 2][y + 1] = 0;
                }
            }

            //5
            if ((x - 1 >= 0) && (y - 2 >= 0) && (x - 1 < size) && (y - 2 < size)) {
                if (board[x - 1][y - 2] == 0) {
                    board[x - 1][y - 2] = move;
                    int[] temp = {x - 1, y - 2};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x - 1][y - 2] = 0;
                }
            }

            //6
            if ((x + 1 >= 0) && (y - 2 >= 0) && (x + 1 < size) && (y - 2 < size)) {
                if (board[x + 1][y - 2] == 0) {
                    board[x + 1][y - 2] = move;
                    int[] temp = {x + 1, y - 2};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x + 1][y - 2] = 0;
                }
            }

            //7
            if ((x - 1 >= 0) && (y + 2 >= 0) && (x - 1 < size) && (y + 2 < size)) {
                if (board[x - 1][y + 2] == 0) {
                    board[x - 1][y + 2] = move;
                    int[] temp = {x - 1, y + 2};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x - 1][y + 2] = 0;
                }
            }

            //8
            if ((x + 1 >= 0) && (y + 2 >= 0) && (x + 1 < size) && (y + 2 < size)) {
                if (board[x + 1][y + 2] == 0) {
                    board[x + 1][y + 2] = move;
                    int[] temp = {x + 1, y + 2};
                    f(board, size, temp, (move + 1), resultSet);
                    board[x + 1][y + 2] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[5][5];
        board[0][0] = 1;
        int[] position = {0, 0};
        int move = 2;
        Set<int[][]> resultSet = new HashSet<>();
        f(board, 5, position, move, resultSet);
        System.out.println(resultSet.size());
    }
}
