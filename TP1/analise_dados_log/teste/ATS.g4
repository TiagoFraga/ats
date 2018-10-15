grammar ATS;


/**
 *
 * REGRAS
 *
 */

    
umer : (evento)*
     ;

evento : 'logout' PONTO_VIRGULA
       | 'recusar viagem' PONTO_VIRGULA
       | 'viajar' PONTO_VIRGULA
       | 'solicitar'  localizacao PONTO_VIRGULA
       | 'login' MAIL password PONTO_VIRGULA
       | 'registar empresa' empresa password PONTO_VIRGULA
       | 'registar condutor' MAIL nome password morada nascimento NUMERO (empresa)? PONTO_VIRGULA 
       | 'registar cliente' MAIL nome password morada nascimento localizacao PONTO_VIRGULA
       ;










/**
 *
 * ANALISADOR LEXICO
 *
 */
    
localizacao : '(' NUMERO PONTO NUMERO VIRGULA NUMERO PONTO NUMERO  ')' ;

nome : '"' (palavra)+ '"';

morada : '"' ((palavra_numero|CHAR|MENOS|PONTO)+)? VIRGULA NUMERO VIRGULA cod_postal '"';

cod_postal : NUMERO MENOS NUMERO (palavra_numero|MENOS|CHAR)+ ;

nascimento : NUMERO MENOS NUMERO MENOS NUMERO ;
       
MAIL : '"' [a-zA-Z\_\.\+\-\?0-9]+ '@' [a-zA-Z]+ '.' [a-zA-Z]+ '.'? [a-zA-Z]* '"'  ;

empresa : '"' (palavra_numero)+ '"';

palavra : (LETRA)+;

palavra_numero : (LETRA|NUMERO)+ ; 
        
password : '"' (LETRA|CHAR|NUMERO|PONTO|VIRGULA|PONTO_VIRGULA|MENOS)+ '"';

LETRA : [a-zA-ZçÇ];

CHAR: [\_\'\+\?\%\$\&\*\#\@\!\/];

PONTO : [.];

VIRGULA : [,];

PONTO_VIRGULA : [;];

MENOS : [-];

NUMERO : [0-9]+;

WS : [ \t\r\n]+ -> skip ;
