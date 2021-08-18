drop table if exists User;
drop table if exists Appointment;
drop table if exists Trainer;
drop table if exists Physiotherapist;

create table User(
User_ID INT NOT NULL,
UserName varchar(255),
DOB date,
MobNumber int,
Email varchar(30),
Address varchar(255),
PRIMARY KEY(User_ID)
);

create table Trainer(
Trainer_ID int NOT NULL PRIMARY KEY,
TrainerGender varchar(15),
TrainerName varchar(255)
);

create table Physiotherapist(
Physio_ID int not null PRIMARY KEY,
PhysioName varchar(255)
);

create table Appointment(
Appointment_ID int not null PRIMARY KEY,
User_ID int,
Package varchar(255),
DateOfAppointment date,
PhysioRequired varchar(255),
Trainer_ID int NOT NULL,
Physio_ID int not null,
FOREIGN KEY(User_ID) REFERENCES User(User_ID),
FOREIGN KEY(Trainer_ID) REFERENCES Trainer(Trainer_ID),
FOREIGN KEY(Physio_ID) REFERENCES Physiotherapist(Physio_ID)
);