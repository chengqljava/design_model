package creational_patterns.singleModel;

/**
 * @author chengql
 * 懒汉模式
 * 懒汉式，顾名思义就是实例在用到的时候才去创建，“比较懒”，用的时候才去检查有没有实例，如果有则返回，没有则新建。
 * 有线程安全和线程不安全两种写法，区别就是synchronized关键字
 *
 */
public class SingleModel01 {
	private static SingleModel01 singleModel01;
	
	private SingleModel01() {
		
	}
	
	public static SingleModel01 getInstance() {
		if(singleModel01==null) {
			return singleModel01 = new SingleModel01();
		}
		return singleModel01;
	}

}
