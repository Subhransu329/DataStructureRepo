package com.ds.ifelse;

import java.util.Scanner;

public class GradeInExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the mark number::");
		int mark =  scn.nextInt();
		GradeInExam exam = new GradeInExam();
		exam.enterMarkDetails(mark);
		
	}
	
	public int enterMarkDetails(int mark) {
		if(mark<=25) {
			System.out.println("grade will:: F");
		}else if(mark>=25 && mark <=45) {
			System.out.println("grade will be E");
		}else if(mark>=45 && mark<=50) {
			System.out.println("grade will be D");
		}else if(mark>=50 && mark<=60) {
			System.out.println("grade will be c");
		}else if(mark>=60 && mark<=80) {
			System.out.println("grade will be B");
		}else if(mark>=80) {
			System.out.println("grade will be A");
		}else {
			System.out.println("no mark");
		}
		return mark;
	}

}
