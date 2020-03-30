package creational_patterns.singleModel;

/**
 * @author chengql 枚举 枚举的方式是比较少见的一种实现方式，但是看上面的代码实现，却更简洁清晰。
 *         并且她还自动支持序列化机制，绝对防止多次实例化
 *
 */
public enum SingleModel05 {
	INSTANCE;
	public void anyMethod() {

	}

	public static void main(String[] args) {
		SingleModel05.INSTANCE.anyMethod();
	}
}
