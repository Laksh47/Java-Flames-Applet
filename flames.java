import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="flames" width=295 height=210>
</applet>
*/
public class flames extends Applet implements ActionListener
{
   TextField t1,t2;
    Button b1,b2,b3;
    String s1,s2,msg="     -";
    String score="     -";
    @Override
	public void init()
	{
		 //setLayout(new GridLayout(4,2));
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 Label l1=new Label("Enter your name              :",Label.LEFT);
		 Label l2=new Label("Enter your partner name:",Label.LEFT);
		 t1=new TextField(15);
		 t2=new TextField(15);
		 b1=new Button("FLAMES");
                                 b2=new Button("score(%)");
                                 b3=new Button("Refresh");
		 add(l1);
		 add(t1);
	 	 add(l2);
	 	 add(t2);                                     	
                  	 add(b1);
                                 add(b2);
                                 add(b3);
		 t1.addActionListener(this);
		 t2.addActionListener(this);
		 b1.addActionListener(this);
		 b2.addActionListener(this);
                                 b3.addActionListener(this);
	}
    @Override
	public void actionPerformed(ActionEvent ae)
	{
                  String s3;
                  int a,b;
                  int flames,scr;
                  s1=t1.getText();
                  s2=t2.getText();
                  a=s1.length();
                  b=s2.length();
                  s3=ae.getActionCommand();
                    if(s3.equals("FLAMES"))
                   { 
                     flames=(a+b)%6;
                     switch(flames)
                     {
                         case 0:
                                    msg="Friendship";
                                    break;                   
                         case 1:
                                    msg="Love";
                                    break; 
                         case 2:
                                    msg="Affection";
                                    break;
                         case 3:
                                    msg="Marriage";
                                    break;
                         case 4:
                                    msg="Enemy";
                                    break;
                         case 5:
                                    msg="Siblings";
                                    break;
                      }                
                    }
                    else if(s3.equals("score(%)"))
                   {
                     scr=a*b;
                     if(scr>100)
                     {
                         if(scr%100==0)
                              scr=100;
                         else
                              scr=scr%100; 
                     }               
                     score=scr+"%";
                   }
                   else
                   {
                      t1.setText("");
                      t2.setText("");
                      msg="     -";
                      score="     -";
                   }
                   repaint();
	}
    @Override
	  public void paint(Graphics g)
	{
                   g.drawString("Relationship      :"+msg,10,140);
                   g.drawString("And Ur Score is :"+score,10,160);
                   showStatus("Wanna play FLAMES!!!");
	}
}