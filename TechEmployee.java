public class TechEmployee extends Employee 
{
  String lastName;
  double payRate;

  protected String name;
  protected double payRateAmount;

  public void setLastName(String name)
  {
    name = "Person's Last Name";
  }


  public String getLastName()
  {
    lastName = name;
    return lastName;
  }


  public void setPayRate(double pr)
  {
    payRateAmount = 100.0*2.0;
  }


  public double getPayRate()
  {
    payRate = payRateAmount;
    return payRate;
  }

  /*
  public static getCount()
  {
    return numberOfEmployees;
  }
  */

  public String toString()
  {
    return "Last Name " + lastName + ", Pay Rate " + payRate + ", Quality ";
  }
}