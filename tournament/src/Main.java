import tournament.Llave;
import tournament.Match;
import tournament.Player;
import tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String [] playersA = {"Messi", "DiMaria", "Isabel", "Isaac"};
        Team teamA = new Team("Equipo A",playersA);

        String [] playersB = {"Tomas", "Jogher", "Paco", "Franco"};
        Team teamB = new Team("Equipos B",playersB);

        String [] playersC = {"Almada", "Dybala", "DePaul", "MacAllister"};
        Team teamC = new Team("Equipo C", playersC);

        String [] playersD = {"Pepe", "Lucio", "Mario", "Luigi"};
        Team teamD = new Team("Equipo D", playersD);

        String [] playersE = {"Ana", "Carlos", "Sofia", "Javier", "Javier","Mariana"};
        Team teamE = new Team("Equipo E", playersE);

        String [] PlayersF = {"Laura", "Diego", "Valentina", "Alejandro", "Gabriela"};
        Team teamF = new Team("Equipo F", PlayersF);

        String [] playersG = {"Juancito","Roman","Cordoba","Clemente","Diaz"};
        Team teamG = new Team("Equipo G", playersG);

        String [] playersH = {"Aymar","Palermo","Cruz","Nacho","Ruben"};
        Team teamH = new Team("Equipo H", playersH);

       teamA.showMembers();
       teamB.showMembers();

       Llave cuartosFinal = new Llave();

       ArrayList<Team> equiposCuarto= new ArrayList<Team>();
       equiposCuarto.add(teamA);
       equiposCuarto.add(teamB);
       equiposCuarto.add(teamC);
       equiposCuarto.add(teamD);
       equiposCuarto.add(teamE);
       equiposCuarto.add(teamF);
       equiposCuarto.add(teamG);
       equiposCuarto.add(teamH);



       ArrayList<Match> partidosCuarto = new ArrayList<Match>();
       partidosCuarto.add(new Match(equiposCuarto.get(0), equiposCuarto.get(1)));
       partidosCuarto.add(new Match(equiposCuarto.get(2), equiposCuarto.get(3)));
       partidosCuarto.add(new Match(equiposCuarto.get(4), equiposCuarto.get(5)));
       partidosCuarto.add(new Match(equiposCuarto.get(6), equiposCuarto.get(7)));

        ArrayList<Team> equiposSemi= new ArrayList<Team>();


        partidosCuarto.get(0).makeLocalGoal(1);
        partidosCuarto.get(0).makeVisitantGoal(2);
        partidosCuarto.get(0).makeVisitantGoal(3);
        equiposSemi.add(Match.getWinner(partidosCuarto.get(0)));

        partidosCuarto.get(1).makeLocalGoal(0);
        equiposSemi.add(Match.getWinner(partidosCuarto.get(1)));

        partidosCuarto.get(2).makeVisitantGoal(1);
        partidosCuarto.get(2).makeVisitantGoal(2);
        partidosCuarto.get(2).makeLocalGoal(0);
        partidosCuarto.get(2).makeLocalGoal(3);
        partidosCuarto.get(2).makeLocalGoal(2);
        equiposSemi.add(Match.getWinner(partidosCuarto.get(2)));

        partidosCuarto.get(3).makeLocalGoal(2);
        partidosCuarto.get(3).makeVisitantGoal(0);
        partidosCuarto.get(3).makeVisitantGoal(1);
        partidosCuarto.get(3).makeLocalGoal(3);
        equiposSemi.add(Match.getWinner(partidosCuarto.get(3)));

        for (Team team: equiposSemi) {
            System.out.println(equiposSemi);
        }

    }
}