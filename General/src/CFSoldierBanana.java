import java.util.*;

public class CFSoldierBanana {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int dollars = in.nextInt();
		int num = in.nextInt();
		
		int cost = num * (num+1) / 2;
		cost *= first;
		
		System.out.println(Math.max(cost-dollars, 0));

	}

}
