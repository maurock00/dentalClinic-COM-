/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     16-May-16 10:55:31 PM                        */
/*==============================================================*/


drop table if exists ADMINISTRADOR;

drop table if exists DIENTE;

drop table if exists HISTORIACLINICA;

drop table if exists PACIENTE;

drop table if exists USUARIO;

/*==============================================================*/
/* Table: ADMINISTRADOR                                         */
/*==============================================================*/
create table ADMINISTRADOR
(
   CODIGOADMINISTRADOR  int not null auto_increment,
   NOMBREADMINISTRADOR  char(100) not null,
   CLAVEADMINISTRADOR   char(20) not null,
   primary key (CODIGOADMINISTRADOR)
);

/*==============================================================*/
/* Table: DIENTE                                                */
/*==============================================================*/
create table DIENTE
(
   CODIGODIENTE         int not null auto_increment,
   CODIGOHISTORIACLINICA char(20),
   INDICEDIENTE        char(2) not null,
   DIAGNOSTICODIENTE    char(150),
   TRATAMIENTODIENTE    char(150),
   FECHAREVISIONDIENTE  date,
   CARAA                bool,
   CARAB                bool,
   CARAC                bool,
   CARAD                bool,
   CARAE                bool,
   primary key (CODIGODIENTE)
);

/*==============================================================*/
/* Table: HISTORIACLINICA                                       */
/*==============================================================*/
create table HISTORIACLINICA
(
   CODIGOHISTORIACLINICA char(20) not null,
   CODIGOPACIENTE       char(10),
   CODIGOUSUARIO        char(10),
   FECHAHISTORIACLINICA date not null,
   P1                   char(100),
   P2                   char(100),
   P3                   char(100),
   P4                   int,
   P5                   int,
   P6                   char(100),
   P7                   char(100),
   P8                   int,
   P9                   int,
   P10                  int,
   P11                  char(100),
   P12                  char(255),
   P13                  int,
   P14                  int,
   P15                  int,
   P16                  int,
   P17                  char(255),
   P18                  char(255),
   P19                  char(255),
   P20                  char(255),
   P21                  char(255),
   P22                  char(255),
   P23                  char(255),
   primary key (CODIGOHISTORIACLINICA)
);

/*==============================================================*/
/* Table: PACIENTE                                              */
/*==============================================================*/
create table PACIENTE
(
   CODIGOPACIENTE       char(10) not null,
   CLAVENOPACIENTE      char(20),
   NOMBREPACIENTE       char(50),
   APELLIDOPACIENTE     char(50),
   FECHANACIMIENTOPACIENTE date,
   EMPRESAPACIENTE      char(150),
   TELEFONOPACIENTE     char(15),
   OCUPACIONPACIENTE    char(150),
   primary key (CODIGOPACIENTE)
);

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO
(
   CODIGOUSUARIO        char(10) not null,
   NOMBREUSUARIO        char(50),
   APELLIDOUSUARIO      char(50),
   ESPECIALIDADUSUARIO  char(150),
   CELULARUSUARIO       char(15),
   DIRECCIONUSUARIO     char(150),
   primary key (CODIGOUSUARIO)
);

alter table DIENTE add constraint FK_ADJUNTA foreign key (CODIGOHISTORIACLINICA)
      references HISTORIACLINICA (CODIGOHISTORIACLINICA) on delete restrict on update restrict;

alter table HISTORIACLINICA add constraint FK_SIGUE foreign key (CODIGOUSUARIO)
      references USUARIO (CODIGOUSUARIO) on delete restrict on update restrict;

alter table HISTORIACLINICA add constraint FK_TIENE foreign key (CODIGOPACIENTE)
      references PACIENTE (CODIGOPACIENTE) on delete restrict on update restrict;

