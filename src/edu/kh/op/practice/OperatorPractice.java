package edu.kh.op.practice;
import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("인원 수 : ");
		int num = sc.nextInt();
	
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + candy / num);
		System.out.println("남는 사탕 개수 : " + candy % num);
		
	}
	
	public void practice2() {
		
	
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호(정수만) :");
		int classnumber = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다", 
				grade, classroom, classnumber, name, gender, score);
	}
	
	public void practice3() {
	
		
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = total / 3.0;
		
		System.out.println("합계 : " +  total );
		System.out.printf("평균 : %.1f\n", average );
		
 
		boolean pass = (korean>=40) && (english>=40) && (math >=40) && (average >= 60);
		
		System.out.println( pass ? "합격" : "불합격");
			
		}
	}
	
	


