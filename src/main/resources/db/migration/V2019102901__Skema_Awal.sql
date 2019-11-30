create table product (
    id varchar(36),
    code varchar(100) not null,
    name varchar(255) not null,
    primary key (id),
    unique (code)
);