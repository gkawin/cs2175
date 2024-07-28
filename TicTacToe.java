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

class TicTacToePanel extends javax.swing.JFrame {

    public TicTacToePanel() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setLayout(new java.awt.GridLayout(4, 4));

        for (int i = 0; i < 9; i++) {
            javax.swing.JButton button = new javax.swing.JButton();
            button.setFont(new java.awt.Font("Arial", 1, 48));
            button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buttonActionPerformed(evt);
                }
            });
            add(button);
        }

        javax.swing.JLabel label = new javax.swing.JLabel();
        label.setFont(new java.awt.Font("Arial", 4, 16));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Player " + 1 + "'s Turn");
        add(label);

        javax.swing.JButton newGamebtn = new javax.swing.JButton();
        newGamebtn.setFont(new java.awt.Font("Arial", 1, 16));
        newGamebtn.setText("New Game");
        newGamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });
        add(newGamebtn);
    }

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {
        javax.swing.JButton button = (javax.swing.JButton) evt.getSource();
        if (button.getText().equals("")) {
            button.setText("1");
        } else if (button.getText().equals("1")) {
            button.setText("0");
        } else {
            button.setText("");
        }
    }

    private void newGameActionPerformed(java.awt.event.ActionEvent evt, javax.swing.JButton button) {
        // Clear all buttons.
    }

}