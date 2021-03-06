package creational_patterns.singleModel;


/**
 * @author chengql
 *双检锁
 *双检锁，又叫双重校验锁，综合了懒汉式和饿汉式两者的优缺点整合而成。看上面代码实现中，
 *特点是在synchronized关键字内外都加了一层 if 条件判断，这样既保证了线程安全，
 *又比直接上锁提高了执行效率，还节省了内存空间
 */
public class SingleModel03 {
 private static SingleModel03 singleModel03; 
 
 private SingleModel03() {
	 
 }
 
 public static SingleModel03 getInstance() {
	 if(singleModel03==null) {
		 synchronized (SingleModel03.class) {
			if(singleModel03==null) {
				singleModel03 = new SingleModel03();
			}
		}
	 }
	 return singleModel03;
 }
}
