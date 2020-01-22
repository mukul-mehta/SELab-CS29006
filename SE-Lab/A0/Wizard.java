public class Wizard
{
    protected String name;
    protected String colour;

    public Wizard(String name)
    {
        this.name = name;
        System.out.println("I am " + name + " the " + colour);
    }

    public void castSpell()
    {
        System.out.println("A spell was cast!");
    }       

    public void castSpell(String name)
    {
        System.out.println("The " + name + " spell is cast");
    }

    public void printAbilities()
    {
        System.out.println("");
        System.out.println("Abilities of " + name + " the " + colour);
        castSpell();
    }
}


