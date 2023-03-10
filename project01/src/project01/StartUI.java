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

import 자바db연결.MEMBERDAO2;
import 자바db연결.MEMBERDAO3;

public class StartUI {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");

		관리자DAO dao = new 관리자DAO();
		
		관리자VO bag = new 관리자VO();
		
		bag.setId(id);
		bag.setPw(pw);
		
		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			관리자UI 관리자 = new 관리자UI();
			관리자.관리자UI();
		} else {
			JOptionPane.showMessageDialog(null, "허락되지 않은 접근");

		}
		
		
	}

}