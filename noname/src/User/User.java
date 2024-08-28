/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author ARMEL UY ESTEVES
 */
public class User {
    private int product_id, user_id;
    private String product_name, description, category, price, stock, date, fullname, username, password, user_level;
    private byte[]picture, photo;
    
    public User(int product_id, String product_name, String description, String category, byte[] image, int user_id, String fullname, String username, String password, String user_level, byte[] photo)
    {
    this.product_id=product_id;
    this.product_name=product_name;
    this.description=description;
    this.category=category;
    this.price=price;
    this.stock=stock;
    this.date=date;
    this.picture=image;
    this.user_id=user_id;
    this.fullname=fullname;
    this.username=username;
    this.password=password;
    this.user_level=user_level;
    this.photo=photo;
    }
    

    public User(int aInt, String string, String string0, String string1, String string2, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getID(){
        return product_id;
    }
    public String getName(){
        return product_name;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public String getPrice(){
        return price;
    }
    public String getStock(){
        return stock;
    }
    public String getDate(){
        return date;
    }
    public byte[] getImage(){
        return picture;
    }
    
    public int getUserID(){
        return user_id;
    }
    public String getFullname(){
        return fullname;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getUserLevel(){
        return user_level;
    }
    public byte[] getPhoto(){
        return photo;
    }
    
    
    
    
}
