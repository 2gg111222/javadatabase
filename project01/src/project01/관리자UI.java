package project01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class 관리자UI {
	
	public  void 관리자UI() {
		JFrame f = new JFrame();
		f.setTitle("관리자 화면");
		f.setSize(500, 800);

		JLabel l1 = new JLabel("<<<< 관리자 화면 >>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		
		

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		

		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");
		JButton b5 = new JButton("공연 관리자 화면");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("회원가입처리");
				String id = t1.getText();
				String pw = t2.getText();
				
				
				if(id.equals("")) { //기본형 4가지만 == 로 값을 비교 가능! 
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				관리자DAO dao = new 관리자DAO();
				
				//1. 가방을 만들어주세요
				관리자VO bag = new 관리자VO();
				//2. 가방에 값들을 넣어주세요.
				bag.setId(id);
				bag.setPw(pw);
				
				
				//3. 값들이 들어있는 가방을 전달하자.
				int result = dao.insert(bag);//1 or 0
				
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "관리자가입 성공");
				}else {
					JOptionPane.showMessageDialog(f, "관리자가입 실패, 재입력해주세요.");
				}
			}// action 닫는 곳
		});// b1닫는 곳

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("관리자탈퇴처리");
				String id = t1.getText();
				String pw = t2.getText();
			
				
				
				관리자DAO dao = new 관리자DAO();
				관리자VO bag = new 관리자VO();
				bag.setId(id);
				bag.setPw(pw);
				
				int result = dao.delete(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "관리자탈퇴 성공");
				}else {
					JOptionPane.showMessageDialog(f, "관리자탈퇴 실패, 재입력해주세요.");
				}
			}// action 닫는 곳
		}); //b2

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("관리자정보 수정 처리");
				String id = t1.getText();
				String pw = t2.getText();

				관리자DAO dao = new 관리자DAO();
				
				//1.가방을 만들자.
				
				관리자VO bag = new 관리자VO();
				
				//2.가방에 값을 넣자.
				
				bag.setId(id);
				bag.setPw(pw);
				
				//3.가방을 전달하자
				int result = dao.update(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "관리자정보 수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "관리자정보 수정 실패, 재입력해주세요.");
				}
			}// action 닫는 곳
		});
		
		
		//검색기능
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("관리자검색처리");
				String id = t1.getText();
				
				관리자DAO dao = new 관리자DAO();
				관리자VO bag = dao.one(id); //MemberVO
				if(bag != null) {
				t2.setText(bag.getPw());
			
				t2.setBackground(Color.pink);
				}else {
					JOptionPane.showMessageDialog(f, "검색결과 없음");
					t2.setText("");
					
				}
				
			}// action 닫는 곳
		}); //b2
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				공연관리자UI 공연관리자UI = new 공연관리자UI();
				공연관리자UI.공연관리자UI();
				f.setVisible(false);
				
			}
		});
		
		

		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);

		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		
		
		
		
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
	

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		
		
		t1.setFont(font);
		t2.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);

		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);

	

		b1.setBackground(Color.PINK); // 배경색
		b1.setForeground(Color.RED); // 글자색
		b2.setBackground(Color.PINK);
		b2.setForeground(Color.RED);
		b3.setBackground(Color.PINK);
		b3.setForeground(Color.RED);
		b4.setBackground(Color.PINK);
		b4.setForeground(Color.blue);

		f.getContentPane().setBackground(Color.green);

		// 맨 끝으로~~~~~
		f.setVisible(true);

	}

}