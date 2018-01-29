/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  felipe
 * Created: Jan 23, 2018
 */
\! clear
drop database back;
create database back;
use back;

create table tb_customer_account(
    id_customer integer not null,
    cpf_cnpj varchar(30) not null,
    nm_customer varchar(60) not null,
    is_active boolean not null,
    vl_total double,
    constraint primary key (id_customer)
);

desc tb_customer_account;
select * from tb_customer_account;

insert into tb_customer_account (cpf_cnpj,nm_customer,is_active,vl_total)
    values("4444444444","João da Silva",true,560);