package bj3;
// Bj 2729
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj21 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < 10; i++) {
			System.out.printf(n +" * "+ i + " = " + n*i+"\n");
		}
	}
}
