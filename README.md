# 20230430Bj3s_1-12
## 백준 for문 풀이
2729번 구구단
```java
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

```
10950번 A+B -3
```java
package bj3;
// Bj 10950
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj22 {
	public static void main(String[] args) throws IOException {
		// 문자열을 받아서 " " 를 못쓴다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트 케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		//" "기준으로 분리함 예) 강기훈 자바 = 강기훈따로 자바 따로 인식
		StringTokenizer st;
		// 문자열을 합쳐줌
		StringBuilder sb = new StringBuilder();
		
//		 sb.append("abc");
//		 sb.append("def");
//		 System.out.println(sb.toString());
//		결과 abcdef 출력
		
		for(int i = 0; i < t; i++) {
			// 문자열" "문자열 입력받고 문자열, 문자열로 인식
			st = new StringTokenizer(br.readLine(), " ");
			// 문자열이 정수로 바뀌고 정수 + 정수 로 합쳐짐
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			// 띄우고 합쳐진 정수 + \n로 줄바꿈 저장
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
```
8393번 합
```java
package bj3;
// Bj 8393
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
```
15552번 빠른 A+B
```java
package bj_for;
//bj 15552번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj24 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
```
