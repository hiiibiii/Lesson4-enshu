
public class Character {
	public String name;
	public int hp;
	public int offense;
	public int defense;

	//引数無しのコンストラクタ
	public Character() {
	}

	//引数ありのコンストラクタ
	public Character(String name, int hp, int offence, int defense) {
		this.name = name;
		this.hp = hp;
		this.offense = offence;
		this.defense = defense;
	}

	//相手に攻撃するメソッド
	public void attack(Character opponent) {
		int damage = this.offense - opponent.defense;

		//ダメージ量の計測結果がプラスかどうか
		if(damage > 0) {
			//ダメージ量プラスならダメージ与える
			opponent.hp = opponent.hp - damage;
			System.out.println(this.name + "は" + opponent.name + "に" + damage + "のダメージを与えた！");
		}else {
			System.out.println("ミス！" + this.name + "は" + opponent.name + " にダメージを与えられない！");
		}
	}
}
