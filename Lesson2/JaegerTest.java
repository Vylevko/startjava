public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1.85f);
        jaeger1.setSpeed(10);
        jaeger1.setStrength(10);
        jaeger1.setMark("Mark-5");
        jaeger1.setArmor(9);
        jaeger1.setOrigin("Australia");

        System.out.println("ModelName " + jaeger1.getModelName());
        System.out.println("Mark " + jaeger1.getMark());
        System.out.println("Origin " + jaeger1.getOrigin());
        System.out.println("Height " + jaeger1.getHeight());
        System.out.println("Weight " + jaeger1.getWeight());
        System.out.println("Speed " + jaeger1.getSpeed());
        System.out.println("Strength " + jaeger1.getStrength());
        System.out.println("Armor " + jaeger1.getArmor());

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Cherno Alpha");
        jaeger2.setHeight(85.34f);
        jaeger2.setWeight(2.412f);
        jaeger2.setSpeed(3);
        jaeger2.setStrength(10);
        jaeger2.setMark("Mark-1");
        jaeger2.setArmor(10);
        jaeger2.setOrigin("Russia");

        System.out.println("ModelName " + jaeger2.getModelName());
        System.out.println("Mark " + jaeger2.getMark());
        System.out.println("Origin " + jaeger2.getOrigin());
        System.out.println("Height " + jaeger2.getHeight());
        System.out.println("Weight " + jaeger2.getWeight());
        System.out.println("Speed " + jaeger2.getSpeed());
        System.out.println("Strength " + jaeger2.getStrength());
        System.out.println("Armor " + jaeger2.getArmor());

        jaeger1.drift();
        jaeger2.move();
        jaeger1.SkanKaiju();

        if (jaeger1.getHeight() > jaeger2.getHeight()) {
            System.out.println(jaeger1.getModelName() + " is higher");
        } else if (jaeger1.getHeight() < jaeger2.getHeight()) {
            System.out.println(jaeger2.getModelName() + " is higher");
        } else {
            System.out.println(jaeger2.getModelName() + " and " + jaeger2.getModelName() + " are of the ame height");
        }

        System.out.println("ModelName " + jaeger2.getModelName());
        jaeger2.setStrength(12);
        System.out.println("Strength " + jaeger2.getStrength());
    }
}
