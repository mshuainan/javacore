package com.masn.javacore.finals;

/**
 * @ClassName: StaticAndFinal
 * @Description: TODO(static�����ڳ�Ա����������ʾֻ����һ�ݸ�������final��������������֤�������ɱ�)
 * @author masn
 * @date 2018��5��17�� ����11:01:49
 */
public class StaticAndFinal {
	
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		System.out.println(myClass1.i);
		System.out.println(myClass1.j);
		System.out.println(myClass2.i);
		System.out.println(myClass2.j);
	}

}

class MyClass {
	public final double i = Math.random();
	public static double j = Math.random();
}
