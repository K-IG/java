package day06;
class Class6Ex{
		private String name;
		private int age;
		private double height;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public void getAge(int i) {
			// TODO Auto-generated method stub
			
		}
		public void getHeight(int i) {
			// TODO Auto-generated method stub
			
		}
	

		
	}
public class Class6 {

	public static void main(String[] args) {
		Class6Ex c = new Class6Ex();
		c.setName("홍길동");
		c.getAge(13);
		c.getHeight(178);
		System.out.println(c.getName());
	}
}

