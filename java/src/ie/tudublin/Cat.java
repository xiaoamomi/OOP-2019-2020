package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void speak()
    {
        System.out.println("Meow!");
    }
	
	public void kill(){
		this.numLives = this.numLives - 1;
		if(this.numLives > 0)
		{
			System.out.println("Ouch!");
		}
		else if(this.numLives == 0)
		{
			System.out.println("Dead");
		}
	}
}