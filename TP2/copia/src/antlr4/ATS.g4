grammar ATS;

@header
{
  import java.awt.geom.Point2D;
  import java.time.LocalDate;
  import java.time.format.DateTimeFormatter;
  import java.util.*;
}

@members
{
  UMeR umer = new UMeR();
  User utilizador = null;
  
  private String unquote(String str) {
    return str.substring(1,str.length()-1);
  }
}

/**
 *
 * REGRAS
 *
 */

    
log : (evento)*
    | EOF
    ;

evento : 'logout' PONTO_VIRGULA{
          utilizador = null;
          System.out.print("LOGOUT: Sucesso");
          System.out.println("\n");
         } 
       | 'recusar viagem' PONTO_VIRGULA{
          System.out.println("RECUSAR VIAGEM");
          System.out.println("\n");
          
         }
       | 'viajar' PONTO_VIRGULA{
          if(utilizador!=null){
           Boolean bol=false;
           Driver driver = (Driver) utilizador;
           bol = umer.doTripQueue(driver.getEmail());
           if(bol == false){
            System.out.println("VIAJAR: Erro a realizar a viagem, condutor: "+driver.getEmail());
            System.out.println("\n");
           }else{
            System.out.println("VIAJAR: Viagem efetuada com sucesso, condutor: "+driver.getEmail());
            System.out.println("\n");
           }
          }                              
         }
       | 'solicitar' '(' localizacao ')' PONTO_VIRGULA{
          if(utilizador!= null){
            Client cliente = (Client) utilizador;
            String string = $localizacao.text;
            String[] parts = string.split(",");
            double x = Double.parseDouble(parts[0]);
            double y = Double.parseDouble(parts[1]);
            Point2D.Double position = new Point2D.Double (x,y);
            //umer.newTripClosest(cliente,position);
            System.out.println("SOLICITAR: Sucesso");
            System.out.println("\n");
          }else{
            System.out.println("SOLICITAR: Erro");
            System.out.println("\n");
          }
         }
       | 'login' '"' MAIL '"' '"' password '"' PONTO_VIRGULA{
          HashMap <String, User> list = umer.allUsers();
          if(list.containsKey($MAIL.text)){
              utilizador = list.get($MAIL.text);
              System.out.println("LOGIN : Sucesso! " + utilizador.getEmail());
              System.out.println("\n");
          }else{
              System.out.print("LOGIN : ERRO");
              System.out.println("\n");
          }
         }  
       | 'registar empresa' '"' empresa '"' '"' password '"' PONTO_VIRGULA{
          Boolean bol;
          bol = umer.registerCompany($empresa.text,$password.text);
          System.out.print("REGISTAR EMPRESA: " + $empresa.text + " -> " + bol);
          System.out.println("\n");
         }
       | 'registar condutor' '"' MAIL '"' '"' nome '"' '"' password '"' '"' morada '"' nascimento NUMERO ('"' empresa '"')? PONTO_VIRGULA{
          Boolean bol;
          DateTimeFormatter formatto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          LocalDate data = LocalDate.parse($nascimento.text, formatto);
          Driver d = new Driver($MAIL.text,$nome.text,$password.text,$morada.text, data,(double)$NUMERO.int,$empresa.text);
          bol = umer.registerUser((User) d, $empresa.text);
          System.out.print("REGISTAR CONDUTOR: " + $MAIL.text + " -> " + bol);
          System.out.println("\n");
          
         }
       | 'registar cliente' '"' MAIL '"' '"' nome '"' '"' password '"' '"' morada '"' nascimento  '(' localizacao ')' PONTO_VIRGULA{
           Boolean bol;
           DateTimeFormatter formatto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
           LocalDate data = LocalDate.parse($nascimento.text, formatto);
           Client c = new Client($MAIL.text, $nome.text,$password.text, $morada.text,data);
           bol = umer.registerUser((User) c, null);
           System.out.print("REGISTAR CLIENTE: " + $MAIL.text + " -> " + bol);
           System.out.println("\n");
         }
       | 'registar helicoptero' '"' matricula '"' NUMERO '(' localizacao ')' ('"' MAIL '"'|'empresa' '"' empresa '"') PONTO_VIRGULA{
           Boolean bol;
           String string = $localizacao.text;
           String[] parts = string.split(",");
           double x = Double.parseDouble(parts[0]);
           double y = Double.parseDouble(parts[1]);
           Point2D.Double position = new Point2D.Double (x,y);
           if($empresa.text ==null){
              Helicopter heli = new Helicopter($matricula.text, $NUMERO.int, position, $MAIL.text);
              bol = umer.registerVehicleP((Vehicle) heli);
              System.out.print("REGISTAR HELICOPTERO Privado: " + $matricula.text + " -> " + bol);
              System.out.println("\n");
              
           }
           else{
              Helicopter heli = new Helicopter($matricula.text, $NUMERO.int, position, $empresa.text); 
              bol = umer.registerCompanyVehicle($empresa.text,(Vehicle) heli);
              System.out.print("REGISTAR HELICOPTERO Empresa: " + $matricula.text + " -> " + bol);
              System.out.println("\n");
           } 
         }
       | 'registar carrinha' '"' matricula '"' NUMERO '(' localizacao ')' ('"' MAIL '"'|'empresa' '"' empresa '"') PONTO_VIRGULA{
           Boolean bol;
           String string = $localizacao.text;
           String[] parts = string.split(",");
           double x = Double.parseDouble(parts[0]);
           double y = Double.parseDouble(parts[1]);
           Point2D.Double position = new Point2D.Double (x,y);
           if($empresa.text ==null){
              Van van = new Van($matricula.text, $NUMERO.int, position, $MAIL.text);
              bol = umer.registerVehicleP((Vehicle) van);
              System.out.print("REGISTAR VAN Privado: " + $matricula.text + " -> " + bol);
              System.out.println("\n");
              
           }
           else{
              Van van = new Van($matricula.text, $NUMERO.int, position, $empresa.text);
              bol = umer.registerCompanyVehicle($empresa.text,(Vehicle) van);
              System.out.print("REGISTAR VAN Empresa: " + $matricula.text + " -> " + bol);
              System.out.println("\n");
           } 
         }                                                                                            
       | 'registar carro' '"' matricula '"' NUMERO '(' localizacao ')' ('"' MAIL '"'|'empresa' '"' empresa '"') PONTO_VIRGULA{
           Boolean bol;
           String string = $localizacao.text;
           String[] parts = string.split(",");
           double x = Double.parseDouble(parts[0]);
           double y = Double.parseDouble(parts[1]);
           Point2D.Double position = new Point2D.Double (x,y);
           if($empresa.text ==null){
                Car car = new Car($matricula.text, $NUMERO.int, position, $MAIL.text); 
                bol = umer.registerVehicleP((Vehicle) car);
                System.out.print("REGISTAR CARRO Privado: " + $matricula.text + " -> " + bol);
                System.out.println("\n");
              
           }
           else{
                Car car = new Car($matricula.text, $NUMERO.int, position, $empresa.text); 
                bol = umer.registerCompanyVehicle($empresa.text,(Vehicle) car);
                System.out.print("REGISTAR CARRO Empresa: " + $matricula.text + " -> " + bol);
                System.out.println("\n");
           } 
         }                                                                                       
       | 'registar mota' '"' matricula '"' NUMERO '(' localizacao ')' ('"' MAIL '"'|'empresa' '"' empresa '"') PONTO_VIRGULA{
           Boolean bol;
           String string = $localizacao.text;
           String[] parts = string.split(",");
           double x = Double.parseDouble(parts[0]);
           double y = Double.parseDouble(parts[1]);
           Point2D.Double position = new Point2D.Double (x,y);
           if($empresa.text ==null){
               Bike bike = new Bike($matricula.text, $NUMERO.int, position, $MAIL.text);
               bol = umer.registerVehicleP((Vehicle) bike);
               System.out.print("REGISTAR MOTA Privado: " + $matricula.text + " -> " + bol);
               System.out.println("\n");
              
           }
           else{
               Bike bike = new Bike($matricula.text, $NUMERO.int, position, $empresa.text); 
               bol = umer.registerCompanyVehicle($empresa.text,(Vehicle) bike);
               System.out.print("REGISTAR MOTA Empresa: " + $matricula.text + " -> " + bol);
               System.out.println("\n");
           } 
         }
       ;


