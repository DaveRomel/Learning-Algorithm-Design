DROP TABLE IF EXISTS students;

CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    surname VARCHAR(20) NOT NULL,
    gender VARCHAR (20) NOT NULL,
    birthday VARCHAR (20) NOT NULL,
    city VARCHAR (20) NOT NULL,
    career VARCHAR (20) NOT NULL,
    email VARCHAR (20) NOT NULL,
    user VARCHAR (20) NOT NULL,
    pass VARCHAR (20) NOT NULL,
    rol INT NOT NULL,
    score FLOAT NOT NULL
);

insert into students(name, surname, gender, birthday, city, career, email, user, pass, rol, score) values
('Carlos', 'López', 'Male', '01/02/90', 'Victoria', 'Computación', 'carlo@utm.mx', 'Carlos2', 'Lopez23', 2, 9.2);
