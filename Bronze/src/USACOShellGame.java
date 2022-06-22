import java.util.*;
import java.io.*;

public class USACOShellGame {

	public static void main(String[] args) throws IOException {
		
		Scanner io = new Scanner(new FileReader("square.in"));
		PrintWriter out = new PrintWriter("square.out");
		
		int N = io.nextInt();
		int[] shellAtPosition = new int[3];
		int[] counter = new int[3];

		// Arbitrarily place the shells down
		// Here, we happen to be putting the shell with label i at position i
		for (int i = 0; i < 3; i++) {
			shellAtPosition[i] = i;
		}

		for (int i = 0; i < N; i++) {
			// Zero indexing: offset all positions by 1
			int a = io.nextInt() - 1;
			int b = io.nextInt() - 1;
			int g = io.nextInt() - 1;

			// Perform Bessie's swapping operation
			int t = shellAtPosition[b];
			shellAtPosition[b] = shellAtPosition[a];
			shellAtPosition[a] = t;

			// Count the number of times Elsie guesses each particular shell
			counter[shellAtPosition[g]]++;
		}

		out.println(Math.max(counter[0], Math.max(counter[1], counter[2])));
		io.close();

	}

}
