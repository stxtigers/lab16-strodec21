public class Sloth implements Animal
{
  public static final int numberOfLimbs = 4;
  private static int slothCount = 0;
  
  protected int slothNumber; 
  protected int position;
  protected double length;
  protected double weight;
  
  public Sloth(double l, double w)
  {
    length = l;
    weight = w;
    position = 0;
    slothNumber = slothCount;
    slothCount++;
  }
  
  public void move(int numberOfSeconds)
  {
    position = 1*numberOfSeconds;
  }
  
  public String sound()
  {
    return "(Sloth noise(#1))";
  }
  
  public String toString()
  {
    return "Sloth " + slothNumber + ", Location " + position;
  }
}