package wholesalemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LogIn extends Utility {
	
	protected static JFrame jframe;
	protected static JPanel jpanel;
	protected static JButton jbutton;
	protected static JButton jbutton1;
	protected static JButton jbutton2;
	protected static JButton jbutton3;
	protected static JButton jbutton4;
	protected static JButton jbutton5;
	protected static JButton jbutton6;
	protected static JLabel jlabel;
	protected static JLabel jlabel1;
	protected static JLabel jlabel2;
	protected static JLabel jlabel3;
	protected static JLabel jlabel4;
	protected static JLabel jlabel5;
	protected static JLabel jlabel6;
	protected static JLabel jlabel7;
	protected static JLabel jlabel8;
	protected static JLabel jlabelback;
	protected static JLabel jlabelsignout;
	protected static JTextField jtextfield;
	protected static JTextField jtextfield1;
	protected static JTextField jtextfield2;
	protected static JPasswordField jpasswordfield;
	protected static ImageIcon image;
	protected static ImageIcon image1;
	protected static ImageIcon image2;
	protected static ImageIcon image3;
	protected static ImageIcon image4;
	protected static ImageIcon image5;
	protected static ImageIcon image6;
	protected static ImageIcon image7;
	protected static ImageIcon image8;
	protected static ImageIcon image9;
	protected static ImageIcon image10;
	protected static ImageIcon imageback;
	protected static ImageIcon imagesignout;

	public LogIn() {
		
		
		
		jframe=new JFrame();
		jframe.setTitle("LogIn");
		jframe.setSize(new Dimension(1016,638));
		jpanel=new JPanel();
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.getContentPane().add(jpanel);
		jpanel.setLayout(null);
		
		
		
		jpasswordfield=new JPasswordField();//password
		jpasswordfield.setBounds(395,403,381,38);
		jpanel.add(jpasswordfield);
		
		
		jtextfield= new JTextField();
		jtextfield.setBounds(395,340,381,38);
		jpanel.add(jtextfield);
		
		
		jlabel1=new JLabel("Password :");
        jlabel1.setBounds(224,408,145,17);
        jpanel.add(jlabel1);
        jlabel2 =new JLabel("Merchant Id :");
        jlabel2.setBounds(224,350,145,17);
        jpanel.add(jlabel2);
         
        
		jbutton=new JButton("LogIn");//login
		jbutton.addActionListener(new ActionListener() {//@fuad checks password from database and then goes to menu
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new Menu();
		}});
		jbutton.setSize(100,40);
		jbutton.setLocation(515,471);
		jpanel.add(jbutton);
		jbutton1=new JButton("SignUp");//sign up
		jbutton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jframe.dispose();
				new SignUp1();
		}});
		jbutton1.setSize(100,40);
		jbutton1.setLocation(374,471);
		jpanel.add(jbutton1);
		imageback=new ImageIcon("Back.png");
		jlabelback=new JLabel("Back");//back
		jlabelback.setIcon(imageback);
		jlabelback.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				jframe.dispose();
				new FrontPage();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
		});
		jlabelback.setLocation(72, 72);
		jlabelback.setSize(60, 60);
		jpanel.add(jlabelback);
		
		
		image=new ImageIcon("LogIn.jpg");
		jlabel=new JLabel();
		jlabel.setIcon(image);
		jlabel.setBounds(0,0,1000,600); 
		jpanel.add(jlabel);
		jbutton2=new JButton();//back
		
		
		
		jframe.setVisible(true);
	}

}
