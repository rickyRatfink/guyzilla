package org.guyzilla.struts.form;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.guyzilla.domain.ErrorMessage;
import org.guyzilla.domain.Member;

public class LoginForm  extends ActionForm {

	private Member member = new Member();
	private List<Member> userList = new ArrayList<Member>();
	private List<ErrorMessage> messages = new ArrayList<ErrorMessage>();
    private String messageType;
	private String action;
	
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member systemUser) {
		this.member = systemUser;
	}
	
	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public List<ErrorMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<ErrorMessage> messages) {
		this.messages = messages;
	}

	public List<Member> getUserList() {
		return userList;
	}

	public void setUserList(List<Member> userList) {
		this.userList = userList;
	}

	/*
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		  ActionErrors errors = new ActionErrors();
		  if ((this.systemUser.getUsername()==null) || (this.systemUser.getUsername().length() < 1)) 
		      errors.add("",new ActionMessage("errors.required","username"));
		  if ((this.systemUser.getPassword()==null) || (this.systemUser.getPassword().length() < 1)) 
		      errors.add("", new ActionMessage("errors.required","password"));
		  
		  	 
		  return errors;
		}
		*/
}
