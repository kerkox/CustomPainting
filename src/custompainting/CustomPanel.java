package custompainting;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class CustomPanel extends JComponent {
    private int sunx=0;

    public CustomPanel() {
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                sunx += 10;
                repaint();
            }
            
            
        
        });
        
    }

    
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hola Mundo", 20, 20);

        g.setColor(Color.yellow);
        g.fillOval(sunx, 50, 60, 60);

        g.setColor(new Color(0, 255, 0));
//        g.fillRect(0, 250, 500, 50);
        g.fillRect(0, 250, this.getWidth(), 50);

        g.setColor(new Color(255, 204, 153));
        g.fillOval(200, 150, 20, 25);

        g.setColor(Color.black);
        g.drawOval(200, 150, 20, 25);

        g.drawLine(210, 175, 210, 220);
    }

}
