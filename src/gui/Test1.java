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

public class Test1 extends JFrame implements ActionListener{
	
	JLabel titleLB=new JLabel("�޸����α׷�");

	
	JButton btn= new JButton ("Login");
	JButton close= new JButton ("Exit");
//	JButton Ŭ���� ������ ���̾ƿ�
	
	JLabel idLB=new JLabel("���̵�");
	JLabel passLB=new JLabel("��  ��");
//	JLabel ���� ���س��� �ؽ�Ʈ�� ��µǾ��ִ� ���̾ƿ�
	
	JTextField idInput=new JTextField(10);
	JTextField pwdInput=new JTextField(10);
//	JTextField �ؽ�Ʈ �Է¹޴� ���̾ƿ�
//	JTextArea inputBody=new JTextArea(3,10);
	
	JPanel centerP=new JPanel();
	JPanel centerPN=new JPanel();
	JPanel centerPS=new JPanel();
//	���ͺκп� ���̵�/ ���̵� �Է�/ ���/ ����Է�â �� 4���� �������� �г��� ����
	JPanel southP=new JPanel();
	
	public Test1() {
		System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
		this.setBounds(100, 300, 200, 200);// ������ ����
		
//		inputBody.setBackground(Color.yellow);
//		btn.setBackground(Color.red);
		
		centerP.setBackground(Color.cyan);
		centerPN.setBackground(Color.GREEN);
		centerPS.setBackground(Color.magenta);
		
		centerP.setLayout(new GridLayout(2,1));
//		�׸��� ���̾ƿ����� ��ȯ �� ���ʿ� PS, ���ʿ� PN�� �ֱ� ���� 2,1�� ������.
		centerPN.setLayout(new FlowLayout());
//		Flow ���̾ƿ����� ��ȯ
		centerPS.setLayout(new FlowLayout());
//		Flow ���̾ƿ����� ��ȯ
		
		centerPN.add(idLB);
		centerPN.add(idInput);
		centerPS.add(passLB);
		centerPS.add(pwdInput);
		centerP.add(centerPN);
		centerP.add(centerPS);
		southP.add(btn);
		southP.add(close);
		btn.addActionListener(this);
//		btn ������Ʈ�� �̺�Ʈ(Ŭ�� ��) �� ó���ϰڴ�. this�� �����ϴ� ��ü�� �̸� ó�����ִ� �������̽��� �����޾Ҵ�.
		close.addActionListener(this);
//		this�� ������Ʈ�� ��ġ��Ų��... �⺻�� �������̾ƿ�
		
		
		
		
		//this�� ������Ʈ�� ��ġ��Ų��... �⺻�� ���� ���̾ƿ�
		this.add(titleLB,"North");
//		this.add(btn,"East");
//		this.add(mainLB,"West");
		this.add(southP,"South");
		this.add(centerP,"Center");
		
		
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("�̺�Ʈ ó��");
	Object temp= e.getSource();
	if(temp.equals(btn)) {
		System.out.println("��ư Ŭ��");
		String id=idInput.getText();
		titleLB.setText(id);
	}else if(temp.equals(close)) {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
	

	
}
	
	
}
