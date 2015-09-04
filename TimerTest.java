package project;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTest extends JFrame {
	
	private Timer timer;
	public int count = 0;
	
	public TimerTest(){
		timer = new Timer(1000, new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			count++;
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer2 = new Timer(1000, new TimerListener());
		
	}

}
