CREATE TABLE train (
    train_id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    monday int,
	tuesday int,
	wednesday int,
	thurseday int,
	friday int,
	saturday int,
	sunday int,
	class_1 FLOAT,
	class_2 FLOAT,
	class_3 FLOAT,
	tfrom varchar(255),
	tto varchar(255),
	arrival_time varchar(255),
	depature_time varchar(255),
	CONSTRAINT pk_train PRIMARY KEY (train_id)
);

CREATE TABLE place (
    place_id int NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    CONSTRAINT pk_place PRIMARY KEY (place_id)
);

CREATE TABLE train_place (
    train_place_id int NOT NULL AUTO_INCREMENT,
	 place_id int NOT NULL,
	 train_id int NOT NULL,
	 arrivalTime TIME,
	 depatureTime TIME,
    CONSTRAINT pk_train_place_map PRIMARY KEY (train_place_id),
    CONSTRAINT fk_train_place_map_1 FOREIGN KEY (place_id) REFERENCES place(place_id),
    CONSTRAINT fk_train_place_map_2 FOREIGN KEY (train_id) REFERENCES train(train_id)
);

CREATE TABLE user (
    id int NOT NULL AUTO_INCREMENT,
	user_name varchar(255) NOT NULL,
    fname varchar(255) NOT NULL,
    lname varchar(255),
    email varchar(255) NOT NULL unique,
	user_password varchar(255) NOT NULL,
	phone_number BIGINT,
	nic_no BIGINT(20) NULL DEFAULT NULL,
	CONSTRAINT pk_user PRIMARY KEY (id)
);

CREATE TABLE ticket (
    ticket_id int NOT NULL AUTO_INCREMENT,
	train_id int NOT NULL,
	user_id int NOT NULL,
	amount FLOAT,
	arrival_time varchar(255),
	depature_time varchar(255),
	no_of_ticket int,
	message TEXT,
	tclass int,
    CONSTRAINT pk_ticket PRIMARY KEY (ticket_id),
    CONSTRAINT fk_ticket_1 FOREIGN KEY (user_id) REFERENCES user(id),
    CONSTRAINT fk_ticket_2 FOREIGN KEY (train_id) REFERENCES train(train_id)
);


CREATE TABLE payment (
    payment_id int NOT NULL AUTO_INCREMENT,
	 ticket_id int NOT NULL,
	 payment_methode int NOT NULL,
	 phone_no BIGINT NOT NULL,
    CONSTRAINT pk_payment PRIMARY KEY (payment_id),
    CONSTRAINT fk_payment FOREIGN KEY (ticket_id) REFERENCES ticket(ticket_id)
);
