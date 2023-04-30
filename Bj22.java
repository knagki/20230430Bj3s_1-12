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
