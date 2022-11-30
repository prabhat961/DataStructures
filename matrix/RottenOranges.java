package matrix;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	
	public static int orangesRotting(int[][] mat) {
		if(mat == null || mat.length == 0)
			return 0;
		int rows = mat.length;
		int col = mat[0].length;
		Queue<int[]>q = new LinkedList<>();
		int count_freash = 0;
		for( int i = 0; i < rows; i++) {
			for ( int j = 0; j < col; j++) {
				if(mat[i][j] == 2) {
					q.offer(new int[] {i, j});
				}
				if( mat[i][j] != 0) {
					count_freash++;
				}
			}
		}
		if(count_freash == 0)
			return 0;
		int count_min = 0, cnt = 0;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		
		while(!q.isEmpty()) {
			int size = q.size();
			for( int i = 0; i < size; i++) {
				int[] point = q.poll();
				for( int j = 0; j < 4; j++) {
					int x = point[0] + dx[j];
					int y = point[1] + dy[j];
					
					if( x < 0 || y < 0 || x >= rows || y >= col || mat[x][y] == 0 || mat[x][y] ==2 )
						continue;
					
					mat[x][y] = 2;
					q.offer(new int[] {x, y});
				}
			}
			if(q.size() != 0) {
				count_min++;
			}
		}
		return count_freash == cnt ? count_min: -1;
	}

	public static void main(String[] args) {
		

	}

}
