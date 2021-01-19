public class WolfTest {
    public static void main (String[] args) {
        Wolf wolfFirst = new Wolf();
        wolfFirst.setIsMail(false);
        int age = 7;
        if (age > 8) {
            System.out.println("Invalid age");
        } else { 
            wolfFirst.setAge(age);
        }
        wolfFirst.setColor("White");
        wolfFirst.setNickName("SherstyanoyVol4ara");
        wolfFirst.setWeight(25);
        
        if (wolfFirst.getIsMail()) {
            System.out.println("Good Boy");
        } else {
            System.out.println("Good Girl");
        }
        System.out.println("Age = " + wolfFirst.getAge());
        System.out.println("Color = " + wolfFirst.getColor());
        System.out.println("Name = " + wolfFirst.getNickName());
        System.out.println("Weight = " + wolfFirst.getWeight());
        
        wolfFirst.howl();
        wolfFirst.sit();
        wolfFirst.run();
        wolfFirst.hunt();
        wolfFirst.walk();
    }
}