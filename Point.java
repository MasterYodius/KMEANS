import java.util.ArrayList;


public class Point {
	private ArrayList<Float> coordonnees;
	private int groupe;
	
	public Point(ArrayList<Float> points,int g){
	this.setCoordonnees(new ArrayList<Float>(points));
	this.setGroupe(g);
	}

	public ArrayList<Float> getCoordonnees() {
		return coordonnees;
	}

	public void setCoordonnees(ArrayList<Float> coordonnees) {
		this.coordonnees = coordonnees;
	}

	public int getGroupe() {
		return groupe;
	}

	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}
	
	

}
