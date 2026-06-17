interface Sports {
  float sportsWt = 6.0f;
  void showSportWt();
}

class Test {
  int roll;
  float part1 ,part2;
  void setData(int r, float p1, float p2){
    roll = r;
    part1 = p1;
    part2 = p2;
  }
  void showData(){
    System.out.println("roll:"+ roll);
    System.out.println("Marks OBtained:");
    System.out.println("part1:"+part1);
    System.out.println("part2:"+part2);
  }
}

class Results extends Test implements Sports {
  float total;
  public void showSportWt(){
        System.out.println("sports WT:"+ sportsWt);
  }

  void display(){
    total = part1 + part2 + sportsWt;
    showData();
    showSportWt();
    System.out.println("Total score:"+ total);
  }

  public static void main(String[] args){
    Results re = new Results();
    re.setData(12, 27.5f, 56.0f);
    re.display();
  }
}