package com.intelisoft.tournamentbel.runner;

import com.intelisoft.tournamentbel.entity.*;
import com.intelisoft.tournamentbel.service.impl.*;
import java.sql.Time;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

//        Add leagues and Tournaments
        TournamentServiceImpl tournamentServiceImpl = new TournamentServiceImpl();
        LeagueServiceImpl leagueService = new LeagueServiceImpl();
        CommandsServiceImpl commandsService = new CommandsServiceImpl();
        MatchesServiceImpl matchesService = new MatchesServiceImpl();
        GoalsServiceImpl goalsService = new GoalsServiceImpl();
        PeriodsServiceImpl periodsService = new PeriodsServiceImpl();
        PlayersServiceImpl playersServiceImpl = new PlayersServiceImpl();

        Tournaments tournament1 = new Tournaments("Cup of Belarus");
        Leagues topLeague = new Leagues("Top league", tournament1);
        Leagues firstLeague = new Leagues("First league", tournament1);

//        tournamentServiceImpl.add(tournament1);
//        leagueService.add(topLeague);
//        leagueService.add(firstLeague);

//        Add commands
        Commands commandNeman = new Commands("Neman", "Grodno", "Ermakovich", 76);
        Commands commandBate = new Commands("Bate", "Borisov", "Kovalevich", 86);
        Commands commandShahter = new Commands("Shahter", "Soligorsk", "Ermakovich", 76);
        Commands commandKrumkachi = new Commands("Krumkachi", "Minsk", "Kovalevich", 86);
//        commandsService.add(commandNeman);
//        commandsService.add(commandBate);
//        commandsService.add(commandShahter);
//        commandsService.add(commandKrumkachi);

//        Add players
        Players player1 = new Players("Kovalev", "Oleg", "forward", 21, true);
        Players player2 = new Players("Ivanov", "Oleg", "defender", 20, false);
        Players player3 = new Players("Sidorov", "Den", "defender", 23, false);
        Players player4 = new Players("Popov", "Petya", "goalkeeper", 10, false);

        Players player5 = new Players("Demenkov", "Sergey", "forward", 11, true);
        Players player6 = new Players("Vasykin", "Oleg", "defender", 10, false);
        Players player7 = new Players("Petrenko", "Den", "defender", 13, false);
        Players player8 = new Players("Dub", "Petya", "goalkeeper", 12, false);

        Players player9 = new Players("Moroz", "Oleg", "forward", 21, true);
        Players player10 = new Players("Lazov", "Oleg", "defender", 20, false);
        Players player11 = new Players("Spirin", "Den", "defender", 23, false);
        Players player12 = new Players("Popovich", "Petya", "goalkeeper", 10, false);

        Players player13 = new Players("Demenov", "Sergey", "forward", 11, true);
        Players player14 = new Players("Vasukin", "Oleg", "defender", 10, false);
        Players player15 = new Players("Pet", "Den", "defender", 13, false);
        Players player16 = new Players("Dubay", "Petya", "goalkeeper", 12, false);
//      Add CommandsPlayers
        CommandsPlayers commandsPlayers1 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandNeman,player1);
        CommandsPlayers commandsPlayers2 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandNeman,player2);
        CommandsPlayers commandsPlayers3 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandNeman,player3);
        CommandsPlayers commandsPlayers4 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandNeman,player4);

        CommandsPlayers commandsPlayers5 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandBate,player5);
        CommandsPlayers commandsPlayers6 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandBate,player6);
        CommandsPlayers commandsPlayers7 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandBate,player7);
        CommandsPlayers commandsPlayers8 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandBate,player8);

        CommandsPlayers commandsPlayers9 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandKrumkachi,player9);
        CommandsPlayers commandsPlayers10 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandKrumkachi,player10);
        CommandsPlayers commandsPlayers11= new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandKrumkachi,player11);
        CommandsPlayers commandsPlayers12 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandKrumkachi,player12);

        CommandsPlayers commandsPlayers13 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandShahter,player13);
        CommandsPlayers commandsPlayers14 = new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandShahter,player14);
        CommandsPlayers commandsPlayers15= new CommandsPlayers(new java.util.Date(), new java.util.Date(), commandShahter,player15);
        CommandsPlayers commandsPlayers16 = new CommandsPlayers(new java.util.Date(),new java.util.Date(), commandShahter,player16);

        CommandsPlayersServiceImpl commandsPlayersService = new CommandsPlayersServiceImpl();
