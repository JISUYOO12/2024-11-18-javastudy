package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //인터페이스
/*
 * ActionListenr : 버튼 / enter / Menu
 * 		=> actionPerformed 
 * MouseListener / MouseMotionListener
 * KeyListener 
 * 
 * 인터페이스 : 처리하는 기능이 여러개 있다
 * 			-------------------------
 * 			| 메소드는 선언 => 프로그램에 맞게 구현해서 사용
 * 			| 단점 => 선언된 메소드가 많은 경우
 * 					 ------------------
 * 					 | 선택적으로 사용할 수 없다
 * 					 | 메소드는 {} 구현완료
 * 			| 가급적이면 구현해서 전송
 * 				      ------- 선탹적으로 처리가 가능
 * 					  ------- default 
 * 					  -------  필요시에 해당 메소드만 오버라이딩 가능
 *					  ------- 선언된 메소드는 모든 구현을 해야한다
 *					  ------- 
 * 					 
 * 
 */

//public class 퍼즐게임 extends JFrame
//implements ActionListener;
//{
//	JButton[] btns=new JButton[9];
//	JLabel la=new JLabel("퍼즐게임",JLabel.CENTER);
//	JButton b1,b2;
//	int[] panCount=new int[9];
//	int cols=0,rows=0; // 빈칸
//	//초기화
//	public 퍼즐게임()
//	{
//		b1=new JButton("시작");
//		b2=new JButton("종료");
//		
//		JPanel p=new JPanel();
//		
//		JPanel pan=new JPanel();
//		pan.setLayout(new GridLayout(3,3,5,5));
//		for(int i=1;i<9;i++)
//		{
//			btns[i]=new JButton(String.valueOf(i+1));
//			btns[i].setFont(new Font("궁서체",Font.BOLD,45));
//			pan.add(btns[i]);
//			
//			
//		}
//		setLayout(null);
//		pan.setBounds(10, 15, 350, 350);
//		add(pan);
//		
//		p.add(b1)p;p.add(b2);
//		p.setBounds(getBounds());
//		setSize(380,470);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new 퍼즐게임();
//	}
//
//}
