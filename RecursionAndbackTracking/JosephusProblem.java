package RecursionAndbackTracking;

public class JosephusProblem {
	//if n starts from 0:
	public static int jos( int n, int k) {
		if(n == 1)
			return 0;
		return (jos(n-1, k)+ k) % n;
	}
	//if n starts from 1:
	public static int myJos(int n, int k){
		return(jos(n, k) + 1);
	}

	public static void main(String[] args) {
		 System.out.println(jos(5, 3));  

	}

}
