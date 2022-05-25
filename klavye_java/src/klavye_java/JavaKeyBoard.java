package klavye_java;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


// !!! calistirmak icin LUTFEN YORUM SATIRLARINI KALDIRINIZ !!!
public class JavaKeyBoard extends JFrame implements KeyListener {
	private String yazi;
	
	//constructor
	public JavaKeyBoard() {
		super();
		addKeyListener(this);
		yazi = "Java-JFrame Example of Keyboard ";
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString(yazi, 50, 50);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// istedigimiz karakterleri basip ekranda goruntuleyebiliriz.
		/*
		yazi += e.getKeyChar();
		repaint();
		*/	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		//sonuc console'da gorunur. Bastigimiz karakterin code karsiligini buluruz.
		/*
		System.out.println("KeyCode: " + e.getKeyCode() + "VK_A: " + e.VK_A);
		if(e.getKeyCode() == e.VK_BACK_SPACE) {
			yazi = yazi.substring(0, yazi.length() - 1);
		}
		else {
			yazi += e.getKeyChar();
		}
		yazi += e.getKeyChar();
		*/
		
		//karakter eklememizi hem de silmemizi saglar
		if(e.getKeyCode() == e.VK_BACK_SPACE && yazi.length() > 0) {
			yazi = yazi.substring(0, yazi.length() - 1);
		}
		else {
			yazi += e.getKeyChar();
		}
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
}

/*
 	KeyEvent :
	Sanal tus kodlari, bir veya daha fazla tus vurusunun (shift ve "a" dan gelen "A" 
	gibi) birlesimiyle olusturulan bir karakter yerine, hangi klavye tusuna basildigini 
	bildirmek icin kullanilir.
	
 */
