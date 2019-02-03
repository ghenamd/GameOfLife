import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridButton extends JButton implements ActionListener {

    public GridButton() {
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        Color color = button.getBackground();
        if (color == Color.WHITE){
            setBackground(Color.BLACK);
        } else if (color == Color.BLACK){
            setBackground(Color.WHITE);
        }
    }
}
