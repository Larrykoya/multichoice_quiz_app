package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class MultichoiceQuizApp extends JFrame implements ActionListener {
	String userName = JOptionPane.showInputDialog("Enter Student Name: ");
	String studentNumber = JOptionPane.showInputDialog("Enter Student Number: ");
	//String welcome = "Welcome " + userName;
	
	
	JLabel q1= new JLabel("how many days are in a week?");
	JLabel q2 = new JLabel("how many weeks are in a month?");
	JLabel q3= new JLabel("how many hours are in a day?");
	JLabel q4 = new JLabel("how many months are in a year?");
	JLabel q5 = new JLabel("which is the first month of the year?");
	JLabel studentName = new JLabel("Student Name: "+userName);
	JLabel studentNum = new JLabel("Student Number: "+studentNumber);
	int score=0;
	JLabel scoreCount;
	JButton submit = new JButton("Submit");
	ButtonGroup ans1 = new ButtonGroup();
	JRadioButton q1option1 = new JRadioButton("6");
	JRadioButton q1option2 = new JRadioButton("7");
	JRadioButton q1option3 = new JRadioButton("8");
	JRadioButton q1option4 = new JRadioButton("9");
	ButtonGroup ans2 = new ButtonGroup();
	JRadioButton q2option1 = new JRadioButton("8");
	JRadioButton q2option2 = new JRadioButton("6");
	JRadioButton q2option3 = new JRadioButton("4");
	JRadioButton q2option4 = new JRadioButton("2");
	ButtonGroup ans3 = new ButtonGroup();
	JRadioButton q3option1 = new JRadioButton("21");
	JRadioButton q3option2 = new JRadioButton("22");
	JRadioButton q3option3 = new JRadioButton("23");
	JRadioButton q3option4 = new JRadioButton("24");
	ButtonGroup ans4 = new ButtonGroup();
	JRadioButton q4option1 = new JRadioButton("12");
	JRadioButton q4option2 = new JRadioButton("24");
	JRadioButton q4option3 = new JRadioButton("36");
	JRadioButton q4option4 = new JRadioButton("48");
	ButtonGroup ans5 = new ButtonGroup();
	JRadioButton q5option1 = new JRadioButton("March");
	JRadioButton q5option2 = new JRadioButton("August");
	JRadioButton q5option3 = new JRadioButton("December");
	JRadioButton q5option4 = new JRadioButton("January");
	GridLayout grid= new GridLayout(0,1,0,0);
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8 = new JPanel();
	int [] correctAns = new int [5];
	
	

	public MultichoiceQuizApp() {
		initFrame();
	}

	private void initFrame() {
		Container contentPane = this.getContentPane();
		this.setSize(800,800);
		
		this.setTitle("Multichoice Quiz");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		
		contentPane.setLayout(grid);
		panel1.add(studentName);
		panel1.add(studentNum);
		
		panel2.add(q1);
		ans1.add(q1option1);
		ans1.add(q1option2);
		ans1.add(q1option3);
		ans1.add(q1option4);
		panel2.add(q1option1);
		panel2.add(q1option2);
		panel2.add(q1option3);
		panel2.add(q1option4);
		q1option1.addActionListener(this);
		q1option2.addActionListener(this);
		q1option3.addActionListener(this);
		q1option4.addActionListener(this);
		
		panel3.add(q2);
		ans2.add(q2option1);
		ans2.add(q2option2);
		ans2.add(q2option3);
		ans2.add(q2option4);
		panel3.add(q2option1);
		panel3.add(q2option2);
		panel3.add(q2option3);
		panel3.add(q2option4);
		q2option1.addActionListener(this);
		q2option2.addActionListener(this);
		q2option3.addActionListener(this);
		q2option4.addActionListener(this);
		
		panel4.add(q3);
		ans3.add(q3option1);
		ans3.add(q3option2);
		ans3.add(q3option3);
		ans3.add(q3option4);
		panel4.add(q3option1);
		panel4.add(q3option2);
		panel4.add(q3option3);
		panel4.add(q3option4);
		q3option1.addActionListener(this);
		q3option2.addActionListener(this);
		q3option3.addActionListener(this);
		q3option4.addActionListener(this);
		
		panel5.add(q4);
		ans4.add(q4option1);
		ans4.add(q4option2);
		ans4.add(q4option3);
		ans4.add(q4option4);
		panel5.add(q4option1);
		panel5.add(q4option2);
		panel5.add(q4option3);
		panel5.add(q4option4);
		q4option1.addActionListener(this);
		q4option2.addActionListener(this);
		q4option3.addActionListener(this);
		q4option4.addActionListener(this);
		
		panel6.add(q5);
		ans5.add(q5option1);
		ans5.add(q5option2);
		ans5.add(q5option3);
		ans5.add(q5option4);
		panel6.add(q5option1);
		panel6.add(q5option2);
		panel6.add(q5option3);
		panel6.add(q5option4);
		q5option1.addActionListener(this);
		q5option2.addActionListener(this);
		q5option3.addActionListener(this);
		q5option4.addActionListener(this);
		
		panel7.add(submit);
		submit.addActionListener(this);
		contentPane.add(panel1);
		contentPane.add(panel2);
		contentPane.add(panel3);
		contentPane.add(panel4);
		contentPane.add(panel5);
		contentPane.add(panel6);
		contentPane.add(panel7);
		contentPane.add(panel8);
		
		panel8.setVisible(false);
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		new MultichoiceQuizApp();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==q1option1) {
			correctAns[0]=0;
		}
		if(e.getSource()==q1option2) {
			correctAns[0]=1;
		}
		if(e.getSource()==q1option3) {
			correctAns[0]=0;
		}
		if(e.getSource()==q1option4) {
			correctAns[0]=0;
		}
		if(e.getSource()==q2option1) {
			correctAns[1]=0;
		}
		if(e.getSource()==q2option2) {
			correctAns[1]=0;
		}
		if(e.getSource()==q2option3) {
			correctAns[1]=1;
		}
		if(e.getSource()==q2option4) {
			correctAns[1]=0;
		}
		if(e.getSource()==q3option1) {
			correctAns[2]=0;
		}
		if(e.getSource()==q3option2) {
			correctAns[2]=0;
		}
		if(e.getSource()==q3option3) {
			correctAns[2]=0;
		}
		if(e.getSource()==q3option4) {
			correctAns[2]=1;
		}
		if(e.getSource()==q4option1) {
			correctAns[3]=1;
		}
		if(e.getSource()==q4option2) {
			correctAns[3]=0;
		}
		if(e.getSource()==q4option3) {
			correctAns[3]=0;
		}
		if(e.getSource()==q4option4) {
			correctAns[3]=0;
		}
		if(e.getSource()==q5option1) {
			correctAns[4]=0;
		}
		if(e.getSource()==q5option2) {
			correctAns[4]=0;
		}
		if(e.getSource()==q5option3) {
			correctAns[4]=0;
		}
		if(e.getSource()==q5option4) {
			correctAns[4]=1;
		}
		
		if(e.getSource()==submit) {
			for(int i=0;i<5;i++) {
				score+=correctAns[i];
			}
			String result = String.valueOf(score);
			scoreCount = new JLabel("your score is "+result+" out of 5");
			panel8.add(scoreCount);
			if(score<3) {
				scoreCount.setForeground(Color.red);
			}else scoreCount.setForeground(Color.blue);
			panel8.setVisible(true);
		}
		
	}

}
