package pe.edu.utp.hellojsfdevs.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by GrupoUTP on 08/07/2016.
 */
@ManagedBean(name = "message", eager = true)
@SessionScoped
public class Message {
    private String message = "Welcome Developers!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
