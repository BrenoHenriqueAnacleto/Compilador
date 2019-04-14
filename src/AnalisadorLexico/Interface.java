package AnalisadorLexico;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Interface extends javax.swing.JFrame {
    int var = 0;
    
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
                    resultado = resultado + "Linha: "+num_linha + ":" + "<OPP> "+ lexer.lexeme + "\n";
                    break;
                case CLP:
                    resultado = resultado + "Linha: "+ num_linha + ":" + "<CLP>"+ lexer.lexeme + "\n";
                    break;
                 case BR: 
                    num_linha++;
                    break;
                case OPK:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<OPK>"+ lexer.lexeme + "\n";
                    break;
                case CLK:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<CLK>" + lexer.lexeme + "\n";
                    break;
                case OPC:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<OPC>"+ lexer.lexeme + "\n";
                    break;
                case CLC:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<CLC>" + lexer.lexeme + "\n";
                    break;
                case END:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<END>" + lexer.lexeme + "\n";
                    break;
                case STR:
                    resultado = resultado + "Linha: " + num_linha + ":" + "<STR> "+ lexer.lexeme + "\n";
                    break;
                case PF:
                    resultado = resultado + "Linha: " +num_linha + ":" + " <PF>" + lexer.lexeme + "\n";
                    break;
                case PFD:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<PFD>" + lexer.lexeme +"\n";
                    break;
                case INT:
                    resultado = resultado +"Linha: " + num_linha + ":" + "<INT>" + lexer.lexeme + "\n";
                    break;
                case CH:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<CH>" + lexer.lexeme + "\n";
                    break;
                case OPRELAC:
                    resultado = resultado + "Linha: "+ num_linha + ":" + "<OPRELAC>" + lexer.lexeme + "\n";
                    break;
                case OPARIT:
                    resultado = resultado +"Linha: " + num_linha + "<OPARIT>" + lexer.lexeme + "\n";
                    break;
                case OPLOG:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<OPLOG>" + lexer.lexeme +">"+ "\n";
                    break;
                case OPBOL:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<OPBOL> " + lexer.lexeme +"\n";
                    break;
                case REPETE:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<REPETE> " + lexer.lexeme +"\n";
                    break;
                case STOP:
                    resultado = resultado + "Linha: " +num_linha + ":" + " <STOP>" + lexer.lexeme +"\n";
                    break;
                case IBC:
                    resultado = resultado + "Linha: " +num_linha + ":" + "<IBC>"+ lexer.lexeme +"\n";
                    break;
                case FBC:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<FBC>" + lexer.lexeme + "\n";
                    break;
                case COMENT:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<COMENT> " + lexer.lexeme + "\n";
                    break;
                case OPER:
                    resultado = resultado +"Linha: " + num_linha + "-" + "< OPER>" + lexer.lexeme + "\n";
                    break;
                case NUM:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<NUM> " + lexer.lexeme + "\n";
                    break;
                case PALAVRA:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<PALAVRA> " + lexer.lexeme + "\n";
                    break;
                case ATRIB:
                    resultado = resultado +"Linha: " + num_linha + "-" + "<ATRIB>" + lexer.lexeme + "\n";
                    break;   
                case INICIO:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<INICIO> " + lexer.lexeme + "\n";
                    break;  
                 case SW:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<SW> " + lexer.lexeme + "\n";
                    break;  
                 case CASO:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<CASO> " + lexer.lexeme + "\n";
                    break;  
                  case DOISP:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<DOISP> " + lexer.lexeme + "\n";
                    break; 
                  case ASP:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<ASP> " + lexer.lexeme + "\n";
                    break; 
                  case FUNC:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<FUNC> " + lexer.lexeme + "\n";
                    break;
                  case IF:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<IF> " + lexer.lexeme + "\n";
                    break;
                  case ELSE:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<ELSE> " + lexer.lexeme + "\n";
                    break;
                  case IMPRIMI:
                    resultado = resultado + "Linha: " +num_linha + "-" + "<IMPRIMI> " + lexer.lexeme + "\n";
                    break;
                 case ERROR:
                    resultado = resultado + "Linha: " +num_linha + "-" + "Erro! Token não reconhecido." + lexer.yytext() + "\n";
                    break;
           
           }
           }       
        }
    }
      
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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Código Fonte ");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("Análise Léxica");

        botao.setBackground(new java.awt.Color(255, 255, 255));
        botao.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        botao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fabiana\\Documents\\NetBeansProjects\\Compilador\\src\\AnaliseLexicaImagens\\media_play_green.png")); // NOI18N
        botao.setText("Analisar");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fabiana\\Documents\\NetBeansProjects\\Compilador\\src\\AnaliseLexicaImagens\\brush3.png")); // NOI18N
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
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            try {
              jTextArea1.read( new FileReader( file.getAbsolutePath() ), null ); 
               jTextArea2.setText("");
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Problema ao acessar o arquivo: "+file.getAbsolutePath(), "Erro", JOptionPane.ERROR_MESSAGE); 
            }
        } else {
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

        try{
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
