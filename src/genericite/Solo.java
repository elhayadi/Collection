package genericite;

public class Solo<T> {
	 

	  private T valeur;
	        

	  public Solo(){
	    this.valeur = null;
	  }

	
	  public Solo(T val){
	    this.valeur = val;
	  }
	        
	 
	  public void setValeur(T val){
	    this.valeur = val;
	  }
	        
	  public T getValeur(){
	    return this.valeur;
	  }       
	  
	  @Override
		public String toString() {
			return "Solo [valeur=" + valeur + "]";
		}
	
	  public static void main(String[] args) {
		  Solo<Integer> val = new Solo<Integer>(12);
		  Solo<Double> val2 = new Solo<Double>(45.26);
		  int nbr = val.getValeur();    
		  double nbr2 = val2.getValeur();   
		  System.out.println(val.toString());
		  System.out.println(val2.toString());
		}


	
	}