package ClassProject1;

public class Singers
{
   public int id; // instance variable
   public String name; // instance variable
   public String address; // instance variable
   public String dateOfBirth; // instance variable
   public int albumsPublished; // instance variable
   //Constructors
   Singers(){
   }
   Singers(int id){
   }
   Singers(int id, String name){
   }
   Singers(int id, String name, String address){
   }
   Singers(int id, String name, String address, int dateOfBirth){
   }
   Singers(int id, String name, String address, String dateOfBirth, int albumsPublished){
   }
// methods to set
   public void setId(int id)      
   {                                             
      this.id = id; // store the id
   }   
   public void setName(String name)      
   {                                             
      this.name = name; // store the name
   }
   public void setAddress(String address)      
   {                                             
      this.address = address; // store the address
   }
   public void setDateOfBirth(String dateOfBirth)      
   {                                             
      this.dateOfBirth = dateOfBirth; // store the dateOfBirth
   }  
   public void setAlbumsPublished(int albumsPublished)      
   {                                             
      this.albumsPublished = albumsPublished; // store the albumsPusblished
   } 
   public void setAll(int id, String name, String address, String dateOfBirth, int albumsPublished)      
   {                                             
      this.id = id; // store the id
      this.name = name; // store the name
      this.address = address; // store the address
      this.dateOfBirth = dateOfBirth; // store the dateOfBirth
      this.albumsPublished = albumsPublished; // store the albumsPusblished
   }  
  // methods to get
   public int getId()        
   {                                    
      return id; // return value of id to caller        
   }
   public String getName()        
   {                                    
      return name; // return value of name to caller        
   }
   public String getAddress()        
   {                                    
      return address; // return value of address to caller        
   }   
   public String getDateOfBirth()        
   {                                    
      return dateOfBirth; // return value of dateOfBirth to caller        
   }
   public int getAlbumsPublished()        
   {                                    
      return albumsPublished; // return value of albumsPublished to caller        
   }
} // end class Singers
