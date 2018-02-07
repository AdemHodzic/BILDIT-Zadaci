
public class Quiz {

	public static void main(String[] args) {
		
		
		if(tacan(rand1,oper,rand2,odgovor)){
			System.out.println("Tacan odgovor");
		}else{
			System.out.println("Vise srece drugi put");
		}
	}
	
	public static boolean tacan(int a, int oper,int  b,int  odg){
		int temp = izracunaj(a,b,oper);
		if(temp == odg) return true;
		return false;
	}
	
	public static int izracunaj(int a,int b,int oper){
		switch(oper){
			case 1:
				return sabiranje(a,b);
				
			case 2:
				return oduzimanje(a,b);
			case 3:
				return mnozenje(a,b);
			case 4:
				return dijeljenje(a,b);
			case 5:
				return (int)korjenovanje(a);
			case 6:
				return kvadriranje(a);
		}
		return -1;
	}
	
	
	public static int sabiranje (int a, int b){
		return a+b;
	}
	public static int oduzimanje (int a, int b){
		return a-b;
	}
	public static int mnozenje (int a, int b){
		return a*b;
	}
	public static int dijeljenje(int a, int b){
		return a/b;
	}
	public static double korjenovanje(int a){
		return Math.sqrt(a);
	}
	public static int kvadriranje(int a){
		return a*a;
		}
}
