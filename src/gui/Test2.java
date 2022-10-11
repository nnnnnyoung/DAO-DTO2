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
//	실습! 내 코드
	
	
	
	JLabel title=new JLabel("회원가입");
	JLabel idLB= new JLabel("아이디");
	JLabel nameLB=new JLabel("이름");
	JLabel passLB = new JLabel("비밀번호");
	JLabel telLB=new JLabel("전화번호");
//	프로그램 실행시 화면에 나올 텍스트들을 저장해줌
	
	JTextField idInput= new JTextField(10);
	JTextField nameInput= new JTextField(10);
	JTextField passInput= new JTextField(10);
	JTextField telInput= new JTextField(10);
//	입력받을 값을 입력하는 컴포넌트
	
	JButton join=new JButton("가입");
	JButton reset= new JButton("초기화");
	JButton end=new JButton("종료");
//	클릭시 반응하는 컴포넌트
	
	JPanel Center =new JPanel();
	JPanel Center1 =new JPanel();
	JPanel Center2 =new JPanel();
	JPanel Center3 =new JPanel();
	JPanel Center4 =new JPanel();
//	센터필드에 아이디, 이름,비밀번호, 전화번호를 배치
//	큰범위의 패널을 센터로 두고 그 패널안에 작은 범위의 패널을 넣는다. 
	
	JPanel southP=new JPanel();
//	남쪽에 나타날 컴포넌트
	
	
	public Test2() {
		this.setBounds(100, 300, 300, 400);
// 		사이즈 지정
		Center1.setBackground(Color.CYAN);
		Center2.setBackground(Color.CYAN);
		Center3.setBackground(Color.CYAN);
		Center4.setBackground(Color.CYAN);
		southP.setBackground(Color.CYAN);
		title.setBackground(Color.CYAN);
//		색지정
		this.add(title,"North");
		
		Center.setLayout(new GridLayout(4,1));
		Center1.setLayout(new FlowLayout());
		Center2.setLayout(new FlowLayout());
		Center3.setLayout(new FlowLayout());
		Center4.setLayout(new FlowLayout());
//		센터부분의 레이아웃 지정
//		총 4줄로 구성되어야하기 때문에 4,1로 설정한다.
		Center.add(Center1);
		Center.add(Center2);
		Center.add(Center3);
		Center.add(Center4);
//		큰범위의 센터 패널에 작은범위의 컴포넌트를 넣는다.
		
		Center1.add(idLB);
		Center1.add(idInput);
//		첫번째 아이디와 아이디 입력값 받기
		Center2.add(nameLB);
		Center2.add(nameInput);
//		두번째 이름과 이름 입력값 받기
		Center3.add(passLB);
		Center3.add(passInput);
//		세번째 비밀번호와 비밀번호 입력값 받기
		Center4.add(telLB);
		Center4.add(telInput);
//		네번째 전화번호와 전화번호 입력값 받기
		
		southP.add(join);
		southP.add(reset);
		southP.add(end);
//		남쪽에 배치될 패널에 join, reset, end 컴포넌트를 넣음
		
		
		this.add(Center,"Center");
//		Center에 Center패널을 입력
		this.add(southP,"South");
//		South에 southP 패널을 입력

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//		창을 닫으면 프로그램도 자동으로 종료
		join.addActionListener(this);
		reset.addActionListener(this);
		end.addActionListener(this);
//		join, reset, end 컴포넌트의 이벤트(클릭 등) 을 처리하겠다. 
//		this가 참조하는 객체가 이를 처리해주는 인터페이스를 구현받았다.
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {

		Object temp=e.getSource();
//		오브젝트에 있는 소스들을 e라는 변수에 저장
		if(temp.equals(join)) {
			title.setText("아이디/이름/비번/전번");
//		join 버튼클릭시 title이 	아이디/이름/비번/전번 으로 바뀐다.
		}else if(temp.equals(reset)){
			idInput.setText(null);
			nameInput.setText(null);
			passInput.setText(null);
			telInput.setText(null);
//		reset 버튼클릭시 모든 텍스트필드가 null값으로 바뀐다.(지워진다.)	
		}else if(temp.equals(end)) {
			System.out.println("프로그램 종료");
			System.exit(0);
//		end 버튼클릭시 종료값 0에 도달하여 프로그램이 종료된다.
		}
		
	}
			
			
	
	
	
	
	
	
}
