import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Run {

	public static void main(String[] args) throws IOException {
		DefaultTreeNode active = new DefaultTreeNode("Active",0,1);
		DefaultTreeNode passive = new DefaultTreeNode("Passive",1,1);
		ArrayList<SimpleTreeNode> sons = new ArrayList<SimpleTreeNode>();
		DefaultTreeNode sport = new DefaultTreeNode("Sport",0,2);
		DefaultTreeNode extrem = new DefaultTreeNode("Extrem",1,2);
		DefaultTreeNode spiele = new DefaultTreeNode("Spiele",2,2);
		DefaultTreeNode unterhaltung = new DefaultTreeNode("Unterhaltung",3,2);
		
		active.addChild(sport);
		active.addChild(extrem);
		passive.addChild(spiele);
		passive.addChild(unterhaltung);
		
		DefaultTreeNode teamsport = new DefaultTreeNode("TeamSport",0,3);
		DefaultTreeNode einzelsp = new DefaultTreeNode("EinzelSport",1,3);
		DefaultTreeNode Extrem = new DefaultTreeNode("Extrem",2,3);
		DefaultTreeNode tabelspiele = new DefaultTreeNode("TabellenSpiele",3,3);
		DefaultTreeNode PcGames = new DefaultTreeNode("PcGames",4,3);
		DefaultTreeNode Andere = new DefaultTreeNode("Andere",5,3);
		DefaultTreeNode music = new DefaultTreeNode("Music",6,3);
		DefaultTreeNode films = new DefaultTreeNode("Films",7,3);
		DefaultTreeNode Tv = new DefaultTreeNode("Tv",8,3);
		DefaultTreeNode andere = new DefaultTreeNode("Andere",9,3);
		
		sport.addChild(teamsport);		sport.addChild(einzelsp); extrem.addChild(Extrem);
		spiele.addChild(tabelspiele); 		spiele.addChild(PcGames); spiele.addChild(Andere);
		unterhaltung.addChild(music); unterhaltung.addChild(films); unterhaltung.addChild(Tv);unterhaltung.addChild(andere);
		
		DefaultTreeNode Fussball = new DefaultTreeNode("Fussball",0,4);
		DefaultTreeNode Hockey = new DefaultTreeNode("Hockey",1,4);
		DefaultTreeNode Basketball = new DefaultTreeNode("Basketball",2,4);
		DefaultTreeNode Volleyball = new DefaultTreeNode("Volleybal",3,4);
		DefaultTreeNode Baseball = new DefaultTreeNode("Baseball",4,4);
		
		teamsport.addChild(Fussball);	teamsport.addChild(Hockey); 	teamsport.addChild(Basketball);
		teamsport.addChild(Volleyball);	teamsport.addChild(Baseball);
		
		DefaultTreeNode Golf = new DefaultTreeNode("Golf",5,4);
		DefaultTreeNode Schwimmen = new DefaultTreeNode("Schwimmen",6,4);
		DefaultTreeNode Lauf = new DefaultTreeNode("Lauf",7,4);
		DefaultTreeNode Tennis = new DefaultTreeNode("Tennis",8,4);
		DefaultTreeNode TischTennis = new DefaultTreeNode("TischTennis",9,4);
		DefaultTreeNode Fitness = new DefaultTreeNode("Fitness",10,4);
		
		einzelsp.addChild(Golf); einzelsp.addChild(Schwimmen); einzelsp.addChild(Lauf);
		einzelsp.addChild(Tennis); einzelsp.addChild(TischTennis); einzelsp.addChild(Fitness);
		
		DefaultTreeNode Snowboard = new DefaultTreeNode("Snowboard",11,4);
		DefaultTreeNode Fahrad = new DefaultTreeNode("Fahrad",12,4);
		DefaultTreeNode Windsurfen = new DefaultTreeNode("WindSurfen",13,4);
		DefaultTreeNode RollSchuhe = new DefaultTreeNode("RollSchuhe",14,4);
		DefaultTreeNode Bergsteigen = new DefaultTreeNode("Bergsteigen",15,4);
		DefaultTreeNode Schlittschuhe = new DefaultTreeNode("Schlittschuhe",16,4);
		
		Extrem.addChild(Snowboard);Extrem.addChild(Fahrad);Extrem.addChild(Windsurfen);
		Extrem.addChild(RollSchuhe);Extrem.addChild(Bergsteigen);Extrem.addChild(Schlittschuhe);
		
		DefaultTreeNode Schach = new DefaultTreeNode("Schach",17,4);
		DefaultTreeNode Damenspiel = new DefaultTreeNode("Damenspiel",18,4);
		DefaultTreeNode Backgammon = new DefaultTreeNode("Backgammon",19,4);
		DefaultTreeNode Poker = new DefaultTreeNode("Poker",20,4);
		
		tabelspiele.addChild(Schach);tabelspiele.addChild(Damenspiel);tabelspiele.addChild(Backgammon);
		tabelspiele.addChild(Poker);
		
		DefaultTreeNode Action = new DefaultTreeNode("Action",21,4);
		DefaultTreeNode RpgS = new DefaultTreeNode("Rpg/Strategie",22,4);
		DefaultTreeNode Arcade = new DefaultTreeNode("Arcade",23,4);
		
		PcGames.addChild(Action); PcGames.addChild(RpgS); PcGames.addChild(Arcade);
		
		DefaultTreeNode Darts = new DefaultTreeNode("Darts",24,4);
		DefaultTreeNode Billard = new DefaultTreeNode("Billard",25,4);
		
		Andere.addChild(Darts); Andere.addChild(Billard);
		
		DefaultTreeNode Rock = new DefaultTreeNode("Rock",26,4);
		DefaultTreeNode Rap = new DefaultTreeNode("Rap",27,4);
		DefaultTreeNode Pop = new DefaultTreeNode("Pop",28,4);
		
		music.addChild(Rap); music.addChild(Rap);music.addChild(Pop);
		
		DefaultTreeNode Horror = new DefaultTreeNode("Horror",29,4);
		DefaultTreeNode Drama = new DefaultTreeNode("Drama",30,4);
		DefaultTreeNode Act = new DefaultTreeNode("Action",31,4);
		DefaultTreeNode Fantastic = new DefaultTreeNode("Fantastic",32,4);
		
		films.addChild(Horror);films.addChild(Drama);films.addChild(Act);
		films.addChild(Fantastic);
		
		DefaultTreeNode Sport = new DefaultTreeNode("Sport",33,4);
		DefaultTreeNode Folgen = new DefaultTreeNode("Folgen",34,4);
		DefaultTreeNode Shows = new DefaultTreeNode("Shows",35,4);
		
		Tv.addChild(Sport);Tv.addChild(Folgen);Tv.addChild(Shows);
		
		DefaultTreeNode Sammlung = new DefaultTreeNode("Sammlung",36,4);
		DefaultTreeNode Wissenschaft = new DefaultTreeNode("Wissenschaft",37,4);
		DefaultTreeNode Relax = new DefaultTreeNode("Relax",38,4);
		
		andere.addChild(Sammlung);andere.addChild(Wissenschaft);andere.addChild(Relax);
		
		sons.add(active);
		sons.add(passive);
		Domain musterHobby = new Domain ("Hobby", 1, sons);
		System.out.println(musterHobby.getAll2LVL().get(0).getChildCnt());
		FileOutputStream fout;
	    fout = new FileOutputStream("MusterTree.ser");
	    ObjectOutputStream oos = new ObjectOutputStream(fout);   
	    oos.writeObject(musterHobby);
	    oos.close();
	}
	

}
