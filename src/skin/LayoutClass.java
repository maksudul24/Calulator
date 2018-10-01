package skin;
import javax.swing.*;

public class LayoutClass {
	JLabel jlab;
	LayoutClass() {
		JFrame jr=new JFrame("Calculator");
		jr.setSize(418,645);
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b_plus = new JButton("+");
		JButton	b_minus = new JButton("-");
		JButton b_divide = new JButton("/");
		JButton b_multi = new JButton("*");
		JButton b_persent = new JButton("%");
		JButton b_one = new JButton("1");
		JButton b_two = new JButton("2");
		JButton b_three = new JButton("3");
		JButton b_four = new JButton("4");
		JButton b_five = new JButton("5");
		JButton b_six = new JButton("6");
		JButton b_seven = new JButton("7");
		JButton b_eight = new JButton("8");
		JButton b_nine = new JButton("9");
		JButton b_clear = new JButton("CLEAR");
		JButton b_ans = new JButton("=");
		JButton b_zero= new JButton("0");
		JButton b_point= new JButton(".");
		JButton b_root= new JButton("Root");
		JButton b_history= new JButton("History");
		
		b_plus.setBounds(300,400,100,100);
		b_three.setBounds(200,400,100,100);
		b_two.setBounds(100,400,100,100);
		b_one.setBounds(0,400,100,100);
		
		b_minus.setBounds(300,300,100,100);
		b_six.setBounds(200,300,100,100);
		b_five.setBounds(100,300,100,100);
		b_four.setBounds(0,300,100,100);
		
		b_ans.setBounds(300,500,100,100);
		b_point.setBounds(200,500,100,100);
		b_zero.setBounds(100,500,100,100);
		b_history.setBounds(0,500,100,100);
		
		b_multi.setBounds(300,200,100,100);
		b_nine.setBounds(200,200,100,100);
		b_eight.setBounds(100,200,100,100);
		b_seven.setBounds(0,200,100,100);
		
		b_divide.setBounds(300,100,100,100);
		b_persent.setBounds(200,100,100,100);
		b_root.setBounds(100,100,100,100);
		b_clear.setBounds(0,100,100,100);
		
		jr.add(b_plus);
		jr.add(b_minus);
		jr.add(b_divide);
		jr.add(b_multi);
		jr.add(b_persent);
		jr.add(b_one);
		jr.add(b_two);
		jr.add(b_three);
		jr.add(b_four);
		jr.add(b_five);
		jr.add(b_six);
		jr.add(b_eight);
		jr.add(b_nine);
		jr.add(b_clear);
		jr.add(b_ans);
		jr.add(b_root);
		jr.add(b_point);
		jr.add(b_zero);
		jr.add(b_seven);
		jr.add(b_history);
		
		jlab =new JLabel();
		jr.add(jlab);
		jr.setVisible(true);
	
	}
}
