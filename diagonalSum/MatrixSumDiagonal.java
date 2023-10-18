package diagonalSum;

public class MatrixSumDiagonal {

	public static int sumDiagonal(int[][] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i+j==a.length-1) {
					sum+=a[i][j];
				}
				if(i==j) {
					sum+=a[i][j];
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		//System.out.println(a.length); //3
		System.out.println(sumDiagonal(a));
	}

}
