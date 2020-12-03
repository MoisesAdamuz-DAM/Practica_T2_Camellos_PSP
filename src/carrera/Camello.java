package carrera;

public class Camello  implements Comparable<Camello>{
	private int nombre;
	private int posicion;


	public Camello()
	{
		nombre = 0;
		posicion = 0;
	}

	public Camello(int n, int pc)
	{
		nombre = n;
		posicion = pc;
	}
	
	public int getNombre()
	{
		return nombre;
	}
	public void setNombre(int n)
	{
		this.nombre = n;
	}
	public int getPosicion()
	{
		return posicion;
	}
	public void setPosicion(int p)
	{
		this.posicion = p;
	}

	@Override
	public int compareTo(Camello o) {
		if(o.getPosicion()>posicion){
            return 1;
        }else if(o.getPosicion()==posicion){
            return 0;
        }else{
            return -1;
        }
	}

}