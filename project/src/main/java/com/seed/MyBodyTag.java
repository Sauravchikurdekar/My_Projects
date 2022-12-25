package com.seed;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class MyBodyTag extends BodyTagSupport
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public int doStartTag() throws JspException {
	
		JspWriter out=pageContext.getOut();
		
		try {
			
			out.println(name.toUpperCase());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return EVAL_BODY_INCLUDE;
	}

}