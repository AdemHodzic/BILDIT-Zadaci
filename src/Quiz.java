
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
	
	
}
