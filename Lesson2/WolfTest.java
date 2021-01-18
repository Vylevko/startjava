public class WolfTest {
    public static void main (String[] args) {
        Wolf wolfFirst = new Wolf();
        wolfFirst.isMail = false;
        wolfFirst.age = 1;
        wolfFirst.color = "White";
        wolfFirst.nickName = "SherstyanoyVol4ara";
        wolfFirst.weight = 25;
        
        if (wolfFirst.isMail) {
            System.out.println("Good Boy");
        } else {
            System.out.println("Good Girl");
        }
        System.out.println("Age = " + wolfFirst.age);
        System.out.println("Color = " + wolfFirst.color);
        System.out.println("Name = " + wolfFirst.nickName);
        System.out.println("Weight = " + wolfFirst.weight);
        
        wolfFirst.howl();
        wolfFirst.sit();
        wolfFirst.run();
        wolfFirst.hunt();
        wolfFirst.walk();
    }
}
