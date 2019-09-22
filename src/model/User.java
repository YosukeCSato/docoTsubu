package model;

public class User implements java.io.Serializable {

	private String name; // ユーザー名
	private String pass; // パスワード

	public User() {

	}

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return this.name;
	}

	public String getPass() {
		return this.pass;
	}

}
