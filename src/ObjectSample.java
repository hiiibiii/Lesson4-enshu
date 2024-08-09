
public class ObjectSample {

	public static void main(String[] args) {
		Employee emp01 = new Employee(); //インスタンスを生成して、empに代入している
//		emp01.employeeName = "大島";
//		emp01.divisionName = "営業部";
//		emp01.vitality = 150;

		//コンストラクタ利用
		emp01.introduce();
		emp01.showVitality();

		//コンストラクタの利用
//		Employee emp01 = new Employee();
//		emp01.introduce();
//		emp01.showVitality();

		//引数ありコンストラクタ利用
		Employee emp02 = new Employee("原川", "営業部", 250);
		emp02.introduce();
		emp02.greeting();
	}
}
