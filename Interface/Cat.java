public class Cat implements Animal {
    public void sound() {
        System.out.println("Cat: Meow");
    }
    public static void main(String[] args){
      Cat c = new Cat();
      c.sound();
    }
}