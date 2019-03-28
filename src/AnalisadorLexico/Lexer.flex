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


/* Operador de atribuição */

("=")    {lexeme = yytext(); return ATRIB;}

/*Separadores */
("OPP")      {lexeme = yytext(); return OPP;}
("CLP")      {lexeme = yytext(); return CLP;}
(\n)       {lexeme = yytext(); return BR;}


/* Palavras reservadas*/
(OPK) {lexeme = yytext(); return OPK;}
(CLK) {lexeme = yytext(); return CLK;}
(OPC) {lexeme = yytext(); return OPC;}
(CLC) {lexeme = yytext(); return CLC;}
(END) {lexeme = yytext(); return END;}
(STR) {lexeme = yytext(); return STR;}
(PF) {lexeme = yytext(); return PF;}
(PFD) {lexeme = yytext(); return PFD;}
(INT) {lexeme = yytext(); return INT;}
(CH) {lexeme = yytext(); return CH;}
(OPERLAC) {lexeme = yytext(); return OPERLAC;}
(OPARIT) {lexeme = yytext(); return OPARIT;}
(OPLOG) {lexeme = yytext(); return OPLOG;}
(OPBOL) {lexeme = yytext(); return OPBOL;}
(REPETE) {lexeme = yytext(); return REPETE;}
(STOP) {lexeme = yytext(); return STOP;}
(IBC) {lexeme = yytext(); return IBC;}
(FBC) {lexeme = yytext(); return FBC;}
(COMENT) {lexeme = yytext(); return COMENT;}
(OPER) {lexeme = yytext(); return OPER;}
([0-9]+) {lexeme = yytext(); return NUM;}
("\""[^\"][a-zA-Z0-9]*\.*[a-z]*"\"") {lexeme = yytext(); return PARAM;}
/*({D}({L})+ {lexeme=yytext(); return ER;}*/
. {return ER;}