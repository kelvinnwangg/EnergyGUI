import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class EnergyGUI implements ActionListener, ChangeListener{
	//Properties
	JFrame theframe = new JFrame("EnergyGUI");
	JPanel thepanel;
	JButton Start;
	
	JMenuBar themenubar = new JMenuBar();
	JMenu filemenu = new JMenu("Options");
	JMenuItem create = new JMenuItem("Create");
	JMenuItem open = new JMenuItem("Open");
	
	JSlider Mass;
	JTextField MassNum;
	JSlider Height;
	JTextField HeightNum;

	//Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == Start){
			
		}
	}
	public void stateChanged(ChangeEvent evt){
		if(evt.getSource() == Mass){
			MassNum.setText(Mass.getValue()+"");
		}else if(evt.getSource() == Height){
			HeightNum.setText(Height.getValue()+"");
		}
	}
	

	
	//Constructors
	public EnergyGUI(){
		theframe = new JFrame("EnergyGUI");
		
		thepanel = new JPanel();
		thepanel.setPreferredSize(new Dimension(960, 540));
		thepanel.setLayout(null);
		
		
		theframe.setContentPane(thepanel);
		theframe.pack();
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.setVisible(true);
	}

	//Main Method
	public static void main(String[] args){
		new EnergyGUI();
	}

}
