package AnalisadorLexico; 

import static AnalisadorLexico.Token.*;

%%                    /* Contém as delacarações globais*/
%class GameController
%type Token

L = [a-zA-Z_óâã]
D = [0-9]               /* Conjunto de digitos numericos*/

WHITE=[ \t\r]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}

                        /* Contém as regras do analisador Lexico*/
("=")  {lexeme = yytext(); return ATRIB;} 
("(")  {lexeme = yytext(); return OPP;}                                      /* Abre parênteses*/
(")")  {lexeme = yytext(); return CLP;}                                      /* Fecha parênteses*/
("\n") {lexeme = yytext(); return BR;}                                       /* Pula linha*/
("{")  {lexeme = yytext(); return OPK;}                                       /* Abre chaves*/
("}")  {lexeme = yytext(); return CLK;}                                       /* Fecha chaves*/
("[")  {lexeme = yytext(); return OPC;}                                       /* Abre colchetes*/
("]")  {lexeme = yytext(); return CLC;}                                       /* Fecha colchetes*/
(";")  {lexeme = yytext(); return END;}                                       /* Final de linha*/
("\"") {lexeme = yytext(); return ASP;}                                      /* Aspas*/
(":")  {lexeme = yytext(); return DOISP;}                                     /* Dois pontos*/
("float" | "double" | "int" | "char") {lexeme = yytext(); return TIPODADO;}   /* Conjunto de dados*/
(">=" | "<=" |"==" |"!=" |"<" | ">") {lexeme = yytext(); return OPRELAC;}    /* Operadores Relacionais*/
("+" | "-" | "/" | "*") {lexeme = yytext(); return OPARIT;}                  /* Operadores Aritméticos*/
("||" | "!" | "&&") {lexeme = yytext(); return OPLOG;}                       /* Operadores Lógicos*/
("true" | "false") {lexeme = yytext(); return OPBOL;}                        /* Operadores Boleanos*/
("for") {lexeme = yytext(); return REPETE;}                                  /* Laço de repetição*/
("break") {lexeme = yytext(); return STOP;}                                  /* Pausa de execução*/
("\/*\*/"(.)*) {lexeme = yytext(); return COMENTBL;}                        /* Comentario de bloco*/
("//".*) {lexeme = yytext(); return COMENT;}                               /* Comentário*/
("--" | "++") {lexeme = yytext(); return OPER;}                              /* Decremento e Incremento*/
("func") {lexeme = yytext(); return FUNC;}                                   /* Definição de função*/
("printf") {lexeme = yytext(); return IMPRIMI;}                              /* Exibe uma mensagem*/
("switch") {lexeme = yytext(); return SW;}                                   /* Cotrola acao*/
("case") {lexeme = yytext(); return CASO;}                                   /*Case */
("inicio") {lexeme = yytext(); return INICIO;}                               /* Inicio do algoritmo*/
("if") {lexeme = yytext(); return IF;}                                       /* Estrutura condicional*/
("else") {lexeme = yytext(); return ELSE;}                                   /* Estrutura senão*/
("fim") {lexeme = yytext(); return FIM;}                                    /* Fim algoritmo*/

{L}({L}|{D})* {lexeme = yytext(); return PALAVRA;}
{D}+ {lexeme = yytext(); return NUM;}

. {return ERROR;}