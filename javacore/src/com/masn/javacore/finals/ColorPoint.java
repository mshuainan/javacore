package com.masn.javacore.finals;

/**
 * @ClassName: ColorPoint
 * @Description: TODO(����ɫ��Point)
 * @author masn
 * @date 2018��5��17�� ����8:58:54
 */
public class ColorPoint extends Point {

	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	@Override
	public int getSum() {
		return super.getSum();
	}

	public static void main(String[] args) {
		ColorPoint colorPoint = new ColorPoint(1, 1);
		System.out.println("x���y�᳤��֮�ͣ�" + colorPoint.getSum());
	}
	
	
}
