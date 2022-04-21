package com.bit.day05;
/*
학생성적 관리프로그램(ver 0.1.0)
한 학생의 성적을 통해 다음을 출력하시오
요구사항
과목은 3과목
과목별 성적은 : 국어:84, 영어:93, 수학:70
매 실행시 성적은 변경될 것임
평균은 소수점 2자리수까지만 출력

결과
-------------------------------
국어:84		영어:93		수학:70
-------------------------------
합계:000
평균:00.00
-------------------------------
학점:B학점
(100~90이상:A, 90미만~80이상:B,
80미만~70이상:C, 70미만 60이상:D, 60미만:F)
 */

public class Ex08 {

	public static void main(String[] args) {
		String title = "학생 성적관리 프로그램(ver 0.1.0)";
		System.out.println(title);
		
		int kor=84;
		int eng=93;
		int math=70;
		System.out.println("---------------------------");
		System.out.println("국어:"+kor+ "   영어:"+eng+"   수학:"+math);
		System.out.println("---------------------------");
		System.out.println("합계:"+(kor+eng+math));
		System.out.println("평균:"+(kor+eng+math)*100/3/100.0);
		System.out.println("---------------------------");
		System.out.println("표현법1");
		if((kor+eng+math)*100/3/100.0>=90)
			System.out.println("학점:A학점");
		if((kor+eng+math)*100/3/100.0<90&&(kor+eng+math)*100/3/100.0>=80)
			System.out.println("학점:B학점");
		if((kor+eng+math)*100/3/100.0<80&&(kor+eng+math)*100/3/100.0>=70)
			System.out.println("학점:C학점");
		if((kor+eng+math)*100/3/100.0<70&&(kor+eng+math)*100/3/100.0>=60)
			System.out.println("학점:D학점");
		if((kor+eng+math)*100/3/100.0<60)
			System.out.println("학점:F학점");
		System.out.println("---------------------------");
		System.out.println("표현법2");
		if((kor+eng+math)*100/3/100.0>=90)
			System.out.println("학점:A학점");
		else if((kor+eng+math)*100/3/100.0>=80)
			System.out.println("학점:B학점");
		else if((kor+eng+math)*100/3/100.0>=70)
			System.out.println("학점:C학점");
		else if((kor+eng+math)*100/3/100.0>=60)
			System.out.println("학점:D학점");
		else
			System.out.println("학점:F학점");
		System.out.println("---------------------------");
		System.out.println("표현법3");
		switch((kor+eng+math)/30) {
		case 10:case 9:System.out.println("학점:A학점");break;
		case 8:System.out.println("학점:B학점");break;
		case 7:System.out.println("학점:C학점");break;
		case 6:System.out.println("학점:D학점");break;
		default:System.out.println("학점:F학점");break;
		}
		System.out.println("---------------------------");
		System.out.println("표현법4");
		switch((int)((kor+eng+math)*100/3/100.0)) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:	
		case 90:
			System.out.println("학점:A학점");
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:	
		case 81:
		case 80:
			System.out.println("학점:B학점");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:	
		case 71:
		case 70:
			System.out.println("학점:C학점");
			break;
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:	
		case 61:
		case 60:
			System.out.println("학점:D학점");
			break;
		default:
			System.out.println("학점:F학점");
			break;
		}
		System.out.println("---------------------------");
		
		System.out.println("(평균이 100~90이상:A, 90미만~80이상:B, \n80미만~70이상:C, 70미만 60이상:D, 60미만:F)");
		
		System.out.println("이용해주셔서 감사합니다");
		
		System.out.println("---------------------------");
		int sum=kor+eng+math;
		
		double avg=(double)sum/3;
		char grade = ' ';
		
		if(avg>=90 && avg<=100) grade = 'A';
		else if(avg<90 && avg>=80) grade = 'B';
		else if(avg<80 && avg>=70) grade = 'C';
		else if(avg<70 && avg>=60) grade = 'D';
		else if(avg<60) grade = 'F';

		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f \n", avg);
		System.out.printf("등급 : %c", grade);
	
	}
}
