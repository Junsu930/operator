package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("인원 수 : ");
		int num = sc.nextInt();
	
		System.out.println("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / num);
		System.out.println("남는 사탕 개수 : " + candy % num);
		
		
	}
	
	public void practice2() {
		
		String name;
		int grade;
		int classroom;
		int classnumber;
		String gender;
		double score;
		
		
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("학년(정수만) : ");
		grade = sc.nextInt();
		System.out.println("반(정수만) : ");
		classroom = sc.nextInt();
		System.out.println("번호(정수만) :");
		classnumber = sc.nextInt();
		System.out.println("성별(남학생/여학생) : ");
		gender = sc.next();
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f 이다", 
				grade, classroom, classnumber, name, gender, score);
	}
	
	public void practice3() {
		
		int korean;
		int english;
		int math;
		
		
		System.out.println("국어 : ");
		korean = sc.nextInt();
		System.out.println("영어 : ");
		english = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
		
		int total = korean + english + math;
		
		System.out.println("합계 : " +  total );
		System.out.printf("평균 : %.1f\n", total / 3.0 );
	}

}