//        commandsPlayersService.add(commandsPlayers1);
//        commandsPlayersService.add(commandsPlayers2);
//        commandsPlayersService.add(commandsPlayers3);
//        commandsPlayersService.add(commandsPlayers4);
//        commandsPlayersService.add(commandsPlayers5);
//        commandsPlayersService.add(commandsPlayers6);
//        commandsPlayersService.add(commandsPlayers7);
//        commandsPlayersService.add(commandsPlayers8);
//        commandsPlayersService.add(commandsPlayers9);
//        commandsPlayersService.add(commandsPlayers10);
//        commandsPlayersService.add(commandsPlayers11);
//        commandsPlayersService.add(commandsPlayers12);
//        commandsPlayersService.add(commandsPlayers13);
//        commandsPlayersService.add(commandsPlayers14);
//        commandsPlayersService.add(commandsPlayers15);
//        commandsPlayersService.add(commandsPlayers16);

//        Add Matches,Commands
        Set<Commands> commandsMatch1 = new HashSet<Commands>();
//        commandsMatch1.add(commandNeman);
//        commandsMatch1.add(commandBate);
        Set<Commands> commandsMatch2= new HashSet<Commands>();
//        commandsMatch2.add(commandKrumkachi);
//        commandsMatch2.add(commandShahter);

        Matches matcheNemanBate = new Matches("Borisovs stadion", 0, new java.util.Date(), tournament1, commandsMatch1);
        Matches matcheKrumkachiShahter = new Matches("Soligorsks stadion", 0, new java.util.Date(), tournament1, commandsMatch2);

//        matchesService.add(matcheNemanBate);
//        matchesService.add(matcheKrumkachiShahter);

//      Add goals
        Goals goal1 = new Goals(new Time (00-00-00), player1, matcheNemanBate );
        Goals goal2 = new Goals(new Time(00-00-00), player2, matcheNemanBate );
        Goals goal3 = new Goals(new Time(00-89-30), player5, matcheNemanBate );
        Goals goal4 = new Goals(new Time(00-15-30), player9, matcheKrumkachiShahter );
        Goals goal5 = new Goals(new Time(00-34-32), player10, matcheKrumkachiShahter );
//        goalsService.add(goal1);
//        goalsService.add(goal2);
//        goalsService.add(goal3);
//        goalsService.add(goal4);
//        goalsService.add(goal5);

//      Add periods
//        Periods period1 = new Periods( Periods.NamePeriod.First, new Time (000200),matcheNemanBate );
//        Periods period2 = new Periods( Periods.NamePeriod.Second, new Time (000300),matcheNemanBate );
//
//        Periods period3 = new Periods( Periods.NamePeriod.First, new Time (000000),matcheKrumkachiShahter );
//        Periods period4 = new Periods( Periods.NamePeriod.Second, new Time (000100),matcheKrumkachiShahter );
//
//        periodsService.add(period1);
//        periodsService.add(period2);
//        periodsService.add(period3);
//        periodsService.add(period4);
        
//        Delete object
        Goals goal = new Goals();
        goal.setId(4);
        goalsService.delete(goal);

//        GetAll
        List<Goals> goals = null;
        goals = goalsService.getAll();
        for (Goals t : goals) {
            System.out.println(t);
        }

//        GetById
         System.out.println(goalsService.getById(1));

//      Add player
        playersServiceImpl.add(player3);
        playersServiceImpl.delete(player3);

    //founByName
        playersServiceImpl.foundByName();
//  getWithCommand
        playersServiceImpl.getWithCommand();
   }
}
