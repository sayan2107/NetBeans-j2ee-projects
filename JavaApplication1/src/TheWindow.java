import java.awt.*;
import javafx.beans.value.ChangeListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;




public class TheWindow extends JFrame{

    private JSlider slider;
    private drawoval myPanel;
    
    public TheWindow(){
    
        super("The title");
        myPanel = new drawoval();
        myPanel.setBackground(Color.red);
        
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        
        
    slider.addChangeListener(
             new ChangeListener(){
               public void stateChanged(ChangeEvent e){
                  myPanel.setD(slider.getValue());
               }
             }
    );
        

        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
