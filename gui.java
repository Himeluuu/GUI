import java.awt.Color;
import java.awt.Font;


import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;



public class gui{
    public static void main(String [] args){ 
       Border border = BorderFactory.createLineBorder(Color.BLUE,3);
       JLabel label = new JLabel(); 
       JButton button = new JButton();
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setForeground(new Color(0x00FF));
       label.setFont(new Font("MV Boli",Font.BOLD,20));
       label.setBackground(Color.BLACK);
       label.setOpaque(true);
       label.setBorder(border);
       label.setVerticalAlignment(JLabel.TOP);
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setBounds(100,20 , 400, 400);
       label.setText("<html> PERSONAL DETAILS: <br> NAME: Himel Jana <br> HOMETOWN: Kolkata <br> HOBBIES: Cricket, Dance, Gaming <br> FATHERS NAME: Sandip Jana <br> MOTHERS NAME: Sheuli Jana</html>");
       button.setBounds(100,200,400,100);
	   button.setText("PRESS FOR PERSONAL DETAILS");
	   button.setFocusable(false);
	   button.setFont(new Font("MV Boli",Font.BOLD,20));
	   button.addActionListener(e -> {label.setVisible(true); button.setEnabled(false);});
		
	   label.setVisible(false);





       
       JFrame frame = new JFrame(); 
       frame.setTitle("PERSONAL DETAILS");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(420,420);
       frame.setLayout(null);
       frame.setVisible(true);
       frame.getContentPane().setBackground(Color.darkGray);
       frame.add(label);
       frame.add(button);



    }
}
