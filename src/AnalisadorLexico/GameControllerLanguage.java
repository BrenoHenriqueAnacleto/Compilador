/*
 *
 * Classe Principal que realiza a analise lexica 
 *
 */
package AnalisadorLexico;

import java.io.File;

public class GameControllerLanguage {
    
    public static void main(String[] args) {
      String GameControlLexer = "C:\\Users\\Fabiana\\Documents\\NetBeansProjects\\Compilador\\src\\AnalisadorLexico\\Lexer.flex";
      gerarJavaLexer(GameControlLexer);
    }
    
    public static void gerarJavaLexer(String GameControlLexer) {   //Gera a classe GameController
        
        File arquivo = new File(GameControlLexer);
        JFlex.Main.generate(arquivo);
    }
    
}
