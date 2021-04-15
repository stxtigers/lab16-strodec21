//CANNOT FIGURE OUT
public class TestSloth extends Sloth
{
  public TestSloth(double l, double w)
  {
    super(l,w);
  }
  public void move(int numberOfSeconds)
  {
    position = 2*numberOfSeconds;
  }
}