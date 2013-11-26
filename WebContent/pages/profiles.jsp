<%@page import="java.text.DecimalFormat" %>


<style>
  .scroll-pane { overflow: auto; width: 99%; float:left; }
  .scroll-content { width: 3500px; float: left; }
  .scroll-content-item { width: 120px; height: 190px; float: left; margin: 10px; font-size: 3em; line-height: 12px; text-align: center; border=1px; 
  	font-family: Arial; font-weight:bold; font-size:.75em; color:#000000; }   
  .scroll-bar-wrap { clear: left; padding: 0 4px 0 2px; margin: 0 -1px -1px -1px; }
  .scroll-bar-wrap .ui-slider { background: none; border:0; height: 2em; margin: 0 auto;  }
  .scroll-bar-wrap .ui-handle-helper-parent { position: relative; width: 100%; height: 100%; margin: 0 auto; }
  .scroll-bar-wrap .ui-slider-handle { top:.2em; height: 1.5em; }
  .scroll-bar-wrap .ui-slider-handle .ui-icon { margin: -8px auto 0; position: relative; top: 50%; }
 </style>

<div class="text">Products</div>
	<div class="contProfile">
		<div class="wrapper pad_top1">
			 <div class="scroll-pane ui-widget ui-widget-header ui-corner-all">
			  <div class="scroll-content">
			    
			    <% for (int i=0;i<25;i++) { 
			    	DecimalFormat format = new DecimalFormat("0.00");
			    	double distance = 1.17+(i*.34); %>
			    <div class="scroll-content-item ui-widget-header">
			    	<img src="<%=request.getContextPath() %>/photos/blank.jpg" /></br>
			    	<div class="userinfo">
				    	SexyRick&nbsp;/&nbsp;29&nbsp;/&nbsp;<%=format.format(distance) %>m
				    <img src="<%=request.getContextPath() %>/images/view.jpg" title="View Profile" alt="View Profile" />
				    <img src="<%=request.getContextPath() %>/images/message.jpg" title="Send Message" alt="Send Message" />
				    <img src="<%=request.getContextPath() %>/images/add.jpg" title="Add to Friend List" alt="Add to Friend List" />
				    <img src="<%=request.getContextPath() %>/images/warn.jpg" title="Warn User" alt="Warn User" />
				    <img src="<%=request.getContextPath() %>/images/block.jpg" title="Block User" alt="Block User" />
				    </div>
			    </div>
			   <% } %>
			 </div> 
  			<div class="scroll-bar-wrap ui-widget-content ui-corner-bottom">
    			<div class="scroll-bar"></div>
  			</div>
		</div>
	</div>
</div>
