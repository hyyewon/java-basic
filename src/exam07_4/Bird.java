package exam07_4;

public class Bird extends Pet {

	String color;
	
	public void fly() {
		System.out.println("Bird.fly");
	}

	@Override
	public void eat() {
		System.out.println("Bird.eat");
	}
	
	@Override
	public void sleep() {
		System.out.println("Bird.sleep");
	}

	//오버라이딩은 강제성이 없다.
	public void eatBird() {
		}

	public void sleepBird() {
		}

	public Bird() {}

	public Bird(String name, int age) {
		super(name, age);
	}

	public Bird(String name, int age, String color) {
		super(name, age); //두개는 부모한테 넘기고
		this.color = color; //color는 내가 초기화하고
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return String.format("Bird 이름:%s , Bird 나이:%d , Bird 색상:%s \n", name, age, color);
	}

	
}