package com.yedam;

// Hello 클래스
// 대소문자 구분함 (A - a 서로 다름)
// 객체 지향 언어 (Object Oriented Language)
public class Hello {
	// 메소드 여러개를 선언. start(), main();
	public static void start() {
		System.out.println("시작합니다.");
	}
	// 메인 메소드.
	public static void main(String[] args) {
		// 콘솔에 Hello, World를 출력.
		System.out.println("Hello, World");
		start();
		
		// let result = "Hello";
		OperationExe exe = new OperationExe();
		exe.sum(10, 20);
		// Hello.java -> Hello.class(실행파일)
		// 컴파일(저장하면 eclipse가 자동 컴파일)
		// HelloWorld 프로젝트 - HelloWorld 리포지토리
		
	}
} // end of class
