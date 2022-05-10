// 작성자 : 19_홀수_김재환

package com.javaex.ex01;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", "010-1111-2222");
		Person p02 = new Customer("유재석", "010-2222-3333", 1, 1000);
		
		p01.showInfo();
		p02.showInfo();
	}

}
