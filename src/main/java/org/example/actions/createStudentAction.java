package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.example.actions.beans.AlumnoBean;
import org.apache.struts2.interceptor.SessionAware;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * <code>Set welcome message.</code>
 */
public class createStudentAction extends ActionSupport implements SessionAware{

    private AlumnoBean alumnoBean;
    private Map<String, Object> session;



    public AlumnoBean getAlumnoBean() {
        return alumnoBean;
    }

    public void setAlumnoBean(AlumnoBean alumnoBean) {
        this.alumnoBean = alumnoBean;
    }

    public String execute() throws Exception {
        List<AlumnoBean> alumnos = (List<AlumnoBean>) session.get("ALUMNOS_LIST");
        if (alumnos == null) {
            alumnos = new ArrayList<>();
        }
        alumnos.add(alumnoBean);
        session.put("ALUMNOS_LIST", alumnos);

        System.out.println("alumno creado");
        return SUCCESS;
    }

    /**
     * Provide default valuie for Message property.
     */
    public static final String MESSAGE = "hello.message";

    /**
     * Field for Message property.
     */
    private String message;

    /**
     * Return Message property.
     *
     * @return Message property
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set Message property.
     *
     * @param message Text to display on HelloWorld page.
     */
    public void setMessage(String message) {
        this.message = message;
    }




    @Override
    public void validate() {
        if (alumnoBean.getName().isEmpty()) {
            addFieldError("alumnoBean.name", "El nombre es obligatorio.");
        }

        if(alumnoBean.getLastName().isEmpty()){
            addFieldError("alumnoBean.lastName", "El apellido es obligatorio.");
        }

        if(alumnoBean.getDni().isEmpty()){
            addFieldError("alumnoBean.dni", "El DNI es obligatorio.");
        }

        if(alumnoBean.getPhone().isEmpty()){
            addFieldError("alumnoBean.phone", "El Telefono es obligatorio.");
        }



    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
