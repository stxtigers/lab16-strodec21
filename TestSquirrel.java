//CANNOT FIGURE OUT
public class TestSquirrel extends Squirrel
{
  public TestSquirrel(double l, double w)
  {
    super(l,w);
  }
  public void move(int numberOfSeconds)
  {
    position = 2*numberOfSeconds;
  }
}