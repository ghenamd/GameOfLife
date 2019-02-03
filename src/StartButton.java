import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;


public class StartButton extends JButton implements ActionListener {

    private Timer timer = new Timer();
    private boolean isRunning;

    public StartButton() {
        setText("Start");
        setPreferredSize(new Dimension(80, 35));
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        GameLogic gameLogic = new GameLogic(Utils.grid);
        if (!isRunning){
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                 isRunning =true;
                       jButton.setText("Stop");
                    gameLogic.changeGridState();

                }
            }, 0, 200);

        }
        if (isRunning){
            timer.cancel();
            timer.purge();
            jButton.setText("Finished");
        }
    }
}
