package turtle;

import java.awt.Color;

public class Test{
	public static void main(String[] args) {
		TurtleFrame f = new TurtleFrame(700, 500);
		Turtle t = new Turtle(350, 100, 180+30);
		Turtle t2 = new Turtle(350,300,360-30);

		f.add(t);
		f.add(t2);
		t.setColor(Color.red);
		t2.setColor(Color.cyan);
		t.speed(5);
		t2.speed(5);
		
		for(int a = 0;a < 3;a++){
			for(int i=0;i<180;i++){
				t.fd(1);
				t2.fd(1);
			}
			if(a < 2)
			for(int i=0;i < 120;i++){
				t.rt(-1);
				t2.rt(1);
			}
		}
	}
}
