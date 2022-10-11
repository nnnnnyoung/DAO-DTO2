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
	
	JLabel titleLB=new JLabel("휴먼프로그램");

	
	JButton btn= new JButton ("Login");
	JButton close= new JButton ("Exit");
//	JButton 클릭이 가능한 레이아웃
	
	JLabel idLB=new JLabel("아이디");
	JLabel passLB=new JLabel("비  번");
//	JLabel 내가 정해놓은 텍스트가 출력되어있는 레이아웃
	
	JTextField idInput=new JTextField(10);
	JTextField pwdInput=new JTextField(10);
//	JTextField 텍스트 입력받는 레이아웃
//	JTextArea inputBody=new JTextArea(3,10);
	
	JPanel centerP=new JPanel();
	JPanel centerPN=new JPanel();
	JPanel centerPS=new JPanel();
//	센터부분에 아이디/ 아이디 입력/ 비번/ 비번입력창 총 4개가 나오도록 패널을 만듦
	JPanel southP=new JPanel();
	
	public Test1() {
		System.out.println("프로그램이 시작되었습니다.");
		this.setBounds(100, 300, 200, 200);// 사이즈 설정
		
//		inputBody.setBackground(Color.yellow);
//		btn.setBackground(Color.red);
		
		centerP.setBackground(Color.cyan);
		centerPN.setBackground(Color.GREEN);
		centerPS.setBackground(Color.magenta);
		
		centerP.setLayout(new GridLayout(2,1));
//		그리드 레이아웃으로 변환 후 남쪽에 PS, 북쪽에 PN을 넣기 위해 2,1로 나눈다.
		centerPN.setLayout(new FlowLayout());
//		Flow 레이아웃으로 변환
		centerPS.setLayout(new FlowLayout());
//		Flow 레이아웃으로 변환
		
		centerPN.add(idLB);
		centerPN.add(idInput);
		centerPS.add(passLB);
		centerPS.add(pwdInput);
		centerP.add(centerPN);
		centerP.add(centerPS);
		southP.add(btn);
		southP.add(close);
		btn.addActionListener(this);
//		btn 컴포넌트의 이벤트(클릭 등) 을 처리하겠다. this가 참조하는 객체가 이를 처리해주는 인터페이스를 구현받았다.
		close.addActionListener(this);
//		this에 컴포넌트를 배치시킨다... 기본은 보더레이아웃
		
		
		
		
		//this에 컴포넌트를 배치시킨다... 기본은 보더 레이아웃
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
	System.out.println("이벤트 처리");
	Object temp= e.getSource();
	if(temp.equals(btn)) {
		System.out.println("버튼 클릭");
		String id=idInput.getText();
		titleLB.setText(id);
	}else if(temp.equals(close)) {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	

	
}
	
	
}
