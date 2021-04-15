public class AlteredSquirrel2 extends Squirrel
{
  public AlteredSquirrel2(double l, double w)
  {
    super(l,w);
  }
  
  //Makes a faster squirrel
  public void move(int numberOfSeconds)
  {
    position = 4*numberOfSeconds;
  }
}