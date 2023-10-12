package com.acorn.day5.ex;

public class ExceptionTest1 {

	public int add(int num1, int num2) throws Exception {
		if (num1 < 0 || num2 < 0) {
			throw new Exception("0보다 커야함");
		}
		return num1 + num2;
	}

	public static void main(String[] args) throws Exception {
		ExceptionTest1 ex = new ExceptionTest1();
		try {
			int result = ex.add(-1, 3);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("음수 오류");
			// e.printStackTrace();
			throw e;
		}

		System.out.println("정상 종료");

	}
}