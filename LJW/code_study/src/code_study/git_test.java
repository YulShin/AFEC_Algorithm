package code_study;

public class git_test {

	public static void main(String[] args) {
		
		//10명이 조퇴를 하고싶은데 그 10명의 이름과 조퇴여부를 출력하고 싶다
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"번째 학생이 조퇴를 신청하였습니다.");
			if (i==5) {
				System.out.println(i+"번쨰 학생은 조퇴가 불가능합니다.");
			}
		}
	}
}

