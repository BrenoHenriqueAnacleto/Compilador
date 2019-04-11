package AnalisadorLexico; 

import static AnalisadorLexico.Token.*;

%% 
%class GameController
%type Token

L = [a-zA-Z_]
D = [0-9]
T = [^"L+"$]
X=[\n]
WHITE=[ \t\r]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}



("=")    {lexeme = yytext(); return ATRIB;} 


(OPP)      {lexeme = yytext(); return OPP;} 
(CLP)      {lexeme = yytext(); return CLP;} 
(BR)         {lexeme = yytext(); return BR;} 


(OPK) {lexeme = yytext(); return OPK;}             
(CLK) {lexeme = yytext(); return CLK;}              /* Fecha chaves*/
(OPC) {lexeme = yytext(); return OPC;}              /* Abre colchetes*/
(CLC) {lexeme = yytext(); return CLC;}              /* Fecha colchetes*/
(END) {lexeme = yytext(); return END;}              /* Final de linha*/
(STR) {lexeme = yytext(); return STR;}              /* Conjunto de carateres*/
(PF) {lexeme = yytext(); return PF;}                /* Ponto flutuante*/
(PFD) {lexeme = yytext(); return PFD;}              /* Double*/
(INT) {lexeme = yytext(); return INT;}              /* Inteiro*/
(CH) {lexeme = yytext(); return CH;}                /* Char*/
(OPERLAC) {lexeme = yytext(); return OPERLAC;}      /* Operadores Relacionais*/
(OPARIT) {lexeme = yytext(); return OPARIT;}        /* Operadores Aritméticos*/
(OPLOG) {lexeme = yytext(); return OPLOG;}          /* Operadores Lógicos*/
(OPBOL) {lexeme = yytext(); return OPBOL;}          /* Operadores Boleanos*/
(REPETE) {lexeme = yytext(); return REPETE;}        /* Laço de repetição*/
(STOP) {lexeme = yytext(); return STOP;}            /* Pausa de execução*/
(IBC) {lexeme = yytext(); return IBC;}              /* Início de bloco de comentário*/
(FBC) {lexeme = yytext(); return FBC;}              /* Final de bloco de comentário*/
(COMENT) {lexeme = yytext(); return COMENT;}        /* Comentário*/
(OPER) {lexeme = yytext(); return OPER;}            /* Decremento e Incremento*/
("FUNC") {lexeme = yytext(); return FUNC;}          /* Definição de função*/
("IMPRIMI") {lexeme = yytext(); return IMPRIMI;}    /* Exibe uma mensagem*/
("ERROR") {lexeme = yytext(); return ERROR;}    /* Erro! Token não reconhecido.*/
([0-9]+) {lexeme = yytext(); return NUM;}           /* Números*/
("\""[^\"][a-zA-Z0-9]*\.*[a-z]*"\"") {lexeme = yytext(); return PARAM;}
/*({D}({L})+ {lexeme=yytext(); return ER;}*/
. {return ER;}