package spitter.service.rmi;

import java.io.Serializable;
import java.util.List;
/*import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "spitter")
@NamedQueries({
	@NamedQuery(name="Spitter.findById", 
			    query="select distinct s from Spitter s " +
			    		" s.id = :id")
 

})*/
public class Spitter implements Serializable {
  private Long id;
    private String username;
  private String password;
    private String fullName;
  private List<Spittle> spittles;
  private String email;  
  private boolean updateByEmail;

  
  
  public Spitter(){
	  System.out.println("SPitter constructor");
	  //this.fullName="fullnameeee";
  }
  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
	  System.out.println(password);
    this.password = password;
  }

  public void setFullName(String fullName) {
	  System.out.println(fullName);
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }
  
  public void setEmail(String email) {
      this.email = email;
  }
  
  public String getEmail() {
      return email;
  }
  
  public void setSpittles(List<Spittle> spittles) {
    this.spittles = spittles;
  }

  
  public List<Spittle> getSpittles() {
    return spittles;
  }
  
  public void setUpdateByEmail(boolean updateByEmail) {
      this.updateByEmail = updateByEmail;
  }
  
  public boolean isUpdateByEmail() {
    return updateByEmail;
  }
  
  
  @Override
  public boolean equals(Object obj) {
	  if(obj == null)
		  return false;
    Spitter other = (Spitter) obj;
    if(other.fullName==null || other.username==null || other.password==null)
    	return false;
    System.out.println(obj);
    return other.fullName.equals(fullName) && other.username.equals(username) && other.password.equals(password);
  }
  
  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }
  
  @Override
	public String toString() {
	   
		return this.fullName +  "  " + this.email + "  " + this.username + "  " + 
		this.password;
	}
}
