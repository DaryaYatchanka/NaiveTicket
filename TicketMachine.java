/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class  TicketMachine
{
    // The price of a ticket from this machine.
    private int price; 
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
     
    private int status;
    private int score;
    
    
    
  

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        status = 0;
        score = 0;
    }
    public TicketMachine(int price)
    {
        this.price = price;
    }
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
 
    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    public void increase (int points)
    { 
        score = score + points;
    }
    public void discount (int amount)
    { 
        price = price - amount;
    }
    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney (int amount)
    {
        balance = balance + amount;
    }
   
    public void prompt()
    {   
        System.out.println ("Please insert the correct amount of money");
    }
    public int getTotal()
    {
       return  total; 
    
    }
    public void showPrice()
    {
      System.out.println ("The price of a ticket is " + price + " cents");
    }  
    public void empty()
    {
        total = 0;
    }
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
   
}
