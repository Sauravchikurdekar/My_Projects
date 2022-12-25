package com.seed;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class AreaCircle extends TagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int radius;

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			out.print(3.14 * radius * radius);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
}
