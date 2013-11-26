package org.guyzilla.struts.action;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;
import org.guyzilla.domain.Constants;
import org.guyzilla.domain.ErrorMessage;
import org.guyzilla.domain.Member;
import org.guyzilla.hibernate.dao.MemberDao;
import org.guyzilla.struts.form.LoginForm;
import org.guyzilla.utils.HtmlDropDownBuilder;


public class LoginAction extends Action {
	
	private final static Logger LOGGER = Logger.getLogger(LoginAction.class.getName());
	private final static HtmlDropDownBuilder html = new HtmlDropDownBuilder();
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {		
		LOGGER.setLevel(Level.INFO);

		 HttpSession session = request.getSession(true);
		 LoginForm loginForm = (LoginForm)form;
		 
		 session.setAttribute("error",null);
		 if ("logout".equals(loginForm.getAction())) {
			 loginForm.setMember(null);
			 session.invalidate();
			 return mapping.findForward(Constants.LOGOUT);
		 }
		 //MemberHome userDao = new MemberHome();
		 MemberDao userDao = new MemberDao();
		 //UserAuthorizedSessionDao sessionDao = new UserAuthorizedSessionDao();
		 //UserAuthorizedSession sessionObj = new UserAuthorizedSession();
		 
		 ActionRedirect redirect = null;
		 
		 Member user=null;
		
		 if ("Login".equals(loginForm.getAction())) {
			 session.setAttribute("error",null);
			 boolean valid = this.validate(loginForm);
			 if (!valid) {
				 session.setAttribute("error", "username and password is required.");
				 loginForm.getMember().setUsername(null);
				 loginForm.getMember().setPassword(null);				 
				 return mapping.findForward(Constants.LOGIN);
			 }
			 user = userDao.authenticate(loginForm.getMember().getUsername(), loginForm.getMember().getPassword());
			 
			 if (user!=null) {
				 	 html.refresh(session);
					 loginForm.setMember(user);
					 session.setAttribute("USER_"+session.getId(), user);
					 return mapping.findForward(Constants.SUCCESS);
				 
			 } else
			 {
				 loginForm.getMember().setUsername(null);
				 loginForm.getMember().setPassword(null);				 
				 session.setAttribute("error", "username and/or password do not match.");
				 return mapping.findForward(Constants.FAILURE);
			 }
			 
		 }
		
		 return mapping.findForward(Constants.LOGIN);
		 //return mapping.findForward(Constants.GLOBAL_LOGIN);
	}
	
	public boolean validate(LoginForm loginForm) {
		  List<ErrorMessage> messages = new ArrayList<ErrorMessage>();
		  ActionErrors errors = new ActionErrors();
		  
		  if ((loginForm.getMember().getUsername()==null) || (loginForm.getMember().getUsername().length() < 1)) 
		     	messages.add(new ErrorMessage("username is required",""));
		  if ((loginForm.getMember().getPassword()==null) || (loginForm.getMember().getPassword().length() < 1)) 
			    messages.add(new ErrorMessage("password is required",""));
		  
		  if (messages.size()>0) {
			  loginForm.setMessages(messages); 	 
			  return false;
		  }
		  else
			  return true;
		}
	
}
