package creational_patterns.singleModel;

/**
 * @author  chengql
 * 单例模式
 *单例模式，它的定义就是确保某一个类只有一个实例，并且提供一个全局访问点。
 *单例模式具备典型的3个特点：1、只有一个实例。 2、自我实例化。 3、提供全局访问点。
 */
public class SingleModel {
	//实现方式1
	public static final SingleModel SINGLEMODEL= new SingleModel();
	
	private SingleModel() {
		
	}

}
