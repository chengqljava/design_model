package creational_patterns.prototype;

/*
 * 原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，
 * 通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。
 * 用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 * 例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多。在生活中复制的例子非常多，这里不一一列举了
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype realizetype1 = new Realizetype();
		Realizetype realizetype2=(Realizetype)realizetype1.clone();
		 System.out.println("realizetype1==realizetype2?"+(realizetype1==realizetype2));
	}
}
