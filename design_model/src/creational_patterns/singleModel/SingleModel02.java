package creational_patterns.singleModel;

/**
 * @author chengql
 * 饿汉模式
 * 饿汉式，从名字上也很好理解，就是“比较勤”，实例在初始化的时候就已经建好了，不管你有没有用到，都先建好了再说。
 * 好处是没有线程安全的问题，坏处是浪费内存空间。
 *
 */
public class SingleModel02 {
	private static SingleModel02 singleModel02 = new SingleModel02();
	
	private SingleModel02() {
		
	}
	
	public static SingleModel02 getInstance() {
		return singleModel02;
	}

}
