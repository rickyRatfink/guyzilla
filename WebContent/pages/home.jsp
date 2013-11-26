<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>  

<div class="text">Contact Us</div>
<div class="cont">
	<html:form action="Login.do" styleId="LoginForm">
		<div>
			<% if (session.getAttribute("error")!=null) { %>
           		<b><font color="#ac0909"><div id="errors">
            		<img src="<%=request.getContextPath()%>/images/error.jpg"/><%=session.getAttribute("error") %>
            		</div></font></b></br>
            <% } %>
			<div class="wrapper">
				<span>Username:</span>
				<div class="bg">
					<div>
						<html:text property="member.username" size="20" maxlength="10" styleClass="input" />
					</div>
				</div>
			</div>
			<div class="wrapper">
				<span>Password:</span>
				<div class="bg">
					<div>
						<html:password property="member.password" size="20" maxlength="10" styleClass="input" />
					</div>
				</div>
			</div>

			
		</div>
		
					
		<div align="left" style="padding-right:20px;">			
			<input type="submit" name="action" id="submitButton" value="Login"/>
		</div>
		
	</html:form>
</div>

