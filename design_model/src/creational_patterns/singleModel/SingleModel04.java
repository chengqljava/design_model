package creational_patterns.singleModel;

/**
 * @author chengql
 * 静态内部类
 * 静态内部类的方式效果类似双检锁，但实现更简单。但这种方式只适用于静态域的情况，
 * 双检锁方式可在实例域需要延迟初始化时使用
 */
public class SingleModel04 {
	
	public static class SingleModelHolder{
		private static SingleModel04 INSTANCE = new SingleModel04();
	}
	private SingleModel04() {
		
	}
	public static final SingleModel04 getInstance() {
		return SingleModelHolder.INSTANCE;
	}

}
