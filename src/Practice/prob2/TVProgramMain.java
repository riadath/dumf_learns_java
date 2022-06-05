package Practice.prob2;
import java.util.*;

interface TVProgram{
	int getDuration();
	Date getAirtime();
}

abstract class TVProgramAB implements TVProgram{
	protected int duration;
	protected Date airtime;

	TVProgramAB(int duration,Date airtime){
		this.duration = duration;
		this.airtime = airtime;
	}

	@Override
	public int getDuration() {return duration;}
	@Override
	public Date getAirtime() {return airtime;}
}

class News extends TVProgramAB{
	private String newsType;

	public News(int duration, Date airtime, String newsType) {
		super(duration, airtime);
		this.newsType = newsType;
	}

	public String getNewsType() {return newsType;}
}

class OtherPrograms extends TVProgramAB{
	protected String[] sponsors;
	protected String name;

	public OtherPrograms(int duration, Date airtime, String[] sponsors, String name) {
		super(duration, airtime);
		this.sponsors = sponsors;
		this.name = name;
	}

	public String[] getSponsors() {return sponsors;}
	public String getName() {return name;}

}

class Drama extends OtherPrograms{
	private List<String>actors;

	public Drama(int duration, Date airtime, String[] sponsors, String name, String[] actors) {
		super(duration, airtime, sponsors, name);
		this.actors = List.of(actors);
	}

	public List<String> getActors() {return actors;}

	void addActor(String actor){
		actors.add(actor);
	}
}

public class TVProgramMain {
	public static void main(String... args){

	}
}
