package sebi.previous.y2021;

import java.util.*;

public class DifferenceBetweenDiaonalSum {
	
	public static int diagonalSumDifference(int N, int[][] Grid) {
		
		int d1 = 0, d2 = 0;
        
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(i == j) {
					d1+=Grid[i][j];
				}
				
				if(i == N -j - 1) {
					d2+=Grid[i][j];
				}
				
			}
			
			
		}
		
		return Math.abs(d2 - d1);
		
		
    }

}
