public class NateChips extends SimpleChips
{
  public String toString()
  {
    return "Nate";
  }
  public int play(int pile, int lastmove)
  {
    if (pile <= 2*lastmove) return pile;
    else if (pile == 4) return 1;
    else if (pile == 3) return 1;
    else if ((pile - 2) % 3 == 0)
    {
      return (int)(Math.random()*(2*lastmove))+1;
    }
    else return ((pile - 2) % 3);
  }
}