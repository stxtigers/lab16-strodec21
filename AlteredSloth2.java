public class AlteredSloth2 extends Sloth
{
  public AlteredSloth2(double l, double w)
  {
    super(l,w);
  }
  
  //Makes a faster sloth
  public void move(int numberOfSeconds)
  {
    position = 2*numberOfSeconds;
  }
}