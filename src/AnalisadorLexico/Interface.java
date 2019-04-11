/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalisadorLexico;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author HigorLeandro
 */
public class Interface extends javax.swing.JFrame {
    int var = 0;  /**
     * Creates new form Inteface
     */
    
    public javax.swing.JTextArea jText;
    File file;
    int num_linha=1; 
      public void executar()throws Exception{
        
      
       
       
       jText = jTextArea1;
       String expr;
       expr = (String)jText.getText();
        
       AnalisadorLexico.GameController lexer = new AnalisadorLexico.GameController(new StringReader(expr));
       
       String resultado="";
       
       
       
       while(true){
           Token token = lexer.yylex(); 
      
                   
           if(token == null){
              
                jTextArea2.setText(resultado);
                return;
           }      
           System.out.println(token.toString());
           if (token.toString().equals("BR")){
               num_linha++;
           }else{
           
               switch(token){
                   
                case OPP:
                    resultado = resultado + "Linha: "+num_linha + ":" + "<Abre parênteses> "+ lexer.lexeme + "\n";
                    break;
                case CLP:
                    
                    resultado = resultado + "Linha: "+ num_linha + ":" + "<Fecha parênteses>"+ lexer.lexeme + "\n";
                    break;
                 case BR:
                     
                    num_linha++;
                    break;
                case OPK:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<Abre chaves>"+ lexer.lexeme + "\n";
                    break;
                case CLK:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<Fecha chaves>" + lexer.lexeme + "\n";
                    break;
                case OPC:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<Abre colchetes>"+ lexer.lexeme + "\n";
                    break;
                case CLC:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<Fecha colchetes>" + lexer.lexeme + "\n";
                    break;
                case END:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<Final de linha>" + lexer.lexeme + "\n";
                    break;
                case STR:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<Conjunto de carateres> "+ lexer.lexeme + "\n";
                    break;
                case PF:
                    resultado = resultado + "Linha: " +num_linha + ":" + " <Ponto flutuante>" + lexer.lexeme + "\n";
                    break;
                case PFD:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Double>" + lexer.lexeme +"\n";
                    break;
                case INT:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<Inteiro>" + lexer.lexeme + "\n";
                    break;
                case CH:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Char>" + lexer.lexeme + "\n";
                    break;
                case OPERLAC:
                    resultado = resultado + num_linha + ":" + "<Operadores Relacionais>" + lexer.lexeme + "\n";
                    break;
                case OPARIT:
                    resultado = resultado +"Linha: " + num_linha + "<Operadores Aritméticos>" + lexer.lexeme + "\n";
                    break;
                case OPLOG:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Operadores Lógicos>" + lexer.lexeme +">"+ "\n";
                    break;
                case OPBOL:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Operadores Boleanos> " + lexer.lexeme +"\n";
                    break;
                case REPETE:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Laço de repetição> " + lexer.lexeme +"\n";
                    break;
                case STOP:
                    resultado = resultado + "Linha: " +num_linha + ":" + " <Pausa de execução>" + lexer.lexeme +"\n";
                    break;
                case IBC:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<Início de bloco de comentário>"+ lexer.lexeme +"\n";
                    break;
                case FBC:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<Final de bloco de comentário>" + lexer.lexeme + "\n";
                    break;
                case COMENT:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<Comentário> " + lexer.lexeme + "\n";
                    break;
                case OPER:
                    resultado = resultado +"Linha: " + num_linha + "-" + "< Decremento eIncremento>" + lexer.lexeme + "\n";
                    break;
                case NUM:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<Número> " + lexer.lexeme + "\n";
                    break;
                case PARAM:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<Parametro> " + lexer.lexeme + "\n";
                    break;
                case ATRIB:
                    resultado = resultado +"Linha: " + num_linha + "-" + "<Atribuição>" + lexer.lexeme + "\n";
                    break;
                case ID:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<Identificador> " + lexer.lexeme + "\n";
                    break;              
                 case ERROR:
                    resultado = resultado + "Linha: " +num_linha + "-" + "Erro! Token não reconhecido." + lexer.lexeme + "\n";
                    break;
           
           }
           }       
        }
    }
    

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
         
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botao = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Controller");

        jPanel1.setForeground(new java.awt.Color(60, 63, 65));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(new NumeredBorder());
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Código Fonte ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Análise Léxica");

        botao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/icon-play-128.png"))); // NOI18N
        botao.setText("Analisar");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/Limpar.png"))); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(547, 547, 547))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jMenu6.setText("Arquivo");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/Open-icon.png"))); // NOI18N
        jMenuItem2.setText("Abrir Arquivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AnaliseLexicaImagens/sair.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try {
              // What to do with the file, e.g. display it in a TextArea
              jTextArea1.read( new FileReader( file.getAbsolutePath() ), null ); 
               jTextArea2.setText("");
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Problema ao acessar o arquivo: "+file.getAbsolutePath(), "Erro", JOptionPane.ERROR_MESSAGE); 
              //System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            //System.out.println("File access cancelled by user.");
        }
     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JPanel panel = new JPanel();  
        panel.setLayout(null);  
        Object source;  
        source = evt.getSource();  
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea2.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed

        // TODO add your handling code here:
        try{
            //System.out.println("passou");
            executar();
            var = 0;
            num_linha=1;
            if(file != null){

                PrintStream ps = new PrintStream(file.getAbsolutePath());
                ps.println(jText.getText());
                ps.close();
            }

        }catch(Exception e){

        }

    }//GEN-LAST:event_botaoActionPerformed

    /**
     * @param args the command line arguments
     */
   
 
      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
   
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
