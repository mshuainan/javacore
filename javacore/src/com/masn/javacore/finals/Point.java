package com.masn.javacore.finals;

/**
 * @ClassName: Point
 * @Description: TODO()
 * @author masn
 * @date 2018年5月17日 上午8:54:52
 */
public class Point {
	public int x;
	public int y;
	public final int z;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.z = 1;
	}
	

	protected void xxxx() {
		
	}
	
	public Point(int x) {
		super();
		this.x = x;
		this.z = 1;
	}
    
	/**
	 * @Title: getSum
	 * @Description: TODO(求x轴和y轴的长度之和,final修饰的方法不可以被重写)
	 * @author masn
	 * @date 2018年5月17日 上午8:56:39
	 * @return int  返回类型
	 * @throws
	 */
	public /*final*/ int getSum() {
		/*this.z = 1;*/
		return this.x + this.y;
	}
	
	public static void main(String[] args) {
		Point point = new Point(1);
		/**
			其数值一旦在初始化之后便不能更改；
			point.z = 2; 
		*/
	}

}
