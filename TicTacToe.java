import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {
    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 400));
        setLayout(new BorderLayout());

        TicTacToePanel ticTacToePanel = new TicTacToePanel();
        add(ticTacToePanel, BorderLayout.CENTER);
        add(new JPanel() {
            {
                setLayout(new FlowLayout());
                add(new ResetButton(ticTacToePanel));
            }
        }, BorderLayout.SOUTH);
        setSize(getPreferredSize());
        setVisible(true);
    }
}

class ResetButton extends JButton implements ActionListener {
    private TicTacToePanel ticTacToePanel;

    public ResetButton(TicTacToePanel ticTacToePanel) {
        this.ticTacToePanel = ticTacToePanel;
        setText("Reset");
        setFont(new Font("Arial", 1, 24));
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < ticTacToePanel.buttons.length; i++) {
            for (int j = 0; j < ticTacToePanel.buttons[i].length; j++) {
                ticTacToePanel.buttons[i][j].setText("");
                ticTacToePanel.label.setText("Player 1's turn");
            }
        }
        ticTacToePanel.currentPlayer = 1;
    }
}

class TicTacToePanel extends JPanel implements ActionListener {
    int row = 3;
    int col = 3;
    int currentPlayer = 1;

    JButton[][] buttons = new JButton[row][col];
    JLabel label = new JLabel("Player 1's turn", SwingConstants.CENTER);
    JPanel gamePanel = new JPanel();

    public TicTacToePanel() {
        gamePanel();
        gameLabel();

        GridBagConstraints c = new GridBagConstraints();
        setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(gamePanel, c);

        c.weighty = 0.1;
        c.gridy = 1;
        add(label, c);
    }

    private void gamePanel() {
        gamePanel.setLayout(new GridLayout(row, col));
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setFont(new Font("Arial", 1, 24));
                buttons[i][j].addActionListener(this);
                gamePanel.add(buttons[i][j]);
            }
        }
    }

    private void gameLabel() {
        label.setFont(new Font("Arial", 1, 24));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("")) {
            if (currentPlayer == 1) {
                button.setText("1");
                label.setText("Player 0's turn");
                currentPlayer = 0;
            } else {
                button.setText("0");
                label.setText("Player 1's turn");
                currentPlayer = 1;
            }
        }

        // Check winner after each click to avoid unnecessary clicks after a player wins
        // the game.
        int winner = CheckWinner.checkWinner(buttons);
        if (winner == 1) {
            new WinnerDialog("Player 1 wins");
        } else if (winner == 0) {
            new WinnerDialog("Player 0 wins");
        }
    }
}

class WinnerDialog extends JDialog implements ActionListener {
    public WinnerDialog(String message) {
        setTitle("Winner");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(200, 200));
        setLayout(new BorderLayout());

        JLabel label = new JLabel(message);
        label.setFont(new Font("Arial", 1, 24));
        add(label, BorderLayout.CENTER);

        JButton button = new JButton("OK");
        button.setFont(new Font("Arial", 1, 24));
        button.addActionListener(this);
        add(button, BorderLayout.SOUTH);

        setSize(getPreferredSize());
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}

class CheckWinner {
    public static int checkWinner(JButton[][] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText())
                    && buttons[i][1].getText().equals(buttons[i][2].getText())) {
                if (buttons[i][0].getText().equals("1")) {
                    return 1;
                } else if (buttons[i][0].getText().equals("0")) {
                    return 0;
                }
            }
        }

        for (int i = 0; i < buttons.length; i++) {
            if (buttons[0][i].getText().equals(buttons[1][i].getText())
                    && buttons[1][i].getText().equals(buttons[2][i].getText())) {
                if (buttons[0][i].getText().equals("1")) {
                    return 1;
                } else if (buttons[0][i].getText().equals("0")) {
                    return 0;
                }
            }
        }

        if (buttons[0][0].getText().equals(buttons[1][1].getText())
                && buttons[1][1].getText().equals(buttons[2][2].getText())) {
            if (buttons[0][0].getText().equals("1")) {
                return 1;
            } else if (buttons[0][0].getText().equals("0")) {
                return 0;
            }
        }

        if (buttons[0][2].getText().equals(buttons[1][1].getText())
                && buttons[1][1].getText().equals(buttons[2][0].getText())) {
            if (buttons[0][2].getText().equals("1")) {
                return 1;
            } else if (buttons[0][2].getText().equals("0")) {
                return 0;
            }
        }

        return -1;
    }
}
