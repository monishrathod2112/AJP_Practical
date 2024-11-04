import java.awt.*; 
import javax.swing.*;
public class Practical6 extends JFrame
{
public Practical6()
{
Container ct= getContentPane(); 
ct.setLayout(null);
JLabel jl = new JLabel("Select Language:"); 
JComboBox<String> jc = new JComboBox<>(); 
jc.addItem("English");
jc.addItem("Hindi"); 
jc.addItem("Marathi"); 
jc.addItem("Sanskrit"); 
ct.add(jl);
ct.add(jc); 
jl.setBounds(30,50,100,30);
jc.setBounds(150,50,100,30);
}
public static void main(String ar[])
{
Practical6 fr= new Practical6(); 
fr.setTitle("Practical No.6 by Monish");
fr.setSize(300,400); 
fr.setVisible(true);
}
}
