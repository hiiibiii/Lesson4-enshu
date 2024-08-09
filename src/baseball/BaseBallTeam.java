package baseball;

public class BaseBallTeam {
	//以下のフィールドを BaseBallTeam に持たせてください。
	//なお、カプセル化を使うようにしましょう：
	private String name; //name（String型）
	private int win; //win（int型）
	private int lose; //lose（int型）
	private int draw; //draw（int型）

	//コンストラクタ
	public BaseBallTeam(String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}
	//勝率はフィールドとして持たせず、メソッドにします。「勝ち数/(勝ち数+負け数)」の計算で求められるからです。
	//この計算結果を小数値（double）で戻す getRate メソッドを BaseBallTeam に作ってください
	public double getRate() {
		double rate = (double)this.win / ((double)this.win + (double)this.lose);
		return rate;
	}
	// report というメソッドを BaseBallTeam に作ります。
	//○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッドです
	public void report() {
		getRate();
		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getlose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	public int getdraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
}
