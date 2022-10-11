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
//	�ǽ�! �� �ڵ�
	
	
	
	JLabel title=new JLabel("ȸ������");
	JLabel idLB= new JLabel("���̵�");
	JLabel nameLB=new JLabel("�̸�");
	JLabel passLB = new JLabel("��й�ȣ");
	JLabel telLB=new JLabel("��ȭ��ȣ");
//	���α׷� ����� ȭ�鿡 ���� �ؽ�Ʈ���� ��������
	
	JTextField idInput= new JTextField(10);
	JTextField nameInput= new JTextField(10);
	JTextField passInput= new JTextField(10);
	JTextField telInput= new JTextField(10);
//	�Է¹��� ���� �Է��ϴ� ������Ʈ
	
	JButton join=new JButton("����");
	JButton reset= new JButton("�ʱ�ȭ");
	JButton end=new JButton("����");
//	Ŭ���� �����ϴ� ������Ʈ
	
	JPanel Center =new JPanel();
	JPanel Center1 =new JPanel();
	JPanel Center2 =new JPanel();
	JPanel Center3 =new JPanel();
	JPanel Center4 =new JPanel();
//	�����ʵ忡 ���̵�, �̸�,��й�ȣ, ��ȭ��ȣ�� ��ġ
//	ū������ �г��� ���ͷ� �ΰ� �� �гξȿ� ���� ������ �г��� �ִ´�. 
	
	JPanel southP=new JPanel();
//	���ʿ� ��Ÿ�� ������Ʈ
	
	
	public Test2() {
		this.setBounds(100, 300, 300, 400);
// 		������ ����
		Center1.setBackground(Color.CYAN);
		Center2.setBackground(Color.CYAN);
		Center3.setBackground(Color.CYAN);
		Center4.setBackground(Color.CYAN);
		southP.setBackground(Color.CYAN);
		title.setBackground(Color.CYAN);
//		������
		this.add(title,"North");
		
		Center.setLayout(new GridLayout(4,1));
		Center1.setLayout(new FlowLayout());
		Center2.setLayout(new FlowLayout());
		Center3.setLayout(new FlowLayout());
		Center4.setLayout(new FlowLayout());
//		���ͺκ��� ���̾ƿ� ����
//		�� 4�ٷ� �����Ǿ���ϱ� ������ 4,1�� �����Ѵ�.
		Center.add(Center1);
		Center.add(Center2);
		Center.add(Center3);
		Center.add(Center4);
//		ū������ ���� �гο� ���������� ������Ʈ�� �ִ´�.
		
		Center1.add(idLB);
		Center1.add(idInput);
//		ù��° ���̵�� ���̵� �Է°� �ޱ�
		Center2.add(nameLB);
		Center2.add(nameInput);
//		�ι�° �̸��� �̸� �Է°� �ޱ�
		Center3.add(passLB);
		Center3.add(passInput);
//		����° ��й�ȣ�� ��й�ȣ �Է°� �ޱ�
		Center4.add(telLB);
		Center4.add(telInput);
//		�׹�° ��ȭ��ȣ�� ��ȭ��ȣ �Է°� �ޱ�
		
		southP.add(join);
		southP.add(reset);
		southP.add(end);
//		���ʿ� ��ġ�� �гο� join, reset, end ������Ʈ�� ����
		
		
		this.add(Center,"Center");
//		Center�� Center�г��� �Է�
		this.add(southP,"South");
//		South�� southP �г��� �Է�

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		â�� ������ ���α׷��� �ڵ����� ����
		join.addActionListener(this);
		reset.addActionListener(this);
		end.addActionListener(this);
//		join, reset, end ������Ʈ�� �̺�Ʈ(Ŭ�� ��) �� ó���ϰڴ�. 
//		this�� �����ϴ� ��ü�� �̸� ó�����ִ� �������̽��� �����޾Ҵ�.
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		Object temp=e.getSource();
//		������Ʈ�� �ִ� �ҽ����� e��� ������ ����
		if(temp.equals(join)) {
			title.setText("���̵�/�̸�/���/����");
//		join ��ưŬ���� title�� 	���̵�/�̸�/���/���� ���� �ٲ��.
		}else if(temp.equals(reset)){
			idInput.setText(null);
			nameInput.setText(null);
			passInput.setText(null);
			telInput.setText(null);
//		reset ��ưŬ���� ��� �ؽ�Ʈ�ʵ尡 null������ �ٲ��.(��������.)	
		}else if(temp.equals(end)) {
			System.out.println("���α׷� ����");
			System.exit(0);
//		end ��ưŬ���� ���ᰪ 0�� �����Ͽ� ���α׷��� ����ȴ�.
		}
		
	}
			
			
	
	
	
	
	
	
}
