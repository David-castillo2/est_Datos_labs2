package co.edu.unipiloto.estdatos.tallergen.mundo;

/*public class Casillero {

	private Producto producto;

	public Casillero ()
	{
		producto = null;
	}

	public boolean agregar(Producto pProducto)
	{
		if(producto == null)
		{
			producto = pProducto;
			return true;
		}
		return false;
	}

	public Producto darProducto()
	{
		return producto;
	}

	public Producto despachar()
	{
		if(producto==null)
		{
			return producto;
		}
		
		Producto nObjeto = producto;
		producto = null;
		return nObjeto;
	}

	public boolean estaDesocupado() {
		
		if(producto==null)
		{
			return true;
		}
		return false;
		
	}*/

public class Casillero<T>{
    
    private T objeto;
    
    public Casillero(){
        objeto=null;
    }
    public boolean agregar(T pObjeto)
	{
		if(objeto == null)
		{
			objeto = pObjeto;
			return true;
		}
		return false;
	}
    public T darObjeto()
	{
		return objeto;
	}
    
    public T despachar()
	{
		if(objeto==null)
		{
			return objeto;
		}
		
		T nObjeto = objeto;
		objeto = null;
		return nObjeto;
	}
    
    public boolean estaDesocupado() {
		
		if(objeto==null)
		{
			return true;
		}
		return false;
}
}
