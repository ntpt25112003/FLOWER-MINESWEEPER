
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Display{					
	
	public JFrame frame = new JFrame("Minesweeper - by Nowaycode");			

	public JButton levelButton = new JButton("   Level   ");	
	public JButton customLevelButton = new JButton("   Custom   "); 
	public JButton playAgainButton = new JButton("   Play Again   ");  	
	public JButton rankingsButton = new JButton("   Rankings  "); 
	public JButton soundTurningButton = new JButton("   Sound   "); 
    public static JLabel textLabel = new JLabel(); 
	public JPanel boardPanel = new JPanel();			
	public JPanel buttonPanel = new JPanel(new FlowLayout());  

	public static ImageIcon flagIcon = new ImageIcon("flag.png");  
	public static ImageIcon bombIcon = new ImageIcon("bomb.png");
	public static ImageIcon unclickedIcon = new ImageIcon("unclicked.png");
	public static ImageIcon nullIcon = new ImageIcon("null.png");
	public static ImageIcon[] numberIcons = new ImageIcon[9];	
}
	