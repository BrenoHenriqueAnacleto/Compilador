package AnalisadorSintatico;

import java_cup.runtime.Symbol;
import AnalisadorSintatico.sym;
import static AnalisadorLexico.Token.*;

%%

//%public
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char
%eofval{
    return new Symbol(sym.EOF, new String("Fim do Arquivo"));
%eofval}

L = [a-zA-Z]
D = [0-9]
WHITE=[ \t\r\n]
%{
public String lexeme;
%{
%%
{WHITE} {/*Ignore*/}

/* Operador de atribuição */

("=")    {return new Symbol (sym.ATRIB, yychar, yyline, yytext());}
("(")    {return new Symbol (sym.OPP, yychar, yyline, yytext());}
(")")    {return new Symbol (sym.CLP, yychar, yyline, yytext());}
("\n")   {return new Symbol (sym.BR, yychar, yyline, yytext());}
("{")    {return new Symbol (sym.OPK, yychar, yyline, yytext());}
("}")    {return new Symbol (sym.CLK, yychar, yyline, yytext());}
("[")    {return new Symbol (sym.OPC, yychar, yyline, yytext());}
("]")    {return new Symbol (sym.CLC, yychar, yyline, yytext());}
(";")    {return new Symbol (sym.END, yychar, yyline, yytext());}
("\"")   {return new Symbol (sym.ASP, yychar, yyline, yytext());}
(":")    {return new Symbol (sym.DOISP, yychar, yyline, yytext());}
("float" | "double" | "int" | "char")   {return new Symbol (sym.TIPODADO, yychar, yyline, yytext());}
(">=" | "<=" |"==" |"!=" |"<" | ">")    {return new Symbol (sym.OPRELAC, yychar, yyline, yytext());}
("+" | "-" | "/" | "*")                 {return new Symbol (sym.OPARIT, yychar, yyline, yytext());}
("||" | "!" | "&&")                     {return new Symbol (sym.OPLOG, yychar, yyline, yytext());}
("true" | "false")                      {return new Symbol (sym.OPBOL, yychar, yyline, yytext());}   
("for")                                 {return new Symbol (sym.REPETE, yychar, yyline, yytext());} 
("break")                               {return new Symbol (sym.STOP, yychar, yyline, yytext());}
("\/*\*/"(.)*)                          {return new Symbol (sym.COMENTBL, yychar, yyline, yytext());}
("//".*)                                {return new Symbol (sym.COMENT, yychar, yyline, yytext());}
("--" | "++")                           {return new Symbol (sym.OPER, yychar, yyline, yytext());}
("func")                                {return new Symbol (sym.FUNC, yychar, yyline, yytext());}
("printf")                              {return new Symbol (sym.IMPRIMI, yychar, yyline, yytext());}
("switch")                              {return new Symbol (sym.SW, yychar, yyline, yytext());}
("case")                                {return new Symbol (sym.CASO, yychar, yyline, yytext());}
("inicio")                              {return new Symbol (sym.INICIO, yychar, yyline, yytext());}
("if")                                  {return new Symbol (sym.IF, yychar, yyline, yytext());}
("else")                                {return new Symbol (sym.ELSE, yychar, yyline, yytext());}
("fim")                                 {return new Symbol (sym.FIM, yychar, yyline, yytext());}

*({L}({L}|{L}|{D}))* {return new Symbol (sym.PALAVRA, yychar, yyline, yytext());}
({D})+               {return new Symbol (sym.NUM, yychar, yyline, yytext());}
.                    {return new Symbol (sym.ERROR, yychar, yyline, yytext());}
 /*.                 {System.err.println("Caractere Ilegal: " +yytext());}*/
























