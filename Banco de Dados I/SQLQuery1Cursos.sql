

USE bdCurso

--DROP DATABASE bdCurso

CREATE TABLE tbTurma(
	idTurma INT PRIMARY KEY
	,idAluno INT FOREIGN KEY REFERENCES tbAluno (idAluno)
	,idProfessor INT FOREIGN KEY REFERENCES tbProfessor (idProfessor)
)

CREATE TABLE tbCursos(
	idCursos INT PRIMARY KEY
	,nomeCursos VARCHAR (20) NOT NULL
	,descricaoCursos VARCHAR (100) 
	,cargahorariaCursos TIME
	,idTurma INT FOREIGN KEY REFERENCES tbTurma(idTurma)
)



CREATE TABLE tbMatricula(
    idMatricula INT PRIMARY KEY
	,dataMatricula DATE
	,statusMatricula VARCHAR (30)NOT NULL
	,idAluno INT FOREIGN KEY
	,idCursos INT FOREIGN KEY
)

CREATE TABLE tbAluno(
	idAluno INT PRIMARY KEY
	,nomeAluno VARCHAR (50) NOT NULL
	,emailAluno VARCHAR (50) NOT NULL
	,datanascimentoAluno DATE 
);

CREATE TABLE tbTelefoneAluno(
	idTelefoneALuno INT PRIMARY KEY
	,idALuno INT FOREIGN KEY REFERENCES tbAluno (idAluno)
)


CREATE TABLE tbTelefoneProfessor(
	idTelefoneProfessor INT PRIMARY KEY
	,numTelefoneProfessor CHAR(11) NOT NULL
)


CREATE TABLE  tbProfessor(
	idProfessor INT PRIMARY KEY
	,nomeProfessor VARCHAR(50) NOT NULL
	,emailProfessor VARCHAR(50) NOT NULL
	,idTelefoneProfessor INT FOREIGN KEY REFERENCES tbTelefoneProfessor (idTelefoneProfessor)
)


CREATE TABLE tbEspecialidades(
  idEspecialidades INT PRIMARY KEY
  ,idProfessor INT FOREIGN KEY REFERENCES tbProfessor(idProfessor)
  )
