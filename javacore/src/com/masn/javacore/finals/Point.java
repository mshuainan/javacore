package com.masn.javacore.finals;

/**
 * @ClassName: Point
 * @Description: TODO()
 * @author masn
 * @date 2018��5��17�� ����8:54:52
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
	 * @Description: TODO(��x���y��ĳ���֮��,final���εķ��������Ա���д)
	 * @author masn
	 * @date 2018��5��17�� ����8:56:39
	 * @return int  ��������
	 * @throws
	 */
	public /*final*/ int getSum() {
		/*this.z = 1;*/
		return this.x + this.y;
	}
	
	public static void main(String[] args) {
		Point point = new Point(1);
		/**
			����ֵһ���ڳ�ʼ��֮��㲻�ܸ��ģ�
			point.z = 2; 
		*/
	}

}
