class Company {
  String name;
  public void Mentors() {
    System.out.println("Train the freshers");
  }
  public void Managers(){
      System.out.println("Supporter to freshers");
  }
}
class employees extends Company {
  public void display() {
    System.out.println("Company name is " + name+" about company");
  }
}

class Main {
  public static void main(String[] args)
  {
      employees e = new employees();
      e.name = "Marketsimplified";
      e.display();
      e.Mentors( );
      e.Managers();

  }
}