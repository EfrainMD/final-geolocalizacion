/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author T-107
 */
public class Usuario {
    @Id
    String id;
    String nickname;
    String email;
    String password;
    ArrayList <Mensaje> mensaje;
    Posicion posicion;

    public Usuario(String id, String nickname, String email, String password, ArrayList<Mensaje> mensaje, Posicion posicion) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.mensaje = mensaje;
        this.posicion = posicion;
    }

    public Usuario(Posicion posicion) {
        this.posicion = posicion;
    }
    

    public Usuario(String id, String nickname, String email, String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    Usuario() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
