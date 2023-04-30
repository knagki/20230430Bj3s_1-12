package bj3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sun = 0;
		
		for(int i = 1; i <= n; i++) {
			sun += i;
		}
		System.out.println(sun);
	}
}
