class Employe
{
    int id=101;
    String name="pranali", desti="pune";
   


     public Employe(int id,String name, String desti)
{
}
     public String toString()
      {
        return id+":"+name+":"+desti;
     }
    } 

   class E
{

    public static void main (String args[])
     {
      
      Employe e1= new Employe (101,"pranali","pune");
      System.out.println(e1.id);
      System.out.println(e1.name);
      System.out.println(e1.desti);

  System.out.println("");
  System.out.println(e1);
}

}   