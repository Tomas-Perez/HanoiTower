package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Stack;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class View extends JFrame {
	private JPanel oneone;
	private JPanel onetwo;
	private JPanel onethree;
	private JPanel onefour;
	private JPanel twoone;
	private JPanel twotwo;
	private JPanel twothree;
	private JPanel twofour;
	private JPanel threeone;
	private JPanel threetwo;
	private JPanel threethree;
	private JPanel threefour;
	
	
	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		onethree = new JPanel();
		onethree.setBorder(new EmptyBorder(0, 0, 0, 0));
		onethree.setBackground(Color.ORANGE);
		
		onefour = new JPanel();
		onefour.setBorder(new EmptyBorder(0, 0, 0, 0));
		onefour.setBackground(Color.YELLOW);
		
		JButton btnNextStep = new JButton("Next step");
		
		onetwo = new JPanel();
		onetwo.setBorder(new EmptyBorder(0, 0, 0, 0));
		onetwo.setBackground(Color.RED);
		
		oneone = new JPanel();
		oneone.setBorder(new EmptyBorder(0, 0, 0, 0));
		oneone.setBackground(Color.BLUE);
		
		twofour = new JPanel();
		twofour.setBorder(new EmptyBorder(0, 0, 0, 0));
		twofour.setBackground(Color.YELLOW);
		
		twothree = new JPanel();
		twothree.setBorder(new EmptyBorder(0, 0, 0, 0));
		twothree.setBackground(Color.ORANGE);
		
		twotwo = new JPanel();
		twotwo.setBorder(new EmptyBorder(0, 0, 0, 0));
		twotwo.setBackground(Color.RED);
		
		twoone = new JPanel();
		twoone.setBorder(new EmptyBorder(0, 0, 0, 0));
		twoone.setBackground(Color.BLUE);
		
		threefour = new JPanel();
		threefour.setBorder(new EmptyBorder(0, 0, 0, 0));
		threefour.setBackground(Color.YELLOW);
		
		threethree = new JPanel();
		threethree.setBorder(new EmptyBorder(0, 0, 0, 0));
		threethree.setBackground(Color.ORANGE);
		
		threetwo = new JPanel();
		threetwo.setBorder(new EmptyBorder(0, 0, 0, 0));
		threetwo.setBackground(Color.RED);
		
		threeone = new JPanel();
		threeone.setBorder(new EmptyBorder(0, 0, 0, 0));
		threeone.setBackground(Color.BLUE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(onetwo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
							.addGap(44))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(onethree, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(34))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(oneone, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(54))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(onefour, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(twoone, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(twotwo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(twothree, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addComponent(twofour, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(threeone, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addComponent(threetwo, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(14)
							.addComponent(threethree, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addComponent(threefour, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(98, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(430, Short.MAX_VALUE)
					.addComponent(btnNextStep)
					.addGap(30))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(threeone, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(threetwo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(threethree, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(threefour, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(twoone, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(twotwo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(twothree, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(twofour, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(oneone, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(onetwo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(onethree, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(onefour, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(221)
					.addComponent(btnNextStep)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setTitle("Hanoi Towers");
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public void display(ArrayList<Stack<Integer>> newDiscs) {
		oneone.setVisible(false);
		onetwo.setBackground(Color.blue);
		onetwo.setSize(new Dimension(3, 23));
	}

}
