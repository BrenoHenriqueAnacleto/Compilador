/*
 *
 * Classe Principal que realiza a analise lexica 
 *
 */
package AnalisadorLexico;

import java.io.File;

/**
 * Classe Analisador Lexico
 * 
 * @name AnalisadorLexico
 * @author Breno Henrique Anacleto <brenohenriqueanacleto@gmail.com>
 * @since 25/03/2019
 */
public class GameControllerLanguage {
    
    public static void main(String[] args) {
      String GameControlLexer = "C:/Users/breno/Desktop/Game Controller Language/src/AnalisadorLexico/Lexer.flex";
      gerarJavaLexer(GameControlLexer);
    }
    
    public static void gerarJavaLexer(String GameControlLexer) {
        
        File arquivo = new File(GameControlLexer);
        JFlex.Main.generate(arquivo);
    }
    
}
