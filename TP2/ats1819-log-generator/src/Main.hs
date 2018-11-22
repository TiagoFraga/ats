module Main where

import CodigosPostais
import Nomes
import Data.Char

import Control.Monad
import Control.Monad.State.Strict
import Test.QuickCheck


-- *******************************************
--  | FUNÇÃO PRINCIPAL |
-- *******************************************

main :: IO ()
main = do
  cps <- codigosPostais "codigos_postais.csv"
  samples <- generate $ runGeneration cps (genLogs)
  putStr $ unlines $ filter (/="") samples
  --print st

genLogs = replicateM 1000 $ do
  g <- lift $ frequency
    [(10,return genRegistarCondutor)
    ,(10,return genRegistarCliente)
    ,(5,return genRegistarEmpresa)
    ,(7,return genCliente)
    ,(7,return genCondutor)
    ,(4,return genRegistarCarrinhaCondutor)
    ,(1,return genRegistarCarrinhaEmpresa)
    ,(4,return genRegistarCarroCondutor)
    ,(1,return genRegistarCarroEmpresa)
    ,(4,return genRegistarMotaCondutor)
    ,(1,return genRegistarMotaEmpresa)
    ,(4,return genRegistarHelicopteroCondutor)
    ,(1,return genRegistarHelicopteroEmpresa)
    ] :: StGen (StGen String)
  g

-- *******************************************
--  | ESTADO DO GERADOR DE LOGS |
-- *******************************************

-- | Tipo do gerador com estado.
type StGen a = StateT GenState Gen a


-- | Estado do gerador.
data GenState
  = GenState
  { stLocalidades :: [CodigoPostal]
    , nemp :: Int
    , stempresas ::  [String]
    , stclientes :: [(String,String)]
    , sttaxis :: [(String,Int)]
    , stcondutores :: [(String,String)]
  }deriving Show


-- | Estado por pré-definido para o gerado.
defaultGenState :: GenState
defaultGenState
  = GenState 
  { stLocalidades = []
    , nemp = 0
    , stempresas = []
    , stclientes = []
    , sttaxis = []
    , stcondutores = []
  }


-- | Executa um gerador com estado.
runGeneration :: [CodigoPostal] -> StGen a -> Gen a 
runGeneration localidades g = evalStateT g defaultGenState { stLocalidades = localidades }


-- *******************************************
--  | GERADORES |
-- *******************************************


-- ****************
-- Geradores para a ação : Registar Empresa
-- ****************

genRegistarEmpresa :: StGen String
genRegistarEmpresa = do
  n <- gets nemp
  let nome = "Empresa " ++ show n
  modify (\ st -> st { nemp = n + 1 , stempresas = nome : stempresas st})
  lista <- gets stempresas
  empresa <- lift $ elements lista 
  password <- lift $ vectorOf 9 $ elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'])
  return $ "registar empresa" ++ " "  ++ "\"" ++  empresa ++ "\"" ++ " " ++ "\"" ++ password ++ "\"" ++ " ;\n"


-- ****************
-- Geradores para a ação : Registar Cliente
-- ****************

