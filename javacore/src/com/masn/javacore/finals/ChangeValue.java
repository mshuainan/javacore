package com.masn.javacore.finals;

public class ChangeValue {
	public static void main(String[] args) {
		MyClass2 myClass = new MyClass2();
		StringBuffer buffer = new StringBuffer("hello");
		myClass.changeValue(buffer);
		System.out.println(buffer.toString());
	}
}

class MyClass2 {
	void changeValue(StringBuffer buffer) {
		System.out.println(buffer);
		buffer = new StringBuffer("hello2");
		buffer.append("world");
		System.out.println(buffer);
	}
}
