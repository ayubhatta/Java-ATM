// The "DebitCard" class in this program extends the "BankCard" class.
public class DebitCard extends BankCard
{
    /* Using several private attributes such as PIN Number,
    Withdrawal Amount, Date Of Withdrawal, and Has Withdrawn */
    private int PIN_Number;                                         // attribute PIN_Number as an private integer type.
    private int Withdrawal_Amount;                                  // attribute Withdrawal_Amount as an private integer type.
    private String Date_Of_Withdrawal;                              // attribute Date_Of_Withdrawal as an private String type.
    private boolean Has_Withdrawn;                                  // attribute has_Withdrawan as an private boolean type.   
    
    
    // constructor calls the constructor of the "BankCard" class with the necessary arguments.
    public DebitCard(int BalanceAmount,int Card_Id, String Bank_Account, String Issuer_Bank, String Client_Name,int PIN_Number) 
    {
        // Using super keyword
        super(BalanceAmount, Card_Id, Bank_Account, Issuer_Bank);
         // Using this keyword
        setClient_name(Client_Name);
        this.PIN_Number=PIN_Number;
        this.Has_Withdrawn=false;
    }   
                   
    /*  Other classes can access the values of the private attributes through the 
        public getter methods such as "getPIN_Number", "getWithdrawal_Amount", 
        "getDate_Of_Withdrawal" and "gethas_Withdrawan" */
     
    public int getPIN_Number()                                              // getter for attribute getPIN_Number()
    {
        return this.PIN_Number;
    }

    public int getWithdrawal_Amount()                                       // getter for attribute getWithdrawal_Amount() 
    {
        return this.Withdrawal_Amount;
    }

    public String getDate_Of_Withdrawal()                                   // getter for attribute getDate_Of_Withdrawal()
    {
        return this.Date_Of_Withdrawal;
    }

    public boolean getHas_Withdrawn()                                      // getter for attribute getHas_Withdrawan()
    {
        return this.Has_Withdrawn;
    }

    /* A public setter method called "setWithdrawal_amount" that 
      allows other classes to change the value of the Withdrawal_Amount attribute. */
     
    public void setWithdrawal_Amount(int Withdrawal_Amount)                                 // setter for attribute setWithdrawal_Amount
    {
        this.Withdrawal_Amount = Withdrawal_Amount;
    }
    
    /* Method "withdraw" that allows the  user to withdraw funds from the bank account. 
       It  verifies that  the entered PIN number is correct  and that the  account has 
       sufficient funds for the withdrawal. If the withdrawal is successful, the method 
       updates the balance, withdrawal amount and withdrawal date, otherwise it prints 
       an error message.  */ 
    
    public void withdraw(int Withdrawal_Amount, String Date_Of_Withdrawal, int PIN_Number) 
    {
        if (this.PIN_Number == PIN_Number) 
        {
            if (Withdrawal_Amount <= getBalanceAmount()) 
            {
                setBalanceAmount(getBalanceAmount() - Withdrawal_Amount);
                this.Withdrawal_Amount = Withdrawal_Amount;
                this.Date_Of_Withdrawal = Date_Of_Withdrawal;
                this.Has_Withdrawn = true;
            } 
            
            else 
            {
                System.out.println("Insufficient balance!");
            }
        } 
        
        else 
        {
            System.out.println("Invalid PIN!");
        }
    }

    public void display()
    {
        super.display();
        
        
        if(Has_Withdrawn)
        {
            System.out.println("PIN Number: " + getPIN_Number());
            System.out.println("Withdrawal Amount: " + getWithdrawal_Amount());
            System.out.println("Date of Withdrawal: " + getDate_Of_Withdrawal());
        } 
        
        else 
        {
            System.out.println("BalanceAmount: " + super.getBalanceAmount());
            System.out.println("Pending Transaction.");
        }
    }
}

