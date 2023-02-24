package proyectoPokedex;

public class pokemon {
	protected String Nombre = "???";
	protected String Tipo= "???";
	protected int Ruta;
	protected int Ataque=0;
	protected int Defensa=0;
	protected int AtaqueE=0;
	protected int DefensaE=0;
	
	//constructor
	public pokemon (String Nombre, String Tipo, int Ruta, int Ataque, int Defensa, int AtaqueE, int DefensaE)
	{
	this.Nombre=Nombre;
	this.Tipo=Tipo;
	this.Ruta=Ruta;
	this.Ataque=Ataque;
	this.AtaqueE= AtaqueE;
	this.Defensa=Defensa;
	this.DefensaE=DefensaE;
	}
	
	
	
	
	//getter
	public String GetNombre() { return this.Nombre; }
	public String GetTipo() { return this.Tipo; }
	public int GetRuta() { return this.Ruta; }
	public int GetAtaque() { return this.Ataque; }
	public int GetDefensa() { return this.Defensa; }
	public int GetAtaqueE () { return this.AtaqueE; }
	public int GetDefensaE () { return this.DefensaE; }
	
	//setter
	public void SetNombre (String Nombre) { this.Nombre = Nombre; }
	public void SetTipo (String Tipo) { this.Tipo = Tipo; }
	public void SetRuta (int Ruta) { this.Ruta = Ruta; }
	public void SetAtaque (int Ataque) { this.Ataque = Ataque; }
	public void SetDefensa (int Defensa) { this.Defensa = Defensa; }
	public void SetAtaqueE (int AtaqueE) { this.AtaqueE = AtaqueE; }
	public void SetDefensaE (int DefensaE) { this.DefensaE = DefensaE; }
	
	//toString
	public String toString () 
	{ return this.Nombre; }
	
	
	}

