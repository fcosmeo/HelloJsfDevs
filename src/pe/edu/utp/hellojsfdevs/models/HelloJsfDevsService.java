package pe.edu.utp.hellojsfdevs.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 * Created by GrupoUTP on 08/07/2016.
 */
@ManagedBean(name = "hellodevs", eager = true)
@SessionScoped
public class HelloJsfDevsService {
    @ManagedProperty(value = "#{message}")
    private Message messageBean;
    @ManagedProperty(value = "#{name}")
    private String name;
    private String message;

    public String getMessage() {
        if(getMessageBean() != null) {
            message = getMessageBean().getMessage();
        }
        return message;
    }

    public Message getMessageBean() { return messageBean; }

    public void setMessageBean(Message message) { this.messageBean = message; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getWelcomeMe() {
        return ("".equals(name) || name == null) ? "" :
                "My name is " + name;
    }
}

