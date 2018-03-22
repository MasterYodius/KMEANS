import java.util.ArrayList;


public class Controleur {
	private ArrayList<Point> points;
	private ArrayList<Integer> groupes;
	
	public Controleur(int nbG,ArrayList<Point> p){
		this.points = new ArrayList<Point>(p);
		int i;
		for(i=0; i<this.points.size() ;i++)
		{
			points.get(i).setGroupe((int) (Math.random()*(nbG)));//Inclus ?
		}
		
	}
	
	public ArrayList<Float> calculCentroide(int c){
		int i=0,res=0;
		for(Point p:points){
			if(p.getGroupe()==c)
				for(float f:p.getCoordonnees())
				{
					
				}
			i++;
		}
		return (res/i);
	}
	
	
	public void chercherCentroides(){
		this.groupes=new ArrayList<Integer>();
		for(int i=0;i<groupes.size();i++)
			groupes.add(i,calculCentroide(i));
	} 

	public ArrayList<Integer> getGroupes() {
		return groupes;
	}

	public void setGroupes(ArrayList<Integer> groupes) {
		this.groupes = groupes;
	}
	
	

}
