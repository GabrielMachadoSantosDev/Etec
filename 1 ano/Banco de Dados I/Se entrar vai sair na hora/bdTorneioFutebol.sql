CREATE DATABASE bdTorneioFutebol

USE bdTorneioFutebol
--DROP DATABASE bdTorneioFutebol

CREATE TABLE tbJogo(
  codJogo INT PRIMARY KEY
   ,dataJogo DATE 
   ,horaJogo TIME 
   ,visitanteEquipe INT FOREIGN KEY REFERENCES tbEquipe(visitanteEquipe)
   ,casaEquipe INT FOREIGN KEY REFERENCES tbEquipe(casaEquipe)
)

CREATE TABLE tbEquipe(
  codEquipe INT PRIMARY KEY IDENTITY (1,1)
   ,nomeEquipe VARCHAR(70) NOT NULL
   ,bairroEquipe VARCHAR (30)
   ,cidadeEquipe VARCHAR (30)
   ,ufEquipe VARCHAR (50)
   ,visitanteEquipe VARCHAR (30)
   ,casaEquipe VARCHAR (30)
 )

CREATE TABLE tbJogador(
  codJogador INT PRIMARY KEY IDENTITY (1,1) 
  ,nomeJogador VARCHAR (50)
  ,rgJogador CHAR (9)
  ,dtaNascJogador DATE
  ,codEquipe INT FOREIGN KEY REFERENCES tbEquipe(codEquipe)
)

CREATE TABLE tbFoneEquipe (
	codFoneEquipe INT PRIMARY KEY IDENTITY (1,1)
	,numFoneEquipe CHAR(11)
	,contatoFoneEquipe CHAR(11)
	,codEquipe INT FOREIGN KEY REFERENCES tbEquipe(codEquipe)
)

CREATE TABLE tbCartao(
  codCartao INT PRIMARY KEY IDENTITY (1,1)
  ,codTipoCartao INT FOREIGN KEY REFERENCES tbTipoCartao (codTipoCartao)
  ,codJogador INT FOREIGN KEY REFERENCES tbJogador (codJogador)
  ,dataCartao DATE
)

CREATE TABLE tbSumula(
  codSumula INT PRIMARY KEY 
  ,observacoesSumula VARCHAR(200)
  ,codJogo INT FOREIGN KEY REFERENCES tbJogo (codJogo)
  ,codCartao INT FOREIGN KEY REFERENCES tbCartao (codCartao)
)

CREATE TABLE tbTipoCartao(
  codTipoCartao INT PRIMARY KEY
  ,descTipoCartao VARCHAR (100)
)

CREATE TABLE tbArtilharia(
  codArtilharia INT PRIMARY KEY
  codJogador INT FOREIGN KEY REFERENCES tbJogador (codJogador)
)

