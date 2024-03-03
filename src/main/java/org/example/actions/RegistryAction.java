package org.example.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class RegistryAction extends ActionSupport {

    public String execute() throws Exception {
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
}
