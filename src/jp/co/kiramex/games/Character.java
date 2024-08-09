package jp.co.kiramex.games;

public class Character {
//	public String name;
//	public int hp;
//	public int offense;
//	public int defense;

	private String name;
	private int hp;
	private int offense;
	private int defense;

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

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getOffense() {
		return offense;
	}
	public void setOffise(int offense) {
		this.offense = offense;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
