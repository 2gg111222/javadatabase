package project01;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit.BoldAction;

public class 공연UI {
		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setTitle("공연 순위");
			f.setSize(700, 800);
			FlowLayout flow = new FlowLayout();
			f.setLayout(flow);
			Font font = new Font("궁서체",1,40);
			
			
			JButton b1 = new JButton("일간");
			JButton b2 = new JButton("주간");
			
			JTable name = new JTable();
			JLabel l1 = new JLabel();
			JLabel l2 = new JLabel();
			
			String 제목 = null;
			공연DAO dao = new 공연DAO();
			공연VO bag = dao.출력(); //MemberVO
			
			
			l1.setText(bag.get제목());
			l2.setText(bag.get제목());
			
			
			
			
			b1.setFont(font);
			b2.setFont(font);
			l1.setFont(font);
			l2.setFont(font);
			
			
			
			f.add(b1);
			f.add(b2);
			f.add(l1);
			f.add(name);
			f.add(l2);
			f.setVisible(true);
		}
}

