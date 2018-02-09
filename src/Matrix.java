
public class Matrix {

	public static void main(String[] args) {
		
	}
	
	public static boolean isSorted(int[] list){
		for(int i = 1;i<list.length;i++){
			if(list[i]<list[i-1]) return false;
		}
		return true;
	}
	
	public static double sumColumn(double[][] m, int columnIndex){
		double sum = 0;
		for(int i = 0;i<m.length;i++){
			sum+=m[i][columnIndex];
		}
		return sum;
	}
	
	public static void sort(int m[][]){
		for(int i = 0;i<m.length;i++){
			bubleSort(m[i]);
		}
	}
	
	public static void bubleSort(int[] m){
		for(int i = 1;i<m.length;i++){
			if(m[i]<m[i-1]){
				m[i]+=m[i-1];
				m[i-1]=m[i]-m[i-1];
				m[i]-=m[i-1];
			}
		}
	}

}
