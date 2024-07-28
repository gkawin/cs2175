import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;

/**
 * TicTacToeSwing
 */
public class TicTacToe {
    public static void main(String[] args) {
        // Create GUI Panel.
        TicTacToePanel panel = new TicTacToePanel();
        panel.setVisible(true);
    }
}

class TicTacToePanel extends JFrame {

    public TicTacToePanel() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 9; i++) {
            JButton button = new JButton();
            button.setFont(new Font("Arial", 1, 48));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    buttonActionPerformed(evt);
                }
            });
            add(button);
        }

        JLabel label = new JLabel();
        label.setFont(new Font("Arial", 4, 16));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("Player " + 1 + "'s Turn");
        add(label);

        JButton newGamebtn = new JButton();
        newGamebtn.setFont(new Font("Arial", 1, 16));
        newGamebtn.setText("New Game");
        newGamebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        add(newGamebtn);
    }

    private void buttonActionPerformed(ActionEvent evt) {
        JButton button = (JButton) evt.getSource();
        if (button.getText().equals("")) {
            button.setText("1");
        } else if (button.getText().equals("1")) {
            button.setText("0");
        } else {
            button.setText("");
        }
    }

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < 9; i++) {
            JButton button = (JButton) getContentPane().getComponent(i);
            button.setText("");
        }
    }

}