/**
 *
 * ANALISADOR LEXICO
 *
 */
    
matricula : NUMERO MENOS LETRA LETRA MENOS NUMERO ;
    
localizacao :  NUMERO PONTO NUMERO VIRGULA NUMERO PONTO NUMERO ;

nome : (palavra)+;

morada : ((palavra_numero|CHAR|MENOS|PONTO)+)? VIRGULA NUMERO VIRGULA cod_postal;

cod_postal : NUMERO MENOS NUMERO (palavra_numero|MENOS|CHAR|'('|')')+ ;

nascimento : NUMERO MENOS NUMERO MENOS NUMERO ;
       
MAIL : [a-zA-Z_.+-?0-9]+ '@' [a-zA-Z]+ '.' [a-zA-Z]+ '.'? [a-zA-Z]*  ;

empresa : (palavra_numero)+;

palavra : (LETRA)+;

palavra_numero : (LETRA|NUMERO)+ ; 
        
password : (LETRA|CHAR|NUMERO|PONTO|VIRGULA|PONTO_VIRGULA|MENOS)+;

LETRA : [a-zA-ZçÇ];

CHAR: [_'+?%$&*#@!/];

PONTO : [.];

VIRGULA : [,];

PONTO_VIRGULA : [;];

MENOS : [-];

NUMERO : [0-9]+;

WS : [ \t\r\n]+ -> skip ;
