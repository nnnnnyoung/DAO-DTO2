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
	
	JLabel title=new JLabel("ȸ������");
	JLabel idLB= new JLabel("���̵�");
	JLabel nameLB=new JLabel("�̸�");
	JLabel passLB = new JLabel("��й�ȣ");
	JLabel telLB=new JLabel("��ȭ��ȣ");
	
	JTextField idInput= new JTextField(10);
	JTextField nameInput= new JTextField(10);
	JTextField passInput= new JTextField(10);
	JTextField telInput= new JTextField(10);
	
	JButton join=new JButton("����");
	JButton reset= new JButton("�ʱ�ȭ");
	JButton end=new JButton("����");
	
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
			title.setText("���̵�/�̸�/���/����");
		}else if(temp.equals(reset)){
			idInput.setText(null);
			nameInput.setText(null);
			passInput.setText(null);
			telInput.setText(null);
		}else if(temp.equals(end)) {
			System.out.println("���α׷� ����");
			System.exit(0);
		}
		
	}
			
			
	
	
	
	
	
	
}