genRegistarCliente :: StGen String
genRegistarCliente = do
  name <- lift $ elements listaNomes 
  apelido <- lift $ elements listaApelidos
  let firstMail = name ++ "_" ++ apelido
  secondMail <- lift $ elements ["@hotmail.com","@gmail.com","@mail.google.com","@sapo.pt","@outlook.com"]
  password <- lift $ vectorOf 9 $ elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'])
  let guardarMail = firstMail ++ secondMail
  modify (\ st -> st { stclientes = (guardarMail,password) : stclientes st})
  localidades <- gets stLocalidades
  loc <- lift $ elements localidades
  num <- lift $ choose (1::Int, 2500)
  ano <- lift $ elements [1900..2017]
  mes <- lift $ elements [1..12]
  dia <- lift $ elements [1..31]
  firstCoord <- lift $ elements[1..100]
  secondCoord <- lift $ elements[0..9]
  thirdCoord <- lift $ elements[1..100]
  fourthCoord <- lift $ elements[0..9]
  return $ "registar cliente" ++ " " ++ 
              "\"" ++ firstMail ++ secondMail ++ "\"" ++ " " ++
              "\"" ++ name ++ " " ++ apelido ++ "\"" ++ " " ++
              "\"" ++ password ++ "\"" ++ " " ++
              "\"" ++ cpRua loc ++ ", " ++ show num ++ ", " ++ cpCodigo loc ++ " " ++ cpLocalidade loc ++ "\"" ++ " " ++
              (show ano) ++ "-" ++ (show mes) ++ "-" ++ (show dia) ++ " " ++
              "(" ++ (show firstCoord) ++ "." ++ (show secondCoord) ++ "," ++ (show thirdCoord) ++ "." ++ (show fourthCoord) ++ ")" ++ " " ++ ";\n"


-- ****************
-- Geradores para a ação : Registar Condutor
-- ****************

genRegistarCondutor :: StGen String
genRegistarCondutor  = do
  name <- lift $ elements listaNomes 
  apelido <- lift $ elements listaApelidos
  let firstMail = name ++ "_" ++ apelido
  secondMail <- lift $ elements ["@hotmail.com","@gmail.com","@mail.google.com","@sapo.pt","@outlook.com"]
  password <- lift $ vectorOf 9 $ elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'])
  let guardarMail = firstMail ++ secondMail
  modify (\ st -> st { stcondutores = (guardarMail,password) : stcondutores st})
  localidades <- gets stLocalidades
  loc <- lift $ elements localidades
  num <- lift $ choose (1::Int, 2500)
  ano <- lift $ elements [1900..2017]
  mes <- lift $ elements [1..12]
  dia <- lift $ elements [1..31]
  taxi <- lift $ elements [1..500]
  let guardarMail = firstMail ++ secondMail
  modify (\ st -> st { sttaxis = (guardarMail,taxi) : sttaxis st})
  return $ "registar condutor" ++ " " ++ 
              "\"" ++ firstMail ++ secondMail ++ "\"" ++ " " ++
              "\"" ++ name ++ " " ++ apelido ++ "\"" ++ " " ++
              "\"" ++ password ++ "\"" ++ " " ++
              "\"" ++ cpRua loc ++ ", " ++ show num ++ ", " ++ cpCodigo loc ++ " " ++ cpLocalidade loc ++ "\"" ++ " " ++
              (show ano) ++ "-" ++ (show mes) ++ "-" ++ (show dia) ++ " " ++ 
              (show taxi) ++ " " ++ ";\n"


-- ****************
-- Geradores para a ação : Solicitar -> Cliente
-- ****************

printElemes :: [String] -> Int -> String
printElemes _ 0 = ""
printElemes (h:t) n = h ++ "\n" ++ printElemes t (n-1)

genCliente :: StGen String
genCliente = do
  login <- genLoginCliente
  if login == "" then return $ ""
    else do
     -- cliente <- lift $ login 

      times <- lift $ choose(1::Int,5)
      solicitar <- replicateM times genSolicitar
      return $ login ++ " \n" ++ printElemes solicitar times ++ "logout ;\n" 


genCondutor :: StGen String
genCondutor = do 
  login <- genLoginCondutor
  if login == "" then return $ ""
    else do
      times <- lift $ choose(1::Int,10)
      genTimes <- replicateM times $ do
          g <- lift $ frequency
            [(3,return genViajar)
            ,(1,return genRecusarViagem)
            ] :: StGen (StGen String)
          g
      return $ login ++ "\n" ++ printElemes genTimes times ++ "logout ;\n"

