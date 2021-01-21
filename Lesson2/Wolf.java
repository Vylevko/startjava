public class Wolf {
    private boolean isMail;
    private String nickName;
    private int weight;
    private int age;
    private String color;

    public void setMail(boolean isMail) {
        this.isMail = isMail;
    }

    public boolean IsMail() {
        return isMail;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void walk() {
        System.out.println("Walking");
    }

    public void sit() {
        System.out.println("Sitting");
    }

    public void run() {
        System.out.println("Runing");
    }
    
    public void howl() {
        System.out.println("Howling");
    }
    
    public void hunt() {
        System.out.println("Hunting");
    }
}