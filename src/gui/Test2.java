package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test2 extends JFrame implements ActionListener{
	
	JLabel title=new JLabel("회원가입");
	JLabel idLB= new JLabel("아이디");
	JLabel nameLB=new JLabel("이름");
	JLabel passLB = new JLabel("비밀번호");
	JLabel telLB=new JLabel("전화번호");
	
	JTextField idInput= new JTextField(10);
	JTextField nameInput= new JTextField(10);
	JTextField passInput= new JTextField(10);
	JTextField telInput= new JTextField(10);
	
	JButton join=new JButton("가입");
	JButton reset= new JButton("초기화");
	JButton end=new JButton("종료");
	
	JPanel Center =new JPanel();
	JPanel Center1 =new JPanel();
	JPanel Center2 =new JPanel();
	JPanel Center3 =new JPanel();
	JPanel Center4 =new JPanel();
	
	JPanel southP=new JPanel();
	
	
	
	public Test2() {
		this.setBounds(100, 300, 300, 400);

		Center1.setBackground(Color.CYAN);
		Center2.setBackground(Color.CYAN);
		Center3.setBackground(Color.CYAN);
		Center4.setBackground(Color.CYAN);
		southP.setBackground(Color.CYAN);
		
		this.add(title,"North");
		
		Center.setLayout(new GridLayout(4,1));
		Center1.setLayout(new FlowLayout());
		Center2.setLayout(new FlowLayout());
		Center3.setLayout(new FlowLayout());
		Center4.setLayout(new FlowLayout());
		
		Center.add(Center1);
		Center.add(Center2);
		Center.add(Center3);
		Center.add(Center4);
		
		Center1.add(idLB);
		Center1.add(idInput);
		Center2.add(nameLB);
		Center2.add(nameInput);
		Center3.add(passLB);
		Center3.add(passInput);
		Center4.add(telLB);
		Center4.add(telInput);
		
		southP.add(join);
		southP.add(reset);
		southP.add(end);
		
		
		
		this.add(Center,"Center");
		
		this.add(southP,"South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		join.addActionListener(this);
		reset.addActionListener(this);
		end.addActionListener(this);
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		Object temp=e.getSource();
		if(temp.equals(join)) {
			title.setText("아이디/이름/비번/전번");
		}else if(temp.equals(reset)){
			idInput.setText(null);
			nameInput.setText(null);
			passInput.setText(null);
			telInput.setText(null);
		}else if(temp.equals(end)) {
			System.out.println("프로그램 종료");
			System.exit(0);
		}
		
	}
			
			
	
	
	
	
	
	
}
