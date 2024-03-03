package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.example.actions.beans.AlumnoBean;

import java.util.List;
import java.util.Map;

public class showStudentsAction extends ActionSupport implements SessionAware  {

    private List<AlumnoBean> alumnos;
    private Map<String, Object> session;

    public String execute() throws Exception {
        alumnos = (List<AlumnoBean>) session.get("ALUMNOS_LIST");
        return SUCCESS;
    }

    public List<AlumnoBean> getAlumnos() {
        return alumnos;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}
