
    package view;

    import controller.*;
   
    import javax.swing.JFrame;
    
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
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(new ConnectionPanel());
        
//        this.getContentPane().add(new ConnectionPanel());
//            rootPane.setBounds(0, 0, 500, 500);
pack();
            //rootPane.setForeground(Color.BLACK);
            this.setBounds(0, 0, 500, 500);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
           
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
