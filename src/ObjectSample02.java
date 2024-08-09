
public class ObjectSample02 {

	public static void main(String[] args) {

		//フィールドの初期値を設定
		//Employee emp = new Employee(); //インスタンスを生成して、empに代入している
		//emp.employeeName = "未設定"; //社員名
		//emp.divisionName = "営業部"; //部署名
		//emp.vitality = 0; //体力


		Employee emp01 = new Employee(); //インスタンスを生成して、empに代入している
		emp01.employeeName = "大島";
		emp01.divisionName = "営業部";
		emp01.vitality = 150;

		emp01.introduce();
		emp01.showVitality();

		Employee emp02 = new Employee();
		emp02.employeeName = "原川";
		emp02.divisionName = "営業部";
		emp02.vitality = 250;

		emp02.introduce();
		emp02.greeting();
		emp02.report();
		emp02.showVitality();
	}

}
