package day07;

	class Cst{
		
		private String Car_name;
		private int Car_num;
		
		Cst(String Car_name , int Car_num){
			setCar_name("tico");
			setCar_num(1234);
			
		}
		
		public String getCar_name() {
			return Car_name;
		}

		public void setCar_name(String car_name) {
			Car_name = car_name;
		}

		public int getCar_num() {
			return Car_num;
		}

		public void setCar_num(int car_num) {
			Car_num = car_num;
		}
		public void go() {			
			carInfo();
		}
		public void carInfo() {
			System.out.println("차종은" + getCar_name() + "차 번호는 " + getCar_num());
		}
		
	}

public class Constructor1 {

	public static void main(String[] args) {
		Cst c1 = new Cst("엄" , 1234);
		c1.go();
		
	}

}
