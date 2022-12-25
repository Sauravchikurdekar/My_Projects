package com.seed;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class CubeNumber extends TagSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;

	public void setNumber(int number) 
	{
		this.number = number;
	}

	public int doStartTag() throws JspException 
	{
		JspWriter out=pageContext.getOut();
		try
		{
			out.print(number*number*number);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
}
