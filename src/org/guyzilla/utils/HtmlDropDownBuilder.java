package org.guyzilla.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.guyzilla.domain.DropDownItem;
//import org.guyzilla.domain.GiftType;
//import org.guyzilla.domain.State;

public class HtmlDropDownBuilder {

	public void refresh(HttpSession session) {
	   	
		/*
        StateDao dao3 = new StateDao();
        List<State> list3 = new ArrayList<State>();
        list3=dao3.listStates();
        session.setAttribute("ddl_state", list3);
		*/
	   List<DropDownItem> yesNo = new ArrayList<DropDownItem>();
	   yesNo.add(new DropDownItem("Yes","Yes"));
	   yesNo.add(new DropDownItem("No","No"));
	   session.setAttribute("ddl_yesNo", yesNo);
	 
	}
	

}
