
import java.awt.Color;
import javax.swing.JColorChooser;
import java.awt.Font; 
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import say.swing.JFontChooser;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRIAN
 */
public class Excel extends javax.swing.JFrame {
    DefaultTableModel md;
    String data [][] = {};
    Font tipoletra;
    CellData[][] clipboard;
    public Excel() {
        md = new DefaultTableModel();
        initComponents();
        TableColumnModel tcm = jTableAZ.getColumnModel();
        tcm.getColumn(0).setResizable(false);
        tcm.getColumn(0).setPreferredWidth(25);
        jTableAZ.getTableHeader().setReorderingAllowed(false);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAZ = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTableAZ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"2", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"3", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"4", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"5", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"6", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"7", null, null, null, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"8", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"9", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"10", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"11", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"12", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"13", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"14", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"15", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"16", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"17", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"18", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"19", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"20", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"21", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"22", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"23", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"24", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"25", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"26", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"27", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"28", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"29", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"30", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"31", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ));
        jTableAZ.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableAZ.setCellSelectionEnabled(true);
        jTableAZ.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        jScrollPane2.setViewportView(jTableAZ);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("ARCHIVO");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("ABRIR");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("GUARDAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("NUEVO ");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu2MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("OPCIONES");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("COPIAR");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("PEGAR");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setText("COLOR DE LETRA");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem12.setText("FUENTE");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setText("AYUDA");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu4MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // boton guardar 
        
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);
        String guardar = fc.getSelectedFile().getAbsolutePath();
        
        File file = new File(guardar);
        saveTable(file);
             
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MousePressed
       
       Ayuda abrir = new Ayuda();
        abrir.setVisible(rootPaneCheckingEnabled);
          this.setVisible(false);      
        
    }//GEN-LAST:event_jMenu4MousePressed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          Color c = JColorChooser.showDialog(rootPane,"COLOR", this.getForeground()); 
          jTableAZ.setForeground(c);
          
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MousePressed
        
        String Columna="";
        Object[][] filas = new Object [31][27];
        for(int intconteo = 0;intconteo<=30;intconteo++){
            Columna = Integer.toString(intconteo+1);  
            filas[intconteo][0]=Columna;
            for(int intcolum = 1;intcolum<=26;intcolum++){
                filas[intconteo][intcolum]= null;
            }        
        }
      
        jTableAZ.setModel(new javax.swing.table.DefaultTableModel(filas,
            new String [] {
                "","A", "B", "C", "D", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
                
                
                
        ));
     
        TableColumnModel tcm = jTableAZ.getColumnModel();
        tcm.getColumn(0).setResizable(false);
        tcm.getColumn(0).setPreferredWidth(25);
        jTableAZ.getTableHeader().setReorderingAllowed(false);
        
    }//GEN-LAST:event_jMenu2MousePressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // boton para cargar o abrir
           final JFileChooser fc = new JFileChooser();
           fc.showOpenDialog(this);
           String path = fc.getSelectedFile().getAbsolutePath();          
           File f = new File(path);

            if (f.isFile()){
                loadTable(f);
            }   
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //ABRIR
        File file = new File("copiar.txt");
        pegar(file);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      File file = new File("copiar.txt");   
        copiar(file);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        JFontChooser tipodeletra = new JFontChooser();
        int inttl = tipodeletra.showDialog(this);
        if(inttl == JFontChooser.OK_OPTION){
            tipoletra = tipodeletra.getSelectedFont();
            jTableAZ.setFont(tipoletra);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed
 
//AQUI VAN TODOS LAS FUNCIONES Y METODOS
    //RESTAURAR
    public void restaurar(){
        
    }   
    
    private void pegar(File file){
        int row = jTableAZ.getSelectedRow();
        int col = jTableAZ.getSelectedColumn();
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            Object[] lines = br.lines().toArray();
            String[] colmsAyd =lines[0].toString().split("\t");
            
            for(int i = 0; i < lines.length ; i++){
                String[] colums = lines[i].toString().split("\t");
                for(int j = 0; j < colmsAyd.length ; j++){
                
                jTableAZ.setValueAt(colums[j], row+i, col+j);
            }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void copiar(File file){
        int rows[] = jTableAZ.getSelectedRows();
        int colm[] = jTableAZ.getSelectedColumns();
        
        try {
            
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < rows.length ; i++){
                for(int j = 0; j < colm.length ; j++){
                   Object value = jTableAZ.getValueAt(rows[i],colm[j]);

                if(value!=null){
                            bw.write(jTableAZ.getValueAt(rows[i],colm[j]).toString()+"\t");
                        }else{
                            bw.write(" \t");
                }

            }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    private void saveTable(File file){   
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < jTableAZ.getRowCount(); i++){//rows
                for(int j = 0; j < jTableAZ.getColumnCount(); j++){//columns
                    Object value = jTableAZ.getValueAt(i,j);
                    if(value!=null){
                        bw.write(jTableAZ.getValueAt(i, j).toString()+",");
                    }else{
                        bw.write(" ,");
                    }
                    
                }
                bw.newLine();
            }
            
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private DefaultTableModel getTableModel(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();        
        return model;
    }
    
    private void loadTable(File file) {        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTableAZ.getModel();
            model.setRowCount(0);
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Excel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Excel().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAZ;
    // End of variables declaration//GEN-END:variables

    

  
}
