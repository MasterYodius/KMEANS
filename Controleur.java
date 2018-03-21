import java.util.ArrayList;


public class Controleur {
	private ArrayList<Point> points;
	private ArrayList<Integer> groupes;
	
	public Controleur(int nbG){
		int i;
		for(i=0; i<nbG ;i++)
		{
			this.groupes.add(i);
		}
	}

}
