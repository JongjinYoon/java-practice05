package prob3;

public class Duck extends Bird {
	
//	public Duck() {
//		System.out.println("오리의 이름은 " + getName() + "입니다.");
//	}
	public void fly() {
		System.out.println("오리("+ toString() + ")는 날지 않습니다.");
	}
	public void sing() {
		System.out.println("오리("+ toString() + ")가 소리내어 웁니다.");
	}
	@Override
	public String toString() {
		return getName();
	}
}
