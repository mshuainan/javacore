package com.masn.javacore.innerclass;

/**
 * @ClassName: TryUseingAnonymousClass
 * @Description: TODO(�����ڲ���)
 * @author masn
 * @date 2018��5��18�� ����8:47:17
 */
public class TryUseingAnonymousClass {

	public void useMyInterface() {
		final Integer number = 123;
		System.out.println(number);
		MyInterface myInterface = new MyInterface() {
			@Override
			public void doSomething() {
				System.out.println(number);
			}
		};
		myInterface.doSomething();
		System.out.println(number);
	}

}
