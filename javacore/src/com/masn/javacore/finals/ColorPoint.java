package com.masn.javacore.finals;

/**
 * @ClassName: ColorPoint
 * @Description: TODO(带颜色的Point)
 * @author masn
 * @date 2018年5月17日 上午8:58:54
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
		System.out.println("x轴和y轴长度之和：" + colorPoint.getSum());
	}
	
	
}
