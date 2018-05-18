package com.masn.javacore.finals;

/**
 * @ClassName: StaticAndFinal
 * @Description: TODO(static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变)
 * @author masn
 * @date 2018年5月17日 下午11:01:49
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
