
package WindowArray5;

import java.awt.Graphics;
import javax.swing.JPanel;

class DrawCanvas8 extends JPanel{
    String[][] moji;
	int r_tama;
	int c_tama;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50,100,100,50);  //四角形
        g.drawLine(100,100,200,300);  //線
        g.drawLine(400,200,200,300);  //線
		g.drawString("あいうえお", 150, 150);
		g.drawString(moji[0][0], 150, 200);
		g.drawString(moji[1][0], 160, 200);
		g.drawString(moji[2][0], 170, 200);
		g.drawString(moji[3][0], 180, 200);
		g.drawString(moji[0][1], 150, 210);
		g.drawString(moji[1][1], 160, 210);
		g.drawString(moji[2][1], 170, 210);
		g.drawString(moji[3][1], 180, 210);
		g.drawString(moji[0][2], 150, 220);
		g.drawString(moji[1][2], 160, 220);
		g.drawString(moji[2][2], 170, 220);
		g.drawString(moji[3][2], 180, 220);
	}

	public void repaintComponent(Graphics g) {
		super.repaintComponent(g);
		g.drawRect(50,100,100,50);  //四角形
        g.drawLine(100,100,200,300);  //線
        g.drawLine(400,200,200,300);  //線
		g.drawString("あいうえお", 150, 150);
		g.drawString(moji[0][0], 150, 200);
		g.drawString(moji[1][0], 160, 200);
		g.drawString(moji[2][0], 170, 200);
		g.drawString(moji[3][0], 180, 200);
		g.drawString(moji[0][1], 150, 210);
		g.drawString(moji[1][1], 160, 210);
		g.drawString(moji[2][1], 170, 210);
		g.drawString(moji[3][1], 180, 210);
		g.drawString(moji[0][2], 150, 220);
		g.drawString(moji[1][2], 160, 220);
		g.drawString(moji[2][2], 170, 220);
		g.drawString(moji[3][2], 180, 220);
	}

	void utusi() {
		for (int i=0; i<r_tama; i++){
        	for (int j=0; j<c_tama; j++){
            	System.out.print(moji[i][j]);  //retを出力
            }
          	System.out.println();
        }
	}
}