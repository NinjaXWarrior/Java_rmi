class Circle{
  private final float pi = 3.1415f;
  private int r;
  Circle(int x){
    r=x;
  }
  void area(){
    float a = pi * r * r;
    System.out.println("Area="+a);
  }
}