import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet  code="Cal" width=300 height=300></applet>*/
public class Cal extends Applet implements ActionListener
{
		TextField t;
		Button b[]=new Button[15];
		Button b1[]=new Button[10];
            	String op2[]={"+","-","*","%","C","x^2","sin","cos","tan","="};
            	String str1="";
            	int p=0,q=0;
            	String oper;
            	public void init()
            	{
                        setLayout(new GridLayout(10,10));
                        t=new TextField(20);
                        setBackground(Color.gray);
                        setFont(new Font("Arial",Font.BOLD,20));
                        int k=0;
                        t.setEditable(false);
                        t.setBackground(Color.white);
                        t.setText("0");
                        add(t);

	                for(int i=0;i<10;i++)
                        {
                                    b[i]=new Button(""+k);
                                    add(b[i]);
                                    k++;
                                    b[i].setBackground(Color.pink);
                                    b[i].addActionListener(this);
                        }
                        for(int i=0;i<10;i++)
                        {
                                    b1[i]=new Button(""+op2[i]);
                                    add(b1[i]);
                                    b1[i].setBackground(Color.pink);
                                    b1[i].addActionListener(this);
                        }
            }
            public void actionPerformed(ActionEvent ae)
            {
                        String  str=ae.getActionCommand();
                        if(str.equals("+"))
			{
			      	p=Integer.parseInt(t.getText());
                              	oper=str;
                              	t.setText(str1="");
                        }
			else if(str.equals("-"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("*"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("%"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("x^2"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("sin"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("cos"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }
                        else if(str.equals("tan"))
                        {
                                p=Integer.parseInt(t.getText());
                                oper=str;
                                t.setText(str1="");
                        }

			else if(str.equals("="))
                        {
                                str1="";
                                if(oper.equals("+"))
                                {
                                        q=Integer.parseInt(t.getText());
                                        t.setText(String.valueOf((p+q)));
                                }

                                else if(oper.equals("-"))
                                {
                                        q=Integer.parseInt(t.getText());
                                        t.setText(String.valueOf((p-q)));
                                }

                                else  if(oper.equals("*"))
                                {
                                        q=Integer.parseInt(t.getText());
                                        t.setText(String.valueOf((p*q)));
                                }

                                else if(oper.equals("%"))
                                {
                                        q=Integer.parseInt(t.getText());
                                        t.setText(String.valueOf((p%q)));
                                }
                                else if(oper.equals("x^2"))
                                {
                                        t.setText(String.valueOf((p*p)));
                                }
				else if(oper.equals("sin"))
		                {
                        		t.setText(Float.toString((float)Math.sin(p*22.0/(7*180))));
   			        }
				else if(oper.equals("cos"))
		                {
                        		t.setText(Float.toString((float)Math.cos(p*22.0/(7*180))));
   			        }
				else if(oper.equals("tan"))
		                {
                        		t.setText(Float.toString((float)Math.tan(p*22.0/(7*180))));
   			        }

                        }
                        else if(str.equals("C"))
                        {
                                p=0;q=0;
                                t.setText("");
                                str1="";
                                t.setText("0");
                        }
                        else
                        {
                                t.setText(str1.concat(str));
                                str1=t.getText();
                        }
                }
}
