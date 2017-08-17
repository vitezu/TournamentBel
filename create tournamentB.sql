CREATE DATABASE IF NOT EXISTS tournamentBel;
use tournamentBel;

create table tournaments (
id int not null auto_increment,
name_tournaments varchar(30) not null,
primary key (id)
);
#insert	into tournaments (name_tournaments) values ('Chempionship of Belarus');
#insert	into tournaments (name_tournaments) values ('Cup of Belarus');



create table leagues (
id int not null auto_increment,
name_leagues varchar(15) not null,
tournament_id int not null,
primary key (id),
foreign key (tournament_id) references tournaments (id)
);
#insert	into leagues (name_leagues, tournament_id) values ('Top league', 1);

create table matches (
id int not null auto_increment,
place varchar(30) not null,
num_card int null,
date_match date not null,
tournament_id int not null,
primary key (id),
foreign key (tournament_id) references tournaments (id)
);
#insert	into matches (place, num_card, date_match, tournament_id) values ('Borisov stadium', 1, 20170625, 1);


create table commands (
id int not null auto_increment,
name_command varchar(15) not null,
city varchar(15) not null,
trainer varchar(15) not null,
rating int not null,
primary key (id)
); 

#insert	into commands (name_command, city, trainer, rating) values ('BATE', 'Borisov', 'Ermakovich', 87);
#insert	into commands (name_command, city, trainer, rating) values ('Neman', 'Grodno', 'Kovalevich', 76);



create table periods (
id int not null auto_increment,
name_period int not null,
added_time time null,
match_id int not null,
primary key (id),
foreign key (match_id) references matches (id)
);


create table players (
id int not null auto_increment,
last_name varchar(15) not null,
first_name varchar(15) not null,
type_player varchar(15) not null,
num_player int not null,
commander bool not null,
primary key (id)
);

#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Chernih', 'Alexsey', 'goalkkeper', 30, true);
#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Gayduchik', 'Vitaliy', 'defender', 14, false);
#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Malkevich', 'Vladislav', 'defender', 44, false);

#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Gurov', 'Vladimir', 'goalkkeper', 13, true);
#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Anukevich', 'Alexander', 'defender', 14, false);
#insert	into players (last_name, first_name, type_player,num_player, commander) values ('Gorbach', 'Andrey', 'defender', 17, false);

create table goals (
id int not null auto_increment,
time_goal time not null,
player_id int not null,
match_id int not null,
primary key (id),
foreign key (player_id) references players (id),
foreign key (match_id) references matches (id)
);

create table matches_commands (
id int not null auto_increment,
match_id int not null,
command_id int not null,
primary key (id),
foreign key (match_id) references matches (id),
foreign key (command_id) references commands (id)
);


create table commands_players (
id int not null auto_increment,
command_id int not null,
player_id int not null,
date_beging date null,
date_ended date null,
primary key (id),
foreign key (command_id) references commands (id),
foreign key (player_id) references players (id)
);

#insert	into commands_players (command_id, player_id, date_beging, date_ended) values (1, 1, 20160312, 20160312);
