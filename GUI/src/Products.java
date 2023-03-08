import javax.swing.*;
import java.awt.*;

public class Products {

    private JPanel panel1;
    private JLabel Webiste;

    public Products()
    {
        JFrame frame=new JFrame();
        frame.setTitle("Products");
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(1,3));
        panel1.setBackground(Color.BLUE);
        panel1.setBounds(10,20,500,400);
        JLabel label1=new JLabel("Product1");
        label1.setBounds(10,21,50,100);
        JLabel label2=new JLabel("Product2");
        label2.setBounds(80,21,50,100);
        JLabel label3=new JLabel("Product3");
        label3.setBounds(140,21,50,100);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        frame.add(panel1);
        JPanel panel2=new JPanel();
        panel2.setLayout(new GridLayout(1,3));
        panel2.setBounds(10,425,500,400);
        panel2.setBackground(Color.CYAN);
        frame.add(panel2);
        JPanel panel3=new JPanel();
        panel3.setLayout(new GridLayout(1,3));
        panel3.setBounds(520,21,500,400);
        panel3.setBackground(Color.darkGray);
        frame.add(panel3);
        JPanel panel4=new JPanel();
        panel4.setLayout(new GridLayout(1,3));
        panel4.setBounds(520,425,500,400);
        panel4.setBackground(Color.YELLOW);
        frame.add(panel4);
        JPanel panel5=new JPanel();
        panel5.setLayout(new GridLayout(1,3));
        panel5.setBounds(1030,21,500,400);
        panel5.setBackground(Color.BLUE);
        frame.add(panel5);
        JPanel panel6=new JPanel();
        panel6.setLayout(new GridLayout(1,3));
        panel6.setBounds(1030,425,500,400);
        panel6.setBackground(Color.BLACK);
        frame.add(panel6);
        JPanel panel7=new JPanel();
        panel7.setLayout(new GridLayout(1,3));
        panel7.setBounds(1030,21,500,400);
        panel7.setBackground(Color.WHITE);
        frame.add(panel7);


        //panel2.setBounds();
    }

    public static void main(String[] args) {
        new Products();
    }


}
