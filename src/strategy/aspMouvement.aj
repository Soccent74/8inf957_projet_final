package strategy;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public abstract aspect aspMouvement 
{
   Hashtable deplacementPerOiseau = new Hashtable( );

   protected interface Deplacement
   {
   }

   protected interface Oiseau
   {
   }

   private Deplacement Oiseau.Deplacement = null;

   public void setConcreteDeplacement(Oiseau c, Deplacement s)
   {
	   deplacementPerOiseau.put(c, s);
   }

   public Deplacement getConcreteDeplacement(Deplacement c)
   {
      return (Deplacement) deplacementPerOiseau.get(c);
   }
}
