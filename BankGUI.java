import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BankGUI implements ActionListener
{
    JFrame f;
   
    JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10, L11, L12, L13, L14, L15, L16, L17, L18, L19, L20, L21, L22, L23;
    JButton B1, B2, B3, B4, B5, B6, B7, B8, B9 ,B10, B11;
    JComboBox<String>C1, C2, C3, C4, C5, C6;
    JTextField T1,T2,T3,T4,T5,T6,T7,T8,T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19;
    JPanel panel,panel2, panel3, panel4, panel5, panel6;
    
    ArrayList<BankCard> Card_List = new ArrayList<BankCard>();

    public BankGUI()
    {
        f = new JFrame("Card Management System");
        f.setSize(954, 755);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        //**********************************************************************************************************************************************//
        //*************************************************************DEBIT CARD***********************************************************************//
        //**********************************************************************************************************************************************//
       
        panel = new JPanel();
        panel.setBounds(0,0,936, 755);
        panel.setLayout(null);
       
       

        // create labels
        L1 = new JLabel("Card ID:");
        L2 = new JLabel("Issuer Bank:");
        L3 = new JLabel("Client Name:");
        L4 = new JLabel("Bank Account:");
        L5 = new JLabel("Balance Amount:");
        L6 = new JLabel("PIN Number:");
        L7 = new JLabel("Card ID for With:");
        L8 = new JLabel("Withdrawal Amount:");
        L9 = new JLabel("Withdraw Date:");
        L10 = new JLabel("PIN Number with:");
        L11 = new JLabel("Debit Card");
        
        L11.setFont(new Font("Arial",Font.PLAIN,24));

        // create combo box
        String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        C1 = new JComboBox<String>(Day);
       
       
        String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        C2 = new JComboBox<String>(Month);
       
        String[] Year = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        C3= new JComboBox<String>(Year);
       
       
        // create buttons
        B1 = new JButton("Add to Debit");
        B2 = new JButton("Withdrawal from Debit");
        B3 = new JButton("Clear");
        B4 = new JButton("Display");
        B10 = new JButton("Switch to Credit Card");
        
        panel3 = new JPanel();
        panel4 = new JPanel();

        // create text fields
        T1 = new JTextField(20);
        T2 = new JTextField(20);
        T3 = new JTextField(20);
        T4 = new JTextField(20);
        T5 = new JTextField(20);
        T6 = new JTextField(20);
        T7 = new JTextField(20);
        T8 = new JTextField(20);
        T9 = new JTextField(20);

        // create panel and add components
        panel.add(L1);
        panel.add(L2);
        panel.add(L3);
        panel.add(L4);
        panel.add(L5);
        panel.add(L6);
        panel.add(L7);
        panel.add(L8);
        panel.add(L9);
        panel.add(L10);
        panel.add(L11);
       
        panel.add(B1);
        panel.add(B2);
        panel.add(B3);
        panel.add(B4);
        panel.add(B10);
       
        panel.add(T1);
        panel.add(T2);
        panel.add(T3);
        panel.add(T4);
        panel.add(T5);
        panel.add(T6);
        panel.add(T7);
        panel.add(T8);
        panel.add(T9);
       
        panel.add(C1);
        panel.add(C2);
        panel.add(C3);
       
        f.add(panel);
        
        panel.add(panel3);
        panel.add(panel4);
   
       
        L1.setBounds(49, 109, 146, 34);
        L2.setBounds(49, 164, 121, 39);
        L3.setBounds(49, 237, 121, 39);
        L4.setBounds(538, 109, 145, 44);
        L5.setBounds(538, 173, 145, 43);
        L6.setBounds(538, 227, 145, 34);
        L7.setBounds(70, 453, 146, 34);
        L8.setBounds(70, 517, 146, 34);
        L9.setBounds(468, 447, 146, 34);
        L10.setBounds(468, 517, 146, 34);
        L11.setBounds(441, 19, 151, 31);

        C1.setBounds(622, 447, 65, 32);
        C2.setBounds(709, 447, 82, 32);
        C3.setBounds(813, 447, 80, 32);

        T1.setBounds(239, 104, 151, 34);
        T2.setBounds(239, 173, 151, 34);
        T3.setBounds(239, 242, 151, 34);
        T4.setBounds(715, 109, 151, 34);
        T5.setBounds(715, 173, 151, 34);
        T6.setBounds(715, 237, 151, 34);
        T7.setBounds(239, 453, 151, 34);
        T8.setBounds(239, 523, 151, 34);
        T9.setBounds(622, 517, 151, 34);

        B1.setBounds(414, 304, 197, 36);
        B2.setBounds(414, 580, 192, 37);
        B3.setBounds(70, 674, 151, 34);
        B4.setBounds(715, 673, 151, 34);
        B10.setBounds(414, 665, 209, 42);
        
        panel3.setBounds(30, 75, 875, 304);
        panel4.setBounds(30, 412, 875, 224);
       
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B10.addActionListener(this);
       
        panel.setBackground(Color.gray);
        //panel3.setBackground(Color.gray);
        //panel4.setBackground(Color.gray);
        B3.setBackground(Color.red);
        //B1.setBackground(Color.green);
        //B2.setBackground(Color.green);
        B4.setBackground(Color.green);
       
        Color clr3 = new Color(102, 255, 255);
        Color clr4 = new Color(102, 255, 255);
        
        B1.setBackground(clr3);
        B2.setBackground(clr4);
        
       
        //**********************************************************************************************************************************************//
        //*************************************************************CREDIT CARD***********************************************************************//
        //**********************************************************************************************************************************************//
       
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(0,0,936, 755);
        panel2.setVisible(false);
       
       
       
       
        // create labels
        L12 = new JLabel("Card ID:");
        L13 = new JLabel("Client Name:");
        L14 = new JLabel("Balance Amount:");
        L15 = new JLabel("Bank Account:");
        L16 = new JLabel("Issuer Bank:");
        L17 = new JLabel("Interest Rate:");
        L18 = new JLabel("CVC Number:");
        L19 = new JLabel("Expiration Date:");
        L20 = new JLabel("Card ID:");
        L21 = new JLabel("Grace Period:");
        L22 = new JLabel("Credit Limit:");
        L23 = new JLabel("Credit Card");
        
        L23.setFont(new Font("Arial", Font.PLAIN,24));

        // create combo box
        String[] Day2 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        C4 = new JComboBox<String>(Day);
       
       
        String[] Month2 = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        C5 = new JComboBox<String>(Month);
       
        String[] Year2 = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        C6 = new JComboBox<String>(Year);
       
       
        // create buttons
        B5 = new JButton("Add to Credit Card");
        B6 = new JButton("Set Credit Limit");
        B7 = new JButton("Cancel Credit Card");
        B8 = new JButton("Clear");
        B9 = new JButton("Display");
        B11 = new JButton("Switch to Debit Card");
        
        panel5 = new JPanel();
        panel6 = new JPanel();
       

        // create text fields
        T10 = new JTextField(20);
        T11 = new JTextField(20);
        T12 = new JTextField(20);
        T13 = new JTextField(20);
        T14 = new JTextField(20);
        T15 = new JTextField(20);
        T16 = new JTextField(20);
        T17 = new JTextField(20);
        T18 = new JTextField(20);
        T19 = new JTextField(20);

        // create panel and add components
       
        panel2.add(L12);
        panel2.add(L13);
        panel2.add(L14);
        panel2.add(L15);
        panel2.add(L16);
        panel2.add(L17);
        panel2.add(L18);
        panel2.add(L19);
        panel2.add(L20);
        panel2.add(L21);
        panel2.add(L22);
        panel2.add(L23);
       
        panel2.add(B5);
        panel2.add(B6);
        panel2.add(B7);
        panel2.add(B8);
        panel2.add(B9);
        panel2.add(B11);
       
        panel2.add(T10);
        panel2.add(T11);
        panel2.add(T12);
        panel2.add(T13);
        panel2.add(T14);
        panel2.add(T15);
        panel2.add(T16);
        panel2.add(T17);
        panel2.add(T18);
        panel2.add(T19);
       
        panel2.add(C4);
        panel2.add(C5);
        panel2.add(C6);
       
        f.add(panel2);
        
        panel2.add(panel5);
        panel2.add(panel6);
       
       
       
        L12.setBounds(68, 79, 146, 34);
        L13.setBounds(68, 140, 121, 39);
        L14.setBounds(68, 206, 121, 39);
        L15.setBounds(68, 272, 121, 39);
        L16.setBounds(548, 85, 145, 44);
        L17.setBounds(548, 140, 145, 43);
        L18.setBounds(555, 194, 145, 34);
        L19.setBounds(482, 271, 146, 34);
        L20.setBounds(68, 436, 146, 34);
        L21.setBounds(68, 489, 146, 34);
        L22.setBounds(68, 542, 146, 34);
        L23.setBounds(442, 14, 151, 31);

        C4.setBounds(636, 275, 57, 28);
        C5.setBounds(701, 275, 78, 26);
        C6.setBounds(787, 275, 69, 26);

        T10.setBounds(249, 79, 151, 34);
        T11.setBounds(249, 140, 151, 34);
        T12.setBounds(249, 217, 151, 34);
        T13.setBounds(249, 277, 151, 34);
        T14.setBounds(733, 85, 151, 34);
        T15.setBounds(733, 144, 151, 34);
        T16.setBounds(733, 203, 151, 34);
        T17.setBounds(249, 436, 151, 34);
        T18.setBounds(249, 489, 151, 34);
        T19.setBounds(249, 542, 151, 34);

        B5.setBounds(409, 338, 172, 32);
        B6.setBounds(249, 595, 143, 35);
        B7.setBounds(633, 520, 175, 32);
        B8.setBounds(146, 666, 96, 31);
        B9.setBounds(704, 672, 88, 29);
        B11.setBounds(420, 672, 195, 36);
        
        panel5.setBounds(30, 57, 875, 341);
        panel6.setBounds(30, 418, 875, 233);
       
        B5.addActionListener(this);
        B6.addActionListener(this);
        B7.addActionListener(this);
        B8.addActionListener(this);
        B9.addActionListener(this);
        B11.addActionListener(this);
        
        panel2.setBackground(Color.gray);
        //panel5.setBackground(Color.gray);
        //panel6.setBackground(Color.gray);
        
        B8.setBackground(Color.red);
        B9.setBackground(Color.green);
        //B5.setBackground(Color.green);
        B6.setBackground(Color.green);
        //B7.setBackground(Color.red);
        
        Color clr1 = new Color(102, 255, 255);
        Color clr2 = new Color(102, 255, 255);
        Color clr5 = new Color(102, 255, 255);
        
        B5.setBackground(clr1);
        B6.setBackground(clr5);
        B7.setBackground(clr2);
        
    
    }

    
    @Override
    public void actionPerformed(ActionEvent a)
    {
        //Add to DebitCard Button
        if(a.getSource() == B1)
        {
            if (T1.getText().isEmpty() || T2.getText().isEmpty() || T3.getText().isEmpty()|| T4.getText().isEmpty() || T5.getText().isEmpty() || T6.getText().isEmpty())
            {
                //Displays Error message if the text field is empty 
                JOptionPane.showMessageDialog(f, "Please fill in all the empty fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                //Adding a try Catch block in order to prevent the data being entered in the wrong format
                try
                {
                    //Getting the input values from the text fields of the Debit Card
                    int Card_Id = Integer.parseInt(T1.getText());
                    String Issuer_Bank = T2.getText();
                    String Client_Name = T3.getText();
                    String Bank_Account = T4.getText();
                    int Balance_Amount = Integer.parseInt(T5.getText());
                    int PIN_Number = Integer.parseInt(T6.getText());

                    //Condition to Check weather the card with the id exists or not
                    //the Debit_Card_Exists is set false
                    boolean Debit_C_Exists = false;

                    // c_id is a variable which retrives the card_id from the array list called bankcard
                    for (BankCard C_ID : Card_List) 
                    {
                        //if the retrived Card_ID from the arraylist is same the as the new Card_ID, then the Card_Exists will be true and the loop will end 
                        if (C_ID.getCard_Id() == Card_Id) 
                        {
                            Debit_C_Exists = true;
                            break;
                        }
                    }

                    if(Debit_C_Exists)
                    {
                        JOptionPane.showMessageDialog(f, "Card with the same Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
                    }

                    else
                    {
                        //Creating a new object called DebitCard
                        DebitCard Debit_C = new DebitCard(Balance_Amount, Card_Id, Bank_Account, Issuer_Bank, Client_Name,PIN_Number);

                        //Adding the above Debit Card Object to Bank Card arrayList
                        Card_List.add(Debit_C);

                        //Displaying a message "Debit Card was sucessfully Added", to let the user know if the Information was added sucessfully 
                        JOptionPane.showMessageDialog(f,"Debit Card was sucessfully Added","Alert",JOptionPane.INFORMATION_MESSAGE);

                        //Clearing the JTextFields
                        T1.setText("");
                        T2.setText("");
                        T3.setText("");
                        T4.setText("");
                        T5.setText("");
                        T6.setText("");
                    }   
                }

                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f,"Error!, Please input the valid details","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }   
        }

        //Withdraw from Debit Card Button
        else if(a.getSource() == B2)
        {
            if (T7.getText().isEmpty() || T8.getText().isEmpty() || T9.getText().isEmpty())
            {
                //Displays Error message if the text field is empty 
                JOptionPane.showMessageDialog(f, "Please fill in all the empty fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }  

            else
            {
                //Adding a try Catch block in order to prevent the data being entered in the wrong format
                try
                {
                    //Getting the input values from the JTextFields of the Debit Card
                    int Card_Id = Integer.parseInt(T7.getText());
                    int WithdrawalAmount = Integer.parseInt(T8.getText());
                    int PIN_Number = Integer.parseInt(T9.getText());
                    
                    T7.setText("");
                    T8.setText("");
                    T9.setText("");

                    //Retreving date from the JComboBox
                    String Day = (String) C1.getSelectedItem();
                    String Month = (String) C2.getSelectedItem();
                    String Year = (String) C3.getSelectedItem();

                    //Combining all the JComboBox for date
                    String Date_Of_Withdrawal = Day + "/" + Month + "/" + Year;
                    boolean Debit_Check = false;
                    boolean DebitCard_ID = false;

                    //Checking bankcard arrayList to find if the DebitCard with given card id
                    //For each loop  to go through the arraylist to find the card id  
                    for(BankCard Debit_ID : Card_List) 
                    {
                        //Downcasting to get the withdraw Method and checking if the card id mathces or not
                        if(Debit_ID instanceof DebitCard)
                        {
                            //If the card exists the DebitC_ID will be true 
                            DebitCard D_C = (DebitCard) Debit_ID;
                            Debit_Check = true;
                            
                            if(D_C.getCard_Id() == Card_Id)
                            {
                                DebitCard_ID = true;
                                if(D_C.getPIN_Number() == PIN_Number)
                                {
                                    if(D_C.getBalanceAmount() >= WithdrawalAmount)
                                    {
                                        D_C.withdraw(WithdrawalAmount, Date_Of_Withdrawal, PIN_Number);
                                    
                                        JOptionPane.showMessageDialog(f, "Amount withdrawan successfully with Card ID : " + Card_Id);
                                        T7.setText("");
                                        T8.setText("");
                                        T9.setText("");
                                        break;
                                    }
                                
                                    else
                                    {
                                        JOptionPane.showMessageDialog(f,"Insufficient Balance");
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(f,"Inter a valid pin number.");
                                }
                            }
                        }    
                    }        
                    if(Debit_Check == false)
                    {
                        JOptionPane.showMessageDialog(f,"There is no debit Card, please add one first.");
                    }
                    
                    if(Debit_Check && DebitCard_ID == false)
                    {
                        JOptionPane.showMessageDialog(f,"Card ID does not match, please enter a valid ID.");
                    }
                }
                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f, " Please fill the details correctly");
                }

            }
        }

        //Displays the Debit Card
        else if (a.getSource() == B4)
        {
            for(BankCard Display : Card_List) 
            {
                if(Display instanceof DebitCard)
                {
                    DebitCard D_Card = (DebitCard) Display;
                    D_Card.display();
                }
            }
        }

        //Clear button
        else if (a.getSource() == B3)
        {      
             T1.setText("");
             T2.setText("");
             T3.setText("");
             T4.setText("");
             T5.setText("");
             T6.setText(""); 
             T7.setText("");
             T8.setText("");
             T9.setText("");
        }
        
        // Add Credit Card
        else if (a.getSource() == B5)
        {
            if(T10.getText().isEmpty() || T11.getText().isEmpty() || T12.getText().isEmpty()|| T13.getText().isEmpty() || T14.getText().isEmpty() || T15.getText().isEmpty() || T16.getText().isEmpty())
            {
                //Displays Error message if the text field is left empty 
                JOptionPane.showMessageDialog(f, "Please fill in all the empty fields.","Alert",JOptionPane.ERROR_MESSAGE);
            } 

            else
            {
                //Adding a try Catch Block in order to prevent the data being entered in wrong format
                try
                {
                    //Getting the input values from the JTextFields of the Credit Card
                    int Card_Id = Integer.parseInt(T10.getText());
                    String Client_Name = T11.getText();
                    int Balance_Amount = Integer.parseInt(T12.getText());
                    String Bank_Account = T14.getText();
                    String Issuer_Bank = T13.getText();
                    double Interest_Rate = Double.parseDouble(T15.getText());
                    int CVC_Number = Integer.parseInt(T16.getText());
                    
                    //Retreving the date from the Jcombobox
                    String Day2 = (String) C4.getSelectedItem();
                    String Month2 = (String) C5.getSelectedItem();
                    String Year2 = (String) C6.getSelectedItem();
                    
                    //Combining all the JComboBox for date as Day, Month, Year
                    String Credit_Expiration_Date = Day2 + "/" + Month2 + "/" + Year2;
                    
                    boolean Credit_C_Exists = false;
                    for (BankCard Credit_ID : Card_List) 
                    {
                        if (Credit_ID.getCard_Id() == Card_Id) 
                        {
                            Credit_C_Exists= true;
                            break;
                        }
                    }
                    
                    if(Credit_C_Exists)
                    {
                        JOptionPane.showMessageDialog(f, "Card with the same Id already exists.", "Alert", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    else
                    {
                        CreditCard C_Card = new  CreditCard(Card_Id, Client_Name, Issuer_Bank, Bank_Account, Balance_Amount, CVC_Number, Interest_Rate, Credit_Expiration_Date);
                        Card_List.add(C_Card);
                        JOptionPane.showMessageDialog(f,"Credit Card added successfully! ","Alert",JOptionPane.INFORMATION_MESSAGE);

                        //Clearing the JTextFields
                        T10.setText("");
                        T11.setText("");
                        T12.setText("");
                        T13.setText("");
                        T16.setText("");
                        T15.setText("");
                        T14.setText("");
                        T18.setText("");
                        T17.setText("");
                        T19.setText("");
                    }
                }

                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f,"Error!, Please input the valid details","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }  
        }
        
        // Set Credit Limit
        else if (a.getSource() == B6)
        {
            if (T17.getText().isEmpty() || T18.getText().isEmpty() || T19.getText().isEmpty())
            {
                //Displays the Error message if the given text field is left empty 
                JOptionPane.showMessageDialog(f, "Please fill in all the given fields.","Alert",JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try
                {
                    // Get the input values from the JTextFields
                    int Card_Id = Integer.parseInt(T17.getText());
                    double Credit_Limit = Double.parseDouble(T19.getText()); 
                    int Grace_Period = Integer.parseInt(T18.getText());  
                    boolean CreditCard_id = false;

                    //Checking the Bankcard arrayList to find the CreditCard with given card id
                    //For each loop  to go through the arraylist to find the card id  
                    for(BankCard Credit_id : Card_List) 
                    {
                        //Downcasting to get the SetCredit Limit and checking if the Card_ID mathces or not
                        if(Credit_id.getCard_Id() == Card_Id && Credit_id instanceof CreditCard )  
                        {
                            //If the card exists the 
                            CreditCard_id = true;
                            
                            //Casting the Credit_ID to CreditCard class
                            CreditCard Creditcard = (CreditCard) Credit_id;

                            //Calling the setCredit_Limit from CreditCard class
                            Creditcard.setCredit_Limit(Credit_Limit, Grace_Period);
                            JOptionPane.showMessageDialog(f, "Credit Limit set successfully for Credit Card with card id " + Card_Id + ".", "Alert", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        
                        else
                        {
                            JOptionPane.showMessageDialog(f, "The Credit Card with Card ID " + Card_Id + " dose not exist. Please enter a valid Card ID." , "Alert", JOptionPane.ERROR_MESSAGE); 
                        }
                    }
                    

                    //Clearing the JTextFields
                    T17.setText("");
                    T18.setText("");
                    T19.setText("");
                }

                catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(f,"Error! please input the valid details.","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Displays the Credit Card
        else if (a.getSource() == B9)
        {
            for(BankCard Display : Card_List) 
            {
                if(Display instanceof CreditCard)
                {
                    CreditCard C_Card = (CreditCard) Display;
                    C_Card.display();
                }
            }
        }
        
        //Cancel Button
        else if (a.getSource() == B7)
        {
            try
            {
                int C_ID = Integer.parseInt(T17.getText());
                for(BankCard Cancel_Credit_C : Card_List) 
                {
                    if(Cancel_Credit_C instanceof CreditCard)
                    {               
                        CreditCard C_C = (CreditCard) Cancel_Credit_C;
                        if(C_C.getCard_Id() == C_ID)
                        {
                            C_C.cancelCreditCard();
                            JOptionPane.showMessageDialog(f,"Credit Card has been Cancelled");
                        }
                    
                        else
                        {
                            JOptionPane.showMessageDialog(f,"Credit Card Cancalled","Alert",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }    
            }
            
            catch(NumberFormatException n)
            {
                JOptionPane.showMessageDialog(f,"Please fill in the details correctly.");
            }
        }

        else
        {
             T10.setText("");
             T11.setText("");
             T12.setText("");
             T13.setText("");
             T14.setText("");
             T15.setText("");
             T16.setText("");
             T17.setText("");
             T18.setText("");
             T19.setText("");
        }  
        
         if(a.getSource() == B10)
       {
           panel2.setVisible(true);
           panel.setVisible(false);
       }
       
       if(a.getSource() == B11)
       {
           panel.setVisible(true);
           panel2.setVisible(false);
         
       }
    }
    
   
    public static void main(String[] args)
    {
         new BankGUI();  
    }
}