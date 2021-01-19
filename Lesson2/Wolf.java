public class Wolf {
    private boolean isMail;
    private String nickName;
    private int weight;
    private int age;
    private String color;
    
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
    
    public void setIsMail(boolean isMail) {
        this.isMail = isMail;
    }
    
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean getIsMail() {
        return isMail;
    }
    
    public String getNickName() {
        return nickName;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getColor() {
        return color;
    }
}