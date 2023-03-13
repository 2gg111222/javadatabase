package 메뉴;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 메뉴 {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setTitle("메뉴");
		f.setSize(500, 500);

		FlowLayout flow = new FlowLayout();

		JButton button1 = new JButton("메인");
		JButton button2 = new JButton("랭킹");
		JButton button3 = new JButton("지역");
		JButton button4 = new JButton("예매");
		JButton button5 = new JButton("관리자 계정");

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// static 삭제 main() ()안에 부분 삭제
			
				f.setVisible(false);
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// static 삭제 main() ()안에 부분 삭제
			
				f.setVisible(false);
			}
		});

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// static 삭제 main() ()안에 부분 삭제
			
				f.setVisible(false);
			}
		});

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// static 삭제 main() ()안에 부분 삭제
			
				f.setVisible(false);
			}
		});

		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// static 삭제 main() ()안에 부분 삭제
			
				f.setVisible(false);
			}
		});

		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.add(button5);

		f.setLayout(flow);

		f.setVisible(true);
	}
}
