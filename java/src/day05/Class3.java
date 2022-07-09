package day05;

class Car{
	String car_name;
	String color;
	String onwer_name;
	
	void 차정보입력(String 색상, String 주인, String 차이름) {
		color =색상;
		onwer_name = 주인;
		car_name = 차이름;
	}
	String 차정보출력() {
		return "이 차의 주인은: "+ onwer_name + " 차의 이름과 색깔은: " + car_name +color;
	}
	
	
	
}
public class Class3 {

	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car();
		Car	car2 = new Car();
		Car	car3 = new Car();
		car.차정보입력("검정", "나 ", "초미니카 ");
		car1.차정보입력("회색", "나 ", "미니카 ");
		car2.차정보입력("무지개", "나 ", "중형카 ");
		car3.차정보입력("투명", "나 ", "대형카 ");
		
		System.out.println(car.차정보출력());
		System.out.println(car1.차정보출력());
		System.out.println(car2.차정보출력());
		System.out.println(car3.차정보출력());
}
}