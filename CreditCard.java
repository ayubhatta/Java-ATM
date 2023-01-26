
// The "CreditCard" class in this program extends the "BankCard" class.
public class CreditCard extends BankCard 
{
    /* Using several private attributes like CVC_Number, Credit_Limit,
     Interest_Rate, Expiration_Date, Grace_Period, and Is_Granted. */
     
    private int CVC_Number;                                 // attribute CVC_Number as a private integer type.
    private double Credit_Limit;                            // attribute Credit_Limit as a private double type.
    private double Interest_Rate;                           // attribute Interest_Rate as a private double type.
    private String Expiration_Date;                         // attribute Expiration_Date as a private String type. 
    private int Grace_Period;                               // attribute Grace_Period as a private integer type.
    private boolean Is_Granted;                             // attribute Is_Granted as a private boolean type.

    
    /*  A constructor that calls the constructor of its super class and assigns 
        the values passed in as parameters to its private attributes. */
    
    public CreditCard(int Card_Id, String Client_Name, String Issuer_Bank, String Bank_Account, int Balance_Amount, int CVC_Number, 
    double Interest_Rate, String Expiration_Date)                           // Constructor
    {
        // Using super keyword
        super(Balance_Amount, Card_Id, Issuer_Bank, Bank_Account);
        
        // Using this keyword
        this.CVC_Number = CVC_Number;
        this.Interest_Rate = Interest_Rate;
        this.Expiration_Date = Expiration_Date;
        setClient_name(Client_Name);
        this.Is_Granted = false;
    }

    
    /*  Other  classes can  access the values of  the private attributes through  the 
        public getter methods such as getCVC_Number, getCredit_Limit, getInterest_Rate, 
        getExpiration_Date, getGrace_Period, and getIs_Granted.  */
    
    public int getCVC_Number()                                                          // getter
    {
        return this.CVC_Number;
    }

    public double getCredit_Limit()                                                     // getter
    {
        return this.Credit_Limit;
    }

    public double getInterest_Rate()                                                    // getter
    {
        return this.Interest_Rate;
    }

    public String getExpiration_Date()                                                   // getter
    {
        return this.Expiration_Date;
    }

    public int getGrace_Period()                                                        // getter
    {
        return this.Grace_Period;
    }

    public boolean getIs_Granted()                                                      // getter
    {
        return this.Is_Granted;
    }

    /* A public setter method called "setCredit_Limit" that enables other classes
       to change the values of the Credit_Limit and Grace_Period attributes.*/
    
    public void setCredit_Limit(double Credit_Limit, int Grace_Period)
    {
        /* This method verifies  if the new  credit limit is less than  or equal 
           to 2.5 times the balance amount of the account. If true,it grants the 
           credit else, it will print "Credit cannot be issued. Please check your 
           account and try again." */
           
        if(Credit_Limit <= (this.getBalanceAmount()))
        {
            this.Credit_Limit = Credit_Limit;
            this.Grace_Period = Grace_Period;
            this.Is_Granted = true;
        } 
        
        else 
        {
            System.out.println("Credit cannot be issued. Please check your account and try again.");
        }
    }

    
    /*  A public method called "cancelCreditCard" that
        allows the user to cancel their credit card. */
       
    public void cancelCreditCard()
    {
        /* This method first checks if the credit card  is granted, if true it sets 
           the attributes to zero and sets the Is_Granted attribute to false. If the
           credit card is not granted it will print's "Credit card is not active." */
        if(this.Is_Granted)
        {
            this.CVC_Number = 0;
            this.Credit_Limit = 0;
            this.Grace_Period = 0;
            this.Is_Granted = false;
        } 
        
        else 
        {
            System.out.println("Credit card is not active.");
        }
    }

    public void display()
    {
        super.display();
        if(this.Is_Granted)
        {
            System.out.println("CVC Number: " + CVC_Number);
            System.out.println("Credit Limit: " + Credit_Limit);
            System.out.println("Interest Rate: " + Interest_Rate);
            System.out.println("Expiration Date: " + Expiration_Date);
            System.out.println("Grace Period: " + Grace_Period);
        } 
        
        else 
        {
            System.out.println("Credit card is not granted.");
        }
    }
}
