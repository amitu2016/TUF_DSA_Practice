package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralPrint {

	public static List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> ans = new ArrayList<Integer>();

		int r = matrix.length;
		int c = matrix[0].length;

		int topRow = 0;
		int rightColumn = c - 1;
		int bottomRow = r - 1;
		int leftColumn = 0;

		while (topRow <= bottomRow && leftColumn <= rightColumn) {

			// calculate top row
			for (int i = leftColumn; i <= rightColumn; i++) {
				ans.add(matrix[topRow][i]);
			}

			topRow++;

			// calculate right column
			for (int i = topRow; i <= bottomRow; i++) {
				ans.add(matrix[i][rightColumn]);
			}

			rightColumn--;

			// calculate bottom row
			if (topRow <= bottomRow) {
				for (int i = rightColumn; i >= leftColumn; i--) {
					ans.add(matrix[bottomRow][i]);
				}
			}

			bottomRow--;

			// calculate left column
			if (leftColumn <= rightColumn) {
				for (int i = bottomRow; i >= topRow; i--) {
					ans.add(matrix[i][leftColumn]);
				}
			}

			leftColumn++;

		}

		return ans;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> ans = spiralOrder(mat);

		System.out.println(ans);
	}

}
