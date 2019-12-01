
import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame 
{	
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x = 100;
	double y = 100;
	
	double dgree = 3.14 / 3; //弧度: 此处为60度
	//画窗口的方法
	public void paint(Graphics g)
	{
		System.out.println("The window been painted once");
		g.drawImage(table, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		x = x + 10 * Math.cos(dgree);
		y = y + 10 * Math.sin(dgree);
	}
	//窗口加载
	void lauchFrame()
	{
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);//让窗口可见
		
		//重画窗口
		while(true)
		{
			repaint();
			try
			{
				Thread.sleep(40);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[]args)
	{
		BallGame2 game = new BallGame2();
		game.lauchFrame();
		
	}
}

