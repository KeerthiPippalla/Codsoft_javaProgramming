import java.awt.*;
import java.awt.event.*;

public class ATM extends Frame implements ActionListener{
    Button withdraw,deposit,balance;
	Label l1,l2,l3,l4;
	TextField tf3,tf4;
    int amount;
ATM(int amount)
  {
    Frame f=new Frame("WELCOME TO ATM");
    setSize(800,800);

   
    balance= new Button("Check balance");
    withdraw=new Button("Withdraw");
    deposit=new Button("Deposit");
    
    l1=new Label("Welcome select the option");
    l2=new Label();
    
   
    l1.setForeground(Color.black);
    l1.setFont(new Font("Serif", Font.PLAIN, 28));
    l2.setForeground(Color.black);
    l2.setFont(new Font("Serif", Font.PLAIN, 28));
    
    l3=new Label("Enter amount to be Withdrawn: ");
    l3.setFont(new Font("Serif", Font.PLAIN, 14));
    tf3=new TextField();
    l4=new Label("Enter amount to be Deposit: ");
    l4.setFont(new Font("Serif", Font.PLAIN, 14));
    tf4=new TextField();
    
    balance.setBounds(600,200,100,50);
    withdraw.setBounds(600,400,100,50);
    deposit.setBounds(600,600,100,50);
    l1.setBounds(50,50,400,50);
    l2.setBounds(50,650,400,50);
    l3.setBounds(50,400,200,50);
    tf3.setBounds(250,400,200,50);
    l4.setBounds(50,600,200,50);
    tf4.setBounds(250,600,200,50);
    
    
    
    withdraw.addActionListener(this);
    balance.addActionListener(this);
    deposit.addActionListener(this);
    
    add(balance);
    add(withdraw);
    add(deposit);
    add(l1);
    add(l2);
	add(l4);
	add(tf4);
	add(l3);
	add(tf3);
    
    setLayout(null);
    setVisible(true);
    this.addWindowListener(new WindowAdapter() {
    	public void windowClosing(WindowEvent we) {
    		System.exit(0);
    	}
    	});}
   public void actionPerformed(ActionEvent e) {

		if(e.getSource() == balance)
		{
			l2.setText("Balance is "+amount);
		}
		else if(e.getSource()==withdraw)
		{

			int withdrawl=Integer.parseInt(tf3.getText());
			if(withdrawl<amount)
			{
			amount=amount-withdrawl;
			l2.setText("Transaction successful of "+withdrawl);
			}
			else
			{
				l2.setText("Unsuccessfull because of low balance");
			}
		}
		else
		{

			int deposit=Integer.parseInt(tf4.getText());
			amount=amount+deposit;
			l2.setText("Transaction successful of "+deposit);
		}
		
	}

public static void main(String args[])
{
	int amount=0;
	new ATM(amount);
    
}

}
