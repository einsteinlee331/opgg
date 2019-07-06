DROP TABLE IF EXISTS customers;
Create Table customers (
id INT AUTO_INCREMENT PRIMARY KEY,
customer_id varchar(255) UNIQUE NOT NULL,
pass_word varchar(255) NOT NULL,
password_confirm varchar(255) NOT NULL,
customer_name varchar(200) NOT NULL,
dateof_birth varchar(255) NOT NULL,
email_address varchar(255) NOT NULL,
phone_numers varchar(255) NOT NULL
)DEFAULT CHARSET=utf8;

-- insert into customers(customer_id,pass_word,password_confirm,customer_name,dateof_birth,email_address,phone_numers)values('a','b','c','d','e','f','g');

commit;