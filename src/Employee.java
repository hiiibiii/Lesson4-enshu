
public class Employee {
	//フィールド
	public String employeeName; //社員名
	public String divisionName; //部署名
	public int vitality; //体力

	//引数なしのコンストラクタ
		//クラス名=コンストラクタ名
		//戻り値・voidは記載しない
	public Employee() {
		System.out.println("インスタンス化時にコンストラクタが呼ばれました");
		employeeName = "未設定";
		divisionName = "営業部";
		vitality = 0;
	}
	//引数3つコンストラクタ
	public Employee(String employeeName, String divisionName, int vitality) {
		System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
		//フィールドのEmployeeNameを指定
		this.employeeName = employeeName;
		this.divisionName = divisionName;
		this.vitality = vitality;
	}
	//自己紹介メソッド
	public void introduce() { //public=どのオブジェクトからも操作できることを指定する修飾子
		vitality = vitality - 10;
		System.out.println("私の名前は" + employeeName + "です。");
		System.out.println("所属部署は" + divisionName + "です。");
	}
	//挨拶メソッド
	public void greeting() {
		vitality = vitality - 10;
		System.out.println("おはようございます");
	}
	//報告メソッド
	public void report() {
		vitality = vitality - 10;
		System.out.println("今日は10件アポイント取りました");
	}
	//残りの体力を知らせるメソッド
	public void showVitality() {
		vitality = vitality - 10;
		System.out.println("残り体力は" + vitality);
	}
	//出勤するメソッド
	public void goToWork() {

	}
	//退勤するメソッド
	public void leaveWork() {

	}
}
