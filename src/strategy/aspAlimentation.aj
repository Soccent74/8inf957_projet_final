package strategy;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public abstract aspect aspAlimentation 
{
   Hashtable nourriturePerOiseau = new Hashtable( );

   protected interface Nourriture
   {
   }

   protected interface Oiseau
   {
   }

   private Nourriture Oiseau.Nourriture = null;
   
   public void setConcreteAlimentation(Oiseau c, Nourriture s)
   {
	   nourriturePerOiseau.put(c, s);
   }

   public Nourriture getConcreteAlimentation(Nourriture c)
   {
      return (Nourriture) nourriturePerOiseau.get(c);
   }
}
