public class GreyWizard extends BrownWizard
{
    public GreyWizard(String name)
    {
        super(name);
        colour = "Grey";
    }

    public void readMind()
    {
        super.readMind();
        System.out.println("I can also control minds of others in this process");
    }

    public final void fightBalrog()
    {
        System.out.println("Thou shalt not pass!");
    }

    public void printAbilities()
    {
        super.printAbilities();
        fightBalrog();
    }
}

