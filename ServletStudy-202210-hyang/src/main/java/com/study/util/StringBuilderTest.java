package com.study.util;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str = "문자열1";
		str += "문자열2";
		str = str.replaceAll("문자열2", "문자열3");
		
		System.out.println(str);
		
		// StringBuilder() => default로 16칸(32byte)을 잡고 있다. 칸마다 char의 형을 갖고 있어서 32byte이다. 만약 (32)를 쓰면 총 128byte
		StringBuilder builder = new StringBuilder(); // 비동기
		StringBuffer buffer = new StringBuffer(); // 동기		
	}

}
