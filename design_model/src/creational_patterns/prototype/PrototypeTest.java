package creational_patterns.prototype;

/*
 * ԭ�ͣ�Prototype��ģʽ�Ķ������£���һ���Ѿ�������ʵ����Ϊԭ�ͣ�
 * ͨ�����Ƹ�ԭ�Ͷ���������һ����ԭ����ͬ�����Ƶ��¶��������ԭ��ʵ��ָ����Ҫ�����Ķ�������ࡣ
 * �����ַ�ʽ��������ǳ���Ч����������֪�����󴴽���ϸ�ڡ�
 * ���磬Windows ����ϵͳ�İ�װͨ���Ϻ�ʱ��������ƾͿ��˺ܶࡣ�������и��Ƶ����ӷǳ��࣬���ﲻһһ�о���
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Realizetype realizetype1 = new Realizetype();
		Realizetype realizetype2=(Realizetype)realizetype1.clone();
		 System.out.println("realizetype1==realizetype2?"+(realizetype1==realizetype2));
	}
}
