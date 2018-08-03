package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class Janela {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	public static int numJanelas = 1;
	
	private final ImageIcon icon_1 = new ImageIcon("src/johntravolta_1.gif");
	private final ImageIcon icon_2 = new ImageIcon("src/johntravolta_2.gif");
	private final int height = 300;
	private final int weight_1 = height * icon_1.getIconWidth() / icon_1.getIconHeight();
	private final int weight_2 = height * icon_2.getIconWidth() / icon_2.getIconHeight();
	ImageIcon resized_1 = new ImageIcon(icon_1.getImage().getScaledInstance(weight_1, height, Image.SCALE_DEFAULT));
	ImageIcon resized_2 = new ImageIcon(icon_2.getImage().getScaledInstance(weight_2, height, Image.SCALE_DEFAULT));
	
	JLabel label_1 = new JLabel(resized_1);
	JLabel label_2 = new JLabel(resized_2);
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		btnNewButton.setBounds((weight_2-330)/2+130, 25, 110, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setAction(action_1);
		btnNewButton_1.setBounds((weight_2-330)/2+260, 25, 110, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.setBounds((weight_2-330)/2, 25, 110, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		label_1.setBounds(20, 90, weight_2, height);
		label_2.setBounds(20, 90, weight_2, height);
		frame.getContentPane().add(label_1);
		
		frame.setBounds(100, 100, 40 + weight_2, 110 + height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Mudar Cor");
			putValue(SHORT_DESCRIPTION, "Muda a cor de fundo desta janela.");
		}
		public void actionPerformed(ActionEvent e) {
			Color background = frame.getContentPane().getBackground();
			if (background == Color.WHITE) {
				frame.getContentPane().setBackground(Color.YELLOW);
			}
			else if (background == Color.YELLOW) {
				frame.getContentPane().setBackground(Color.RED);
			}
			else if (background == Color.RED) {
				frame.getContentPane().setBackground(Color.ORANGE);
			}
			else if (background == Color.ORANGE) {
				frame.getContentPane().setBackground(Color.PINK);
			}
			else if (background == Color.PINK) {
				frame.getContentPane().setBackground(Color.WHITE);
			}
			else {
				frame.getContentPane().setBackground(Color.WHITE);
			}
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Mudar GIF");
			putValue(SHORT_DESCRIPTION, "Muda a Gif em exibição");
		}
		public void actionPerformed(ActionEvent e) {
			Component instantLabel = frame.getContentPane().getComponent(3);
			
			if (instantLabel == label_1) {
				frame.getContentPane().remove(label_1);
				frame.getContentPane().add(label_2);
			}
			else if (instantLabel == label_2) {
				frame.getContentPane().remove(label_2);
				frame.getContentPane().add(label_1);
			}
			
			//Grande Gambiarra para atualizar o coteúdo da tela. A cor é alterada para preto e depois volta ao anterior.
			Color background = frame.getContentPane().getBackground();
			frame.getContentPane().setBackground(Color.BLACK);
			frame.getContentPane().setBackground(background);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Fechar xD");
			putValue(SHORT_DESCRIPTION, "Quando atingirmos a meta dobraremos a meta!");
		}
		public void actionPerformed(ActionEvent e) {
			int count;
			for (count = 0; count < numJanelas ; count++) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							(new Janela()).frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
			numJanelas = 2*numJanelas;
		}
	}
}
