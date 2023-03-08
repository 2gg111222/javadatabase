package 화면db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BBSUI2 {

	public  void c() {
		JFrame f = new JFrame();
		f.setTitle("나의 게시판 화면");
		f.setSize(700, 500);
		
		JLabel l1 = new JLabel("<<<< 나의 게시판 >>>>");
		JLabel l2 = new JLabel("게시판 ID");
		JLabel l3 = new JLabel("게시판 제 목");
		JLabel l4 = new JLabel("게시판 내 용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("게시물 작성 완료");
		JButton b2 = new JButton("게시물 삭제 완료");
		JButton b3 = new JButton("게시물 수정 완료");
		JButton b4 = new JButton("게시물 검색 완료");
		
	
	
		
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요 
		Font font = new Font("궁서", Font.BOLD, 40);
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.RED);
		
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.RED);
		
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.RED);
		
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.RED);
		
		b1.setBackground(Color.PINK); //배경색
		b1.setForeground(Color.RED);	//글자색
		b2.setBackground(Color.PINK); 
		b2.setForeground(Color.RED);	
		b3.setBackground(Color.PINK); 
		b3.setForeground(Color.RED);	
		b4.setBackground(Color.PINK); 
		b4.setForeground(Color.RED);	
	
		
		f.getContentPane().setBackground(Color.green);
		
		//맨 끝으로~~~~~
		f.setVisible(true);

	}

	

	

}