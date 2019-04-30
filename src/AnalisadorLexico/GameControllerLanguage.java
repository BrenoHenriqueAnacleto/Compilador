package AnalisadorLexico;

import java.io.File;

public class GameControllerLanguage {
    
    public static void main(String[] args) {
      String GameControlLexer = "C:\\Users\\Fabiana\\Documents\\NetBeansProjects\\Compilador\\src\\AnalisadorLexico\\Lexer.flex";
      gerarJavaLexer(GameControlLexer);
    }
    
    public static void gerarJavaLexer(String GameControlLexer) {   //Gera a classe GameController para realizar a analise lexica
        
        File arquivo = new File(GameControlLexer); // abre o arquivo Lexer.flex
        JFlex.Main.generate(arquivo); //Gera a classe GameController.java
    }
    
}
