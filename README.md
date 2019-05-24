# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.


Work all Exercises from 2.19 to 2.58 that are **NOT** marked *Challenge exercise*.
READ upto and INCLUDING section 2.15 of this chapter.

### Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

### Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket?
0

### Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior? It is so simple
	* What happens if you insert too much money into the machine – do you receive any refund? No
	* What happens if you do not insert enough and then try to print a ticket? It will not print ticket No

### Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

### Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different? It is different amount on that;

### Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part. 
public class Student {
  Inner part
}
public class LabClass{
 Inner part
}



### Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?yes, it matters 

* Edit the source of the `TicketMachine` class to make the change and then close the editor window. It does not let you to do that;
	* Do you notice a change in the class diagram? 
	* What error message do you get when you now press the compile button?
<identifier> expected; 
	* Do you think this message clearly explains what is wrong?
Yes it is. It  says that before class some Identifier is expected (public, in our case);


### Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.It is not possible;

### Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.

### Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class? yes, It is creating things;

### Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count; 
integer
private Student representative;
String;
private Server host;
String;
```

### Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive; 
alive
private Person tutor;
tutor;
private Game game;
game;

```
### Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;
```
does it matter which order the three words appear in?
Yes, it is
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are
possible? 
it is giving you an error <identifier> expected. 
	* Check by pressing the compile button to see if there is an error message.
	* Make sure that you reinstantiate the original version after your experiments!

### Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration?
Yes it is
* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.
Yes, I will, thank you)


### Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.
 private int status;

### Exercise 2.16
* To what class does the following constructor belong?
```
public Student(String name)
class Student;
```

### Exercise 2.17
* How many parameters does the following constructor have and what are their types?
```
public Book(String title, double price)

```
  two; their types is String and double;

### Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
String; int;
* Can you assume anything about the names of its fields?
 author; yearPublished; numberOfPages;



2.19
  public Pet (String petsName)
    {  
      name = petsName;
      }

2.21 The difference is that getPrice Method return you the price of a ticket and getBalance method return you amount of money already inserted for the next ticket;

2.22 'What is the balance now, after last ticket as printed;

2.23 It will work;

2.24 public int getTotal()
    {
       return  total; 
    
    }

2.25  missing return statement;

2.26 getPrice method is has return type "int"  (where we are giving input)and printTicket method has return type "void" (which is output);

2.27 no they are do not have return value. Because they have "void" in them, they do not need return value;

2.28 done;

2.29.it has an indicator of that: it has the return type(void);
 
2.30 public void setPrice(int ticketCost)
    {
        price = ticketCost;
    }

2.31 public void increase (int points)
    { 
        score = score + points;
    }

2.32 public void discount (int amount)

  {
       price = price - amount;
  }
2.33public void prompt()
    {   
        System.out.println ("Please insert the correct amount of money");
    }
2.34public void showPrice()
    {
      System.out.println ("The price of a ticket is " + price + " cents");
    }  
2.35 in two different machines it will show two different prices for a ticket (because we set price with two different integers);
2.36 the word "price" will be printed;
2.37 the whole expression in the quotes will be printed as it is "# price cents. ";
2.38 it can to be used to show the price. They are still just the expression printed. 
2.39 it is will change the way machine works. It is no more you choice now much will be the price of the ticket. Now your ticket price  is set by default;
2.40 this method doesn't need any parameters, it is mutator method, because it is changing the value of the "total" field;
2.41  public void setPrice(int newPrice)
    {
        price = newPrice;
    }
It is mutator because it is changing the value of the price;
2.42 in one machine you are will b able to set your own price and with another (which has an return type) - you will be able to set the price;
2.43 when the error message sprinted, balance will stay the same. The idea behind that is that even if you don't have enough money to print ticket, you still have your balance (unless you refund it); 
2.44  In this case it will not give you an error message ("Use a positive amount: " + amount)into insertMoney method (like it does in case your if statement looks like : 
        if (amount >0){
          balance = balance +amount;
        }
        else {
            System.out.println("Use a positive amount: " + amount);
        }
2.46 underwood;
2.47not it is cannot be a negative number, because to print it balance should be greater than 0;
2.48. done;
2.49 saving= price*discount;
2.50 mean = total/count;
2.51 if (price >budget){
System.out.println ("Too expensive");

}
  else{
   System.out.println ("Just right");
}
2.52 
if (price >budget){
System.out.println ("Too expensive I only have that " + budget+ " much");

}
  else{
   System.out.println ("Just right");
} 
2.53 because given in this exercise version  of refundBalance has only balance = 0; so it will return 0; you can test it by doing refundBalance method and it will not refund anything;
2.54 it will give you <unreachable statement> error, because you can not do balance =0 after return statement ;
2.55 doesn't work;
2.56 both;
2.57 
