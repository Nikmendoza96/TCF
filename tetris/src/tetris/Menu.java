package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Menu extends GameState {
	
	private String[] options = {"Comincia a giocare", "Credits", "Esci dal gioco"};
	private int currentSelection = 0;

	public Menu(GameStateManager gsm) {
	
		super(gsm);
	}
	
	public void init() {
	}
	
	public void tick() {
	}
	
	public void draw(Graphics g) {
		
		g.setColor(new Color(50,50,200));
		g.fillRect(0, 0, GamePanel.WIDTH2, GamePanel.HEIGHT2);
		
		for(int i=0; i<options.length; i++) {
			if(i==currentSelection) {
				g.setColor(Color.GREEN);
			} else {
				g.setColor(Color.BLACK);
			}
			
			//g.drawLine(GamePanel.WIDTH /2, y1, x2, y2);
			g.setFont(new Font("Arial", Font.PLAIN, 10));
			g.drawString(options[i], GamePanel.WIDTH2 /2 - 50, 50+i*30);
			
		}
	}
	
	
	public void keyPressed(int k) {
		if(k == KeyEvent.VK_DOWN) {
			currentSelection++;
		if(currentSelection >= options.length) {
			currentSelection = 0;
		}
	} else if(k == KeyEvent.VK_UP) {
		currentSelection --;
		if(currentSelection <0) {
			currentSelection = options.length -1;
		}
		}
		
		if(k == KeyEvent.VK_ENTER) {
			if(currentSelection == 0) {
				Game Game = new Game();
			} else if(currentSelection == 1 ) {
				PopUp(options);
			} else if (currentSelection == 2) {
				System.exit(0);
			}
		}
		
	}

	
	//Pop up credits
	public static void PopUp(String[] x) {
		System.out.print("Gioco creato per l'esame Tecniche di Calcolo per la fisica. Autori: Da Nicolò Mendoza e Michael Maguire.");
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}
}
