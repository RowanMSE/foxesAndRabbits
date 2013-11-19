package foxesAndRabbitsv1;

import java.awt.Color;

/**
 * Provide a counter for a participant in the simulation.
 * This includes an identifying string and a count of how
 * many participants of this type currently exist within 
 * the simulation.
 * 
 * CHRISTOPHER CROUCH
 * Jun He
 * 
 * This is a branch!!!
 * 
 * I am making a branch to change the Counter
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2002.04.23
 */

//text text

public class Counter
{
    // A name for this type of simulation participant
    private String name;
    // How many of this type exist in the simulation.
    private int count;

    /**
     * Provide a name for one of the simulation types.
     * @param name  A name, e.g. "Fox".
     */
    public Counter(String name)
    {
        this.name = name;
        count = 0;
    }
    
    /**
     * @return The short description of this type.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The current count for this type.
     */
    public int getCount()
    {
        return count;
    }

    /**
     * Increment the current count by one.
     */
    public void increment()
    {
        count++;
    }
    
    /**
     * Reset the current count to zero.
     */
    public void reset()
    {
        count = 0;
    }
    
    /**
     * added by Chris
     */
    public String toString() {
    	return name + " " + count;
    }
}
