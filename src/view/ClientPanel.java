
    package view;


    import java.awt.BorderLayout;
    import java.awt.Dimension;
    import java.awt.Font;
    import java.awt.GridLayout;
    //
    import javax.swing.ButtonGroup;
    import javax.swing.JButton;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.JRadioButton;
    import javax.swing.JScrollPane;
    import javax.swing.JTable;
    import javax.swing.JTextField;
    import javax.swing.SwingConstants;
    import javax.swing.table.DefaultTableModel;
    //
    import controller.ClientController;
    

    public class ClientPanel extends JPanel {


        private JPanel bottom;
        private ButtonGroup buttonGroup1;
        private ButtonGroup buttonGroup2;
        private JPanel center;
        private JButton jButton1;
        private JLabel jLabel1;
        private JRadioButton jRadioButton1;
        private JRadioButton jRadioButton2;
        private JRadioButton jRadioButton3;
        private JScrollPane jScrollPane1;
        private JTable jTable1;
        private JTextField jTextField1;
        private JTextField jTextField2;
        private JTextField jTextField3;
        private JPanel left;
        private JPanel right;
        private JPanel top;
        //
        private ClientController clientController;
        
        public ClientPanel() {
            initComponents();
        }

        private void initComponents() {

            buttonGroup1 = new ButtonGroup();
            buttonGroup2 = new ButtonGroup();
            bottom = new JPanel();
            jRadioButton1 = new JRadioButton();
            jRadioButton2 = new JRadioButton();
            jRadioButton3 = new JRadioButton();
            jTextField1 = new JTextField();
            jTextField2 = new JTextField();
            jTextField3 = new JTextField();
            jButton1 = new JButton();
            left = new JPanel();
            right = new JPanel();
            top = new JPanel();
            jLabel1 = new JLabel();
            center = new JPanel();
            jScrollPane1 = new JScrollPane();
            jTable1 = new JTable();

            setPreferredSize(new Dimension(827, 600));
            setLayout(new BorderLayout());

            bottom.setPreferredSize(new Dimension(700, 140));
            bottom.setLayout(null);

            jRadioButton1.setText("Id Client");
            bottom.add(jRadioButton1);
            jRadioButton1.setBounds(80, 20, 100, 28);

            jRadioButton2.setText("Prenom");
            bottom.add(jRadioButton2);
            jRadioButton2.setBounds(380, 60, 100, 28);

            jRadioButton3.setText("Nom");

            bottom.add(jRadioButton3);
            jRadioButton3.setBounds(80, 60, 63, 28);
            bottom.add(jTextField1);
            jTextField1.setBounds(490, 60, 150, 30);
            bottom.add(jTextField2);
            jTextField2.setBounds(190, 60, 150, 30);


            bottom.add(jTextField3);
            jTextField3.setBounds(190, 20, 150, 30);

            jButton1.setText("chercher");

            bottom.add(jButton1);
            jButton1.setBounds(680, 80, 110, 40);

            add(bottom, BorderLayout.PAGE_END);

            left.setPreferredSize(new Dimension(90, 100));
            add(left, BorderLayout.LINE_START);

            right.setPreferredSize(new Dimension(90, 100));
            add(right, BorderLayout.LINE_END);

            top.setPreferredSize(new Dimension(100, 80));
            top.setLayout(new GridLayout());

            jLabel1.setFont(new Font("Droid Sans Mono", 0, 24)); // NOI18N
            jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
            jLabel1.setText("Client");
            top.add(jLabel1);

            add(top, BorderLayout.PAGE_START);

            center.setPreferredSize(new Dimension(500, 400));
            center.setLayout(new GridLayout());

            jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Id Client", "Nom", "Prenom", "Adresse"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
            jScrollPane1.setViewportView(jTable1);

            center.add(jScrollPane1);

            add(center, BorderLayout.CENTER);
        }// </editor-fold>                        
        
        public void setController(ClientController clientController) {
            this.clientController = clientController;
        }
        
                           
    }
