package model;

public class Mutter implements java.io.Serializable {

	private int id; // ID
	private String userName; // ユーザー名
	private String text; // つぶやき内容

	public Mutter() { // 引数なしコンストラクタ

	}

	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}

	public Mutter(int id, String userName, String text) {
		this.id = id;
		this.userName = userName;
		this.text = text;
	}

	public int getId() {
		return this.id;
	}

	public String getUserName() {
		return this.userName;
	}

	public String getText() {
		return this.text;
	}

}
