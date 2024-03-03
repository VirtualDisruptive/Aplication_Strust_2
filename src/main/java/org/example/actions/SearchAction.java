package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.example.actions.beans.AlumnoBean;

import java.util.List;
import java.util.Map;

/**
 * <code>Set welcome message.</code>
 */
public class SearchAction extends ActionSupport implements SessionAware {

    private String dni;
    private AlumnoBean alumnoBean;
    private Map<String, Object> session;

    public String execute() throws Exception {
        List<AlumnoBean> alumnos = (List<AlumnoBean>) session.get("ALUMNOS_LIST");
        if (alumnos != null) {
            for (AlumnoBean alumno : alumnos) {
                if (alumno.getDni().equals(dni)) {
                    alumnoBean = alumno;
                    break;
                }
            }
        }

        if (alumnoBean == null) {
            addActionError("No se encontró un alumno con el DNI proporcionado.");
            return ERROR;
        }

        System.out.println("hecho");
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


    public void setDni(String dni) {
        this.dni = dni;
    }

    public AlumnoBean getAlumnoBean() {
        return alumnoBean;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