genSolicitar :: StGen String
genSolicitar = do
  firstCoord <- lift $ elements[1..100]
  secondCoord <- lift $ elements[0..9]
  thirdCoord <- lift $ elements[1..100]
  fourthCoord <- lift $ elements[0..9]
  return $ "solicitar" ++ " " ++
                "(" ++ (show firstCoord) ++ "." ++ (show secondCoord) ++ "," ++ (show thirdCoord) ++ "." ++ (show fourthCoord) ++ ")" ++ " " ++ ";"


-- ****************
-- Geradores para a ação : Viajar -> Condutor
-- ****************

genViajar :: StGen String
genViajar = do
  return $ "viajar" ++ ";"


-- ****************
-- Geradores para a ação : Recusar Viagem -> Condutor
-- ****************

genRecusarViagem :: StGen String
genRecusarViagem = do
  return $ "recusar viagem" ++ ";"


-- ****************
-- Geradores para a ação : Login
-- ****************

genLoginCliente :: StGen String
genLoginCliente = do
  clientes <- gets stclientes
  if clientes == [] then return $ ""
  else do
    (a,b) <- lift $ elements clientes
    return $ "login" ++ " " ++
              "\"" ++ a ++ "\"" ++ " " ++
              "\"" ++ b ++ "\"" ++ " " ++ ";"


genLoginCondutor :: StGen String
genLoginCondutor = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    return $ "login" ++ " " ++
              "\"" ++ a ++ "\"" ++ " " ++
              "\"" ++ b ++ "\"" ++ " " ++ ";"


-- ****************
-- Geradores para a ação : Registar Carrinha
-- ****************

genRegistarCarrinhaCondutor :: StGen String
genRegistarCarrinhaCondutor = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    return $ "registar carrinha " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "\""++a++"\"" ++ " " ++ ";\n"


genRegistarCarrinhaEmpresa :: StGen String
genRegistarCarrinhaEmpresa = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    empresas <- gets stempresas
    if empresas == [] then return $ ""
    else do
      empresa <- lift $ elements empresas
      return $ "registar carrinha " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "empresa " ++
                "\"" ++ empresa ++ "\"" ++ " " ++ ";\n"


-- ****************
-- Geradores para a ação : Registar Carro
-- ****************

genRegistarCarroCondutor :: StGen String
genRegistarCarroCondutor = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    return $ "registar carro " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "\""++a++"\""  ++ " " ++ ";\n"


genRegistarCarroEmpresa :: StGen String
genRegistarCarroEmpresa = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    empresas <- gets stempresas
    if empresas == [] then return $ ""
    else do
      empresa <- lift $ elements empresas
      return $ "registar carro " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "empresa " ++
                "\"" ++ empresa ++ "\"" ++ " " ++ ";\n"


-- ****************
-- Geradores para a ação : Registar Mota
-- ****************

genRegistarMotaCondutor :: StGen String
genRegistarMotaCondutor = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    return $ "registar mota " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "\""++a++"\""  ++ " " ++ ";\n"


genRegistarMotaEmpresa :: StGen String
genRegistarMotaEmpresa = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    empresas <- gets stempresas
    if empresas == [] then return $ ""
    else do
      empresa <- lift $ elements empresas
      return $ "registar mota " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "empresa " ++
                "\"" ++ empresa ++ "\"" ++ " " ++ ";\n"


-- ****************
-- Geradores para a ação : Registar Helicoptero
-- ****************

genRegistarHelicopteroCondutor :: StGen String
genRegistarHelicopteroCondutor = do
  condutores <- gets stcondutores
  if condutores == [] then return $ ""
  else do
    (a,b) <- lift $ elements condutores
    num <- lift $ elements[30..90]
    first <- lift $ elements[0..9]
    second <- lift $ elements[0..9]
    letra1 <- lift $ elements['A'..'Z']
    letra2 <- lift $ elements['A'..'Z']
    third <- lift $ elements[0..9]
    fourth <- lift $ elements[0..9]
    firstCoord <- lift $ elements[1..100]
    secondCoord <- lift $ elements[0..9]
    thirdCoord <- lift $ elements[1..100]
    fourthCoord <- lift $ elements[0..9]
    return $ "registar helicoptero " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "\""++a++"\""  ++ " " ++ ";\n"


