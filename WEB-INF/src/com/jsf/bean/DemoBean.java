package com.jsf.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "DemoBean")
@ViewScoped
@Getter
@Setter
public class DemoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -794238525838232217L;
	
	private String message = "Hello World!";
}
