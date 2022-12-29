import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;

import org.omg.PortableServer.ServantActivatorOperations;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Dimension;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField inputTextField;
	private JTextField outputTextField;
	private JButton btnClear;
	private JButton btnEqualTo;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultiplication;
	private JButton btnDivision;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
	/**
	 * @wbp.nonvisual location=59,14
	 */
	private final JLayeredPane layeredPane = new JLayeredPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(new Color(0, 0, 0));
	
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("images/icon.png"));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setResizable(false);
		frmCalculator.setBounds(new Rectangle(0, 0, 0, 0));
		frmCalculator.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 20));
		frmCalculator.setBackground(new Color(192, 192, 192));
		frmCalculator.getContentPane().setBackground(new Color(0, 0, 0));
		frmCalculator.getContentPane().setForeground(new Color(255, 255, 255));
		frmCalculator.setBounds(600, 100, 354, 492);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);	
		
		
		inputTextField = new JTextField();
		inputTextField.setEditable(false);
		inputTextField.setFont(new Font("Calibri", Font.BOLD, 25));
		inputTextField.setForeground(new Color(255, 255, 255));
		inputTextField.setBackground(new Color(0, 0, 0));
		inputTextField.setBounds(0, 0, 336, 84);
		frmCalculator.getContentPane().add(inputTextField);
		inputTextField.setColumns(10);
		
		
		outputTextField = new JTextField();
		outputTextField.setEditable(false);
		outputTextField.setFont(new Font("Calibri", Font.BOLD, 25));
		outputTextField.setForeground(new Color(255, 255, 255));
		outputTextField.setBackground(new Color(0, 0, 0));
		outputTextField.setBounds(0, 84, 336, 84);
		frmCalculator.getContentPane().add(outputTextField);
		outputTextField.setColumns(10);
		
		
		btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextField.setText(null);
				outputTextField.setText(null);
			}
		});
		btnClear.setBounds(new Rectangle(10, 0, 0, 0));
		btnClear.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setForeground(new Color(250, 138, 37));
		btnClear.setBounds(0, 375, 85, 70);
		frmCalculator.getContentPane().add(btnClear);
		
		
		btnEqualTo = new JButton("=");
		btnEqualTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnEqualTo.setBounds(new Rectangle(10, 0, 0, 0));
		btnEqualTo.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnEqualTo.setBackground(new Color(0, 0, 0));
		btnEqualTo.setForeground(new Color(250, 138, 37));
		btnEqualTo.setBounds(167, 375, 85, 70);
		frmCalculator.getContentPane().add(btnEqualTo);
		
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btnPlus.getText());
			}
		});
		btnPlus.setBounds(new Rectangle(10, 0, 0, 0));
		btnPlus.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnPlus.setBackground(new Color(0, 0, 0));
		btnPlus.setForeground(new Color(250, 138, 37));
		btnPlus.setBounds(251, 375, 85, 70);
		frmCalculator.getContentPane().add(btnPlus);
		
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btnMinus.getText());
			}
		});
		btnMinus.setBounds(new Rectangle(10, 0, 0, 0));
		btnMinus.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnMinus.setBackground(new Color(0, 0, 0));
		btnMinus.setForeground(new Color(250, 138, 37));
		btnMinus.setBounds(251, 306, 85, 70);
		frmCalculator.getContentPane().add(btnMinus);
		
		
		btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btnMultiplication.getText());
			}
		});
		btnMultiplication.setBounds(new Rectangle(10, 0, 0, 0));
		btnMultiplication.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnMultiplication.setBackground(new Color(0, 0, 0));
		btnMultiplication.setForeground(new Color(250, 138, 37));
		btnMultiplication.setBounds(251, 237, 85, 70);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		
		btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btnDivision.getText());
			}
		});
		btnDivision.setBounds(new Rectangle(10, 0, 0, 0));
		btnDivision.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnDivision.setBackground(new Color(0, 0, 0));
		btnDivision.setForeground(new Color(250, 138, 37));
		btnDivision.setBounds(251, 168, 85, 70);
		frmCalculator.getContentPane().add(btnDivision);
		
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn0.getText());
			}
		});
		btn0.setBounds(new Rectangle(10, 0, 0, 0));
		btn0.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn0.setBackground(new Color(0, 0, 0));
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBounds(84, 375, 85, 70);
		frmCalculator.getContentPane().add(btn0);
		
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn1.getText());
			}
		});
		btn1.setBounds(new Rectangle(10, 0, 0, 0));
		btn1.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBounds(0, 306, 85, 70);
		frmCalculator.getContentPane().add(btn1);
		
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn2.getText());
			}
		});
		btn2.setBounds(new Rectangle(10, 0, 0, 0));
		btn2.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBounds(84, 306, 85, 70);
		frmCalculator.getContentPane().add(btn2);
		
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn3.getText());
			}
		});
		btn3.setBounds(new Rectangle(10, 0, 0, 0));
		btn3.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn3.setBackground(new Color(0, 0, 0));
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBounds(167, 306, 85, 70);
		frmCalculator.getContentPane().add(btn3);
		
		
		btn4 = new JButton("4");
		btn4.setBounds(new Rectangle(10, 0, 0, 0));
		btn4.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn4.getText());
			}
		});
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBounds(0, 237, 85, 70);
		frmCalculator.getContentPane().add(btn4);
		
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn5.getText());
			}
		});
		btn5.setBounds(new Rectangle(10, 0, 0, 0));
		btn5.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBounds(84, 237, 85, 70);
		frmCalculator.getContentPane().add(btn5);

		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn6.getText());
			}
		});
		btn6.setBounds(new Rectangle(10, 0, 0, 0));
		btn6.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBounds(167, 237, 85, 70);
		frmCalculator.getContentPane().add(btn6);
		
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn7.getText());
			}
		});
		btn7.setBounds(new Rectangle(10, 0, 0, 0));
		btn7.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBounds(0, 168, 85, 70);
		frmCalculator.getContentPane().add(btn7);
		
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn8.getText());
			}
		});
		btn8.setBounds(new Rectangle(10, 0, 0, 0));
		btn8.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBounds(84, 168, 85, 70);
		frmCalculator.getContentPane().add(btn8);
		
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputTextFieldReplacer(btn9.getText());
			}
		});
		btn9.setBounds(new Rectangle(10, 0, 0, 0));
		btn9.setFont(new Font("Dialog", Font.PLAIN, 25));
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBounds(167, 168, 85, 70);
		frmCalculator.getContentPane().add(btn9);
	}
	
	void inputTextFieldReplacer(String s) {
		inputTextField.setText((inputTextField.getText()+s));
	}
	
	void calculate() {
		String expression=inputTextField.getText();
	
		

		
        try {
            String answer = String.valueOf(engine.eval(expression));
            outputTextField.setText(answer);
        } 
        catch (Exception e) {
        	JOptionPane.showMessageDialog(null, "invalid inputs");
        }
	}
}
