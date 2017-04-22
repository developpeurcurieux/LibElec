
    package view;

    import controller.*;
    import java.awt.Color;

    import java.awt.Font;
    import java.awt.Dimension;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JPasswordField;
    import javax.swing.JTextField;
    import javax.swing.SwingConstants;
    import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;
    import javax.swing.WindowConstants;




    public class RootFrame extends JFrame {

        private Controller controller;
        //
       private ConnectionPanel connectionPanel;


        public RootFrame() {
            initGuiLAF();
            initFrame();
            

        }

        public void initFrame() {
            connectionPanel = new ConnectionPanel();
            this.getContentPane().add(connectionPanel);
//            rootPane.setBounds(0, 0, 500, 500);

            //rootPane.setForeground(Color.BLACK);
            this.setBounds(0, 0, 500, 500);
            this.setLocationRelativeTo(null);
        }                        


        public void initGuiLAF() {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        public void setController(Controller controller) {
            this.controller = controller;
        }




    }
