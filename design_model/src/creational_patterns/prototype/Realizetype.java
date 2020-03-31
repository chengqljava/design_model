package creational_patterns.prototype;
/**
 * ԭ��ģʽ�Ŀ�¡��Ϊǳ��¡�����¡��Java �е� Object ���ṩ��ǳ��¡�� clone() ������
 * ����ԭ����ֻҪʵ�� Cloneable �ӿھͿ�ʵ�ֶ����ǳ��¡��
 * ����� Cloneable �ӿھ��ǳ���ԭ����
 * @author chengql
 *
 */
public class Realizetype implements Cloneable{
	 public Realizetype() {
		   System.out.println("����ԭ�ʹ����ɹ���");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		  System.out.println("����ԭ�͸��Ƴɹ���");
		return super.clone();
	}
}