genRegistarHelicopteroEmpresa :: StGen String
genRegistarHelicopteroEmpresa = do
  num <- lift $ elements[30..90]
  first <- lift $ elements[0..9]
  second <- lift $ elements[0..9]
  letra1 <- lift $ elements['A'..'Z']
  letra2 <- lift $ elements['A'..'Z']
  third <- lift $ elements[0..9]
  fourth <- lift $ elements[0..9]
  firstCoord <- lift $ elements[1..100]
  secondCoord <- lift $ elements[0..9]
  thirdCoord <- lift $ elements[1..100]
  fourthCoord <- lift $ elements[0..9]
  empresas <- gets stempresas
  if empresas == [] then return $ ""
  else do
    empresa <- lift $ elements empresas
    return $ "registar helicoptero " ++ 
                "\"" ++ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth) ++ "\"" ++ " " ++
                (show num) ++ " " ++ 
                "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")" ++  " " ++ 
                "empresa " ++
                "\"" ++ empresa ++ "\"" ++ " " ++ ";\n"



































-- **************************************************************************************************
-- **************************************************************************************************
-- **************************************************************************************************



{-
-- Gerador de um nome, primeiro nome e ultimo nome
genNomes :: StGen String
genNomes = do 
  name <- lift $ elements listaNomes 
  apelido <- lift $ elements listaApelidos 
  return $ name ++ "," ++ apelido

--Gerador de uma password 
genPassword :: StGen String
genPassword = do
  password <- lift $ vectorOf 9 $ elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'])
  return password

--Gerador de uma data de nascimento
genData :: StGen String
genData = do
  ano <- lift $ elements [1900..2017]
  mes <- lift $ elements [1..12]
  dia <- lift $ elements [1..31]
  return $ (show ano) ++ "-" ++ (show mes) ++ "-" ++ (show dia)


--Gerador para uma coordenada
genCoordenada :: StGen String
genCoordenada = do
  first <- lift $ elements[1..100]
  second <- lift $ elements[0..9]
  third <- lift $ elements[1..100]
  fourth <- lift $ elements[0..9]
  return $ "(" ++ (show first) ++ "." ++ (show second) ++ "," ++ (show third) ++ "." ++ (show fourth) ++ ")"


--Gerador para um Mail
genMail :: StGen String
genMail = do
  name <- lift $ vectorOf 7 $ (elements (['a'..'z'] ++ ['A'..'Z'] ++ ['0'..'9'] ++ ['_','.','-']))
  mail <- lift $ elements ["@hotmail.com","@gmail.com","@mail.google.com","@sapo.pt","@outlook.com"]
  return $ name ++ mail


--Gerador para uma matricula
genMatricula :: StGen String
genMatricula = do
  first <- lift $ elements[0..9]
  second <- lift $ elements[0..9]
  letra1 <- lift $ elements['A'..'Z']
  letra2 <- lift $ elements['A'..'Z']
  third <- lift $ elements[0..9]
  fourth <- lift $ elements[0..9]
  return $ (show first) ++ (show second) ++ "-" ++ [letra1,letra2] ++ "-" ++ (show third) ++ (show fourth)


--Gerador para uma morada
genMorada :: StGen String
genMorada = do
  -- busca a lista de códigos postais
  localidades <- gets stLocalidades
  -- selecciona uma das localidades
  loc <- lift $ elements localidades
  -- gera um número de polícia
  num <- lift $ choose (1::Int, 2500)
  -- retorna uma representação textual da morada
  return $ cpRua loc ++ ", " ++ show num ++ ", " ++ cpCodigo loc ++ " " ++ cpLocalidade loc


runDefault :: StGen a -> Gen (a,GenState) 
runDefault g = runStateT g defaultGenState
-}
