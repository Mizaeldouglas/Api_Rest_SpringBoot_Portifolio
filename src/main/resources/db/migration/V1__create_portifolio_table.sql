create table portifolio (
  id bigint not null auto_increment,

  name varchar(255) not null,
  technology varchar(255) not null,
  title varchar(255) not null,
  description varchar(255) not null,
  imageurl varchar(255) not null,

  primary key(id)
);
