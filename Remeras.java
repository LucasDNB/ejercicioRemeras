import java.util.*;
public class Remeras {
	private int codigo;
	private String tela;
	private double costoMP; 
	private double costoMO;
	private boolean musculosa;
	
	private Calendar fechaConfeccion;
	private Talles talles [] = new Talles[4];
	private String colores [];
	private Empresas bordador;
	private Empresas diseñadores;
	private Cambios cambioDiseño;
	private static final String NOMBRE_FABRICA = "LUCAS";
	private static String temporada = "Invierno";
	
	public void setCodigo(int c) {codigo = c;}
	public void setTela(String t) {tela = t;}
	public void setCostoMP(double c) {costoMP = c;}
	public void setCostoMO(double c) {costoMO = c;}
	public void setMusculosa(boolean c) {musculosa = c;}
	public void setTalles(int c, double l, double a, double p, int pos) {
		
		talles[pos].setCodigo(c);
	    talles[pos].setLargo(l);
	    talles[pos].setAncho(a);
	    talles[pos].setAdicional(p);
		 
	}
	
	public int getCodigo() {return codigo;}
	public String getTela () {return tela;}
	public double getCostoMP () {return costoMP;}
	public double getCostoMO () {return costoMO;}
	public boolean getMusculosa () {return musculosa;}
	
	public Talles [] getTalles() {return talles;}
	
	//Creacion de constructor alternativo
	//siempre public, sin tipo de dato, atributos como parametros
	public Remeras (int c, String t, double mp, double mo, boolean m) {
		this(); //llamo al constructo por default
		codigo = c;
		tela = t;
		costoMP = mp;
		costoMO = mo;
		musculosa = m;
	}
	
	public Remeras () {
		for (int i=0; i<talles.length; i++) { //con el this() de arriba llevo este ciclo hacia alla (Opcional)
			talles[i] = new Talles(); //Cargar talles[] como parametro del constructor es un error grave
		}
	} //Creo el constructor default porque Java lo anulo con el constructor anterior
	
	 
}
