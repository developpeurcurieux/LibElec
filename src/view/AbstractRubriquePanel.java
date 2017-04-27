
package view;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;





public abstract class AbstractRubriquePanel extends JPanel{
    private JPanel bottom;
    private ButtonGroup buttonGroup1;
    private JPanel center;
    private JButton btnSearch;
    private JButton jButton2;
    private JButton jButton3;
    private JButton btnQuit;
    private JButton btnMenuPrincipal;
    private JButton btnReactualiser;
    private JButton jButton7;
    private JButton jButton8;
    private JComboBox jComboBox1;
    private JLabel lblRubrique;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JSeparator jSeparator1;
    private JTable jTable2;
    private JTextArea jTextArea1;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JPanel left;
    private JPanel top;
    //
    private String rubrique;
    
    public AbstractRubriquePanel(String rubrique) {
        initComponents();
        lblRubrique.setText(rubrique);
    }
    
    
    
    private void initComponents() {
        
        buttonGroup1 = new ButtonGroup();
        
        bottom = new JPanel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        btnSearch = new JButton();
        btnQuit = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
//
        
        left = new JPanel();
        jTextField4 = new JTextField();
        jComboBox1 = new JComboBox();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton2 = new JButton();
        jSeparator1 = new JSeparator();
        jButton3 = new JButton();
        //
        top = new JPanel();
        lblRubrique = new JLabel();
        btnMenuPrincipal = new JButton();
        btnReactualiser = new JButton();
        center = new JPanel();
        jScrollPane3 = new JScrollPane();
        jTable2 = new JTable();
        
        
        this.setPreferredSize(new Dimension(830, 620));
        setLayout(new BorderLayout());
        
        bottom.setPreferredSize(new Dimension(700, 140));
        
        jRadioButton1.setText("choix 1");
        jRadioButton3.setText("choix 2");
        jRadioButton2.setText("choix 3");
        
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        
        
        
        ImageIcon iconQui = new ImageIcon(this.getClass().getResource("/resources/quitIcon_24.png"));
        iconQui.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        btnQuit.setIcon(iconQui);
        
        ImageIcon iconSea = new ImageIcon(this.getClass().getResource("/resources/searchIcon_24.png"));
        iconSea.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        btnSearch.setIcon(iconSea);
        
        GroupLayout bottomLayout = new GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        
        
        bottomLayout.setHorizontalGroup(
                bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(bottomLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(bottomLayout.createSequentialGroup()
                                                .addContainerGap(52, Short.MAX_VALUE)
                                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
        );
        bottomLayout.setVerticalGroup(
                bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bottomLayout.createSequentialGroup()
                                                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(bottomLayout.createSequentialGroup()
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(52, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        
        
        
        
        add(bottom, BorderLayout.PAGE_END);
        
        
        
        
        
        left.setPreferredSize(new Dimension(250, 100));
        
        jTextField4.setText("");
        
        
        
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Element a modifier");
        
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Champ libre");
        
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);
        
        jButton2.setText("modifier");
        
        jButton3.setText("valider");
        
        GroupLayout leftLayout = new GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton3)
                                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6))
                        .addGroup(GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addContainerGap())
        );
        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addContainerGap())
        );
        add(left, BorderLayout.LINE_START);
        
        top.setPreferredSize(new Dimension(100, 80));
        top.setLayout(null);
        
        lblRubrique.setFont(new Font("Droid Sans Mono", 0, 24)); // NOI18N
        lblRubrique.setHorizontalAlignment(SwingConstants.CENTER);
        
        top.add(lblRubrique);
        lblRubrique.setBounds(379, 17, 250, 29);
        
        
        btnMenuPrincipal.setBounds(10, 10, 40, 40);
        ImageIcon iconMen = new ImageIcon(this.getClass().getResource("/resources/homeIcon_24.png"));
        iconMen.getImage().getScaledInstance(btnMenuPrincipal.getWidth(), btnMenuPrincipal.getHeight(), Image.SCALE_DEFAULT);
        btnMenuPrincipal.setIcon(iconMen);
        
        top.add(btnMenuPrincipal);
        
        
        btnReactualiser.setBounds(900, 10, 40, 40);
        ImageIcon iconRea = new ImageIcon(this.getClass().getResource("/resources/dataDownload_24.png"));
        iconRea.getImage().getScaledInstance(btnReactualiser.getWidth(), btnReactualiser.getHeight(), Image.SCALE_DEFAULT);
        btnReactualiser.setIcon(iconRea);
        
        top.add(btnReactualiser);
        add(top, BorderLayout.PAGE_START);
        
        center.setPreferredSize(new Dimension(800, 400));
        center.setLayout(new GridLayout(1, 0));
        
        DefaultTableModel tableModel = new DefaultTableModel(
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
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                });
        
        jTable2.setModel(tableModel);
       
        
        jScrollPane3.setViewportView(jTable2);
        
        center.add(jScrollPane3);
        
        add(center, BorderLayout.CENTER);
    }
    
    public JButton getjButton7() {
        return jButton7;
    }
    
    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }
    
    public JButton getjButton8() {
        return jButton8;
    }
    
    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }
    
    public JButton getBtnSearch() {
        return btnSearch;
    }
    
    public void setBtnSearch(JButton btnSearch) {
        this.btnSearch = btnSearch;
    }
    
    public JButton getjButton2() {
        return jButton2;
    }
    
    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }
    
    public JButton getjButton3() {
        return jButton3;
    }
    
    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }
    
    public JButton getBtnQuit() {
        return btnQuit;
    }
    
    public void setBtnQuit(JButton btnQuit) {
        this.btnQuit = btnQuit;
    }
    
    public JButton getBtnMenuPrincipal() {
        return btnMenuPrincipal;
    }
    
    public void setBtnMenuPrincipal(JButton btnMenuPrincipal) {
        this.btnMenuPrincipal = btnMenuPrincipal;
    }
    
    public JButton getBtnReactualiser() {
        return btnReactualiser;
    }
    
    public void setBtnReactualiser(JButton btnReactualiser) {
        this.btnReactualiser = btnReactualiser;
    }
    
    
    public JComboBox getjComboBox1() {
        return jComboBox1;
    }
    
    public void setjComboBox1(JComboBox jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }
    
    public JLabel getLblRubrique() {
        return lblRubrique;
    }
    
    public void setLblRubrique(JLabel lblRubrique) {
        this.lblRubrique = lblRubrique;
    }
    
    public JLabel getjLabel2() {
        return jLabel2;
    }
    
    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }
    
    public JLabel getjLabel3() {
        return jLabel3;
    }
    
    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }
    
    public JRadioButton getjRadioButton1() {
        return jRadioButton1;
    }
    
    public void setjRadioButton1(JRadioButton jRadioButton1) {
        this.jRadioButton1 = jRadioButton1;
    }
    
    public JRadioButton getjRadioButton2() {
        return jRadioButton2;
    }
    
    public void setjRadioButton2(JRadioButton jRadioButton2) {
        this.jRadioButton2 = jRadioButton2;
    }
    
    public JRadioButton getjRadioButton3() {
        return jRadioButton3;
    }
    
    public void setjRadioButton3(JRadioButton jRadioButton3) {
        this.jRadioButton3 = jRadioButton3;
    }
    
    
    
    public JTable getjTable2() {
        return jTable2;
    }
    
    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }
    
    public JTextArea getjTextArea1() {
        return jTextArea1;
    }
    
    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }
    
    public JTextField getjTextField1() {
        return jTextField1;
    }
    
    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }
    
    public JTextField getjTextField2() {
        return jTextField2;
    }
    
    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }
    
    public JTextField getjTextField3() {
        return jTextField3;
    }
    
    public void setjTextField3(JTextField jTextField3) {
        this.jTextField3 = jTextField3;
    }
    
    
    
    public JTextField getjTextField4() {
        return jTextField4;
    }
    
    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }
    
    public String getRubrique() {
        return rubrique;
    }
    
    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }
    
    
    
}