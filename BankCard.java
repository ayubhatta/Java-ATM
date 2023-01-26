
// The "BankCard" class in this program is used to represent a bank card.
public class BankCard
{
    /* Using several private attributes including the 
       client's name, the issuer bank, the card's ID,
       and the the bank account number. */
     
    private int Card_Id;                                  // attribute card_id as an private integer type.
    private String Bank_Account;                          // attribute Bank_Account as a private long type.
    private int BalanceAmount;                            // attribute BalanceAmount as a int type.
    private String Client_Name;                           // attribute client_name as a private String type.
    private String Issuer_Bank;                           // attribute Issuer_Bank as a private String type.
    
    /*A constructor method that initializes the class
     variables using the parameters passed in.*/
    
    public BankCard(int BalanceAmount,int Card_Id, String Bank_Account, String Issuer_Bank)      // Constructor
    {
        // Using this keyword
        this.Client_Name="";
        this.Issuer_Bank=Issuer_Bank;
        this.BalanceAmount=BalanceAmount;
        this.Card_Id=Card_Id;
        this.Bank_Account=Bank_Account;    
    }

    
    /* Child classes are able to access the values of the private 
    attributes through the public getter methods such as 
    "getcard_id", "getBank_Account", "getBalanceAmount", 
    "getClient_name", and "Issuer_Bank". */
    public int getCard_Id()                         // getter
    {
        return this.Card_Id;
    }
    public String getBank_Account()                 // getter
    {
        return this.Bank_Account;
    }
    public int getBalanceAmount()                   // getter
    {
      return this.BalanceAmount;  
    }
    public String getClient_Name()                  // getter
    {
        return this.Client_Name;
    }
    public String getIssuer_Bank()                  // getter 
    {
        return this.Issuer_Bank;
    }

    
     /* public setter methods, such as "setClient_name" 
      and "setBalanceAmount," that allow other classes
      to change the values of the private attributes. */
      
    public void setClient_name(String Client_Name)               // setter
    {
        this.Client_Name=Client_Name;
    }
   
    public void setBalanceAmount(int BalanceAmount)
    {
        this.BalanceAmount=BalanceAmount;
    }
    /* A public method "display" which prints the values of the attributes,
     but  only if the "Client_name" attribute  is not empty.  If the 
     "Client_name" attribute is empty, the method will print "Error". */
     
    public void display()
    {
        if(this.Client_Name.equals(""))
        {
            System.out.println("Error");           // displays "Error" if the client name is empty.
        }

        else
        {
            System.out.println("Card_Id: " + Card_Id);
            System.out.println("Bank Account: " + getBank_Account());
            System.out.println("Balance Amount: " + BalanceAmount);
            System.out.println("Client Name: " + Client_Name);
            System.out.println("Issuer Bank: " + Issuer_Bank);  
        }
    }    
}                                    



