///////////////////////////////////////////
//
// Author: Sydney Lyon
// Updated: 5/5/2016
// Purpose: Builds Main Frame for Program
//
///////////////////////////////////////////

import javax.swing.JFrame;
import javax.swing.WindowConstants;
    
public class MainFrame extends JFrame{

    public static final int FRAME_HEIGHT = 500;
    public static final int FRAME_WIDTH = 800;
   
    public MainFrame(){
	// set
	this.setVisible(true);
	this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	MainPanel mp = new MainPanel();
	//OrderPanel op = new OrderPanel();
	this.add(mp);
	this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	//this.addMouseListener(mp);	

    }


    public static void main(String[] args){

	MainFrame mf = new MainFrame();

    }

}
