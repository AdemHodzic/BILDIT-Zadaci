import java.util.ArrayList;
import java.util.List;

public class MaxArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(1);
		
		ArrayList<Integer> nullList = new ArrayList<>();
		
		System.out.println("najveci element u list1 je " + max(list1));
		System.out.println("Najveci elemnt u nullList je " + max(nullList));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if(list==null || list.size()==0) return null;
		else if(list.size()==1)  return list.get(0);
		else {
			int max = list.get(0);
			for(int i = 1;i<list.size();i++) {
				if(list.get(i) > max) max = list.get(i);
			}
			return max;
		}
	}

}
