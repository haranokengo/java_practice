package practice1;

public class CapsuleMan {
    // privateのアクセス修飾子を設定して外部から隠蔽
    private String name;
    private int age;

    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // nameのgetterメソッド
    public String getName() {
        return this.name;
    }

    // nameのsetterメソッド
    public void setName(String name) {
        this.name = name;
    }

    // ageのgetterメソッド
    // ageは外部から変更禁止なので、setterメソッドは作成しない
    public int getAge() {
        return this.age;
    }
}

