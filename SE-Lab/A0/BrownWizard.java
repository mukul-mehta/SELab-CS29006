public class BrownWizard extends Wizard
{
    public BrownWizard(String name, String colour)
    {
     	super(name, colour);
        colour = "Brown";
    }       

    public void readMind()
    {
        System.out.println("I can read your mind yo!");
    }

    public void printAbilities()
    {
        super.printAbilities();
        readMind();
    }
}

