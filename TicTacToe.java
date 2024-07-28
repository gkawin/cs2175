import java.awt.GraphicsEnvironment;

/**
 * TicTacToeSwing
 */
public class TicTacToe {

    public static void main(String[] args) {

        // Inside main method:
        System.out.println(GraphicsEnvironment.isHeadless());

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
        setSize(300, 300);
    }
}