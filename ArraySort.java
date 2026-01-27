import java.util.*;
public class ArraySort{
	public static void main(String []args){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(300);
		numList.add(200);
		numList.add(100);
		numList.add(30);
		numList.add(10);
		numList.add(20);
		numList.add(320);
		numList.add(60);
		numList.add(80);
		numList.add(50);
		numList.add(70);
		System.out.println(numList);
		Collections.sort(numList,(d1,d2) -> (d1>d2) ? 1 : (d1<d2) ? -1 : 0);
		System.out.println(numList);
	}
}