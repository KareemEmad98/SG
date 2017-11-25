
import java.util.HashMap;

public class User {

    private String username;
    private String password;
    
HashMap<String,String> x=new HashMap<String,String>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap<String, String> getX() {
        return x;
    }

    public void setX(HashMap<String, String> x) {
        this.x = x;
    }
    
    
public void add(String username,String password)
{
    
    x.put(username, password);
    
    
}

public void delete(String username)
{
    
    x.remove(username);
    
}
    
    public String search(String username)
    {
          return x.get(username);
    }
    
    public void display()
    {
        
        for(String username:x.keySet() )
        {
            
            System.out.println("name: "+username+" "+"password: "+x.get(username));
        
        }
    }



}
