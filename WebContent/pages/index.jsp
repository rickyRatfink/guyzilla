<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>jQuery UI Slider - Slider scrollbar</title>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/default.css">
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
 <style>
  .scroll-pane { overflow: auto; width: 99%; float:left; }
  .scroll-content { width: 2440px; float: left; }
  .scroll-content-item { width: 100px; height: 100px; float: left; margin: 10px; font-size: 3em; line-height: 96px; text-align: center; }
  .scroll-bar-wrap { clear: left; padding: 0 4px 0 2px; margin: 0 -1px -1px -1px; }
  .scroll-bar-wrap .ui-slider { background: none; border:0; height: 2em; margin: 0 auto;  }
  .scroll-bar-wrap .ui-handle-helper-parent { position: relative; width: 100%; height: 100%; margin: 0 auto; }
  .scroll-bar-wrap .ui-slider-handle { top:.2em; height: 1.5em; }
  .scroll-bar-wrap .ui-slider-handle .ui-icon { margin: -8px auto 0; position: relative; top: 50%; }
  </style>
  <jsp:include page="../scripts/slider.js" flush="true" />
</head>
<body>
 
<div class="scroll-pane ui-widget ui-widget-header ui-corner-all">
  <div class="scroll-content">
    <div class="scroll-content-item ui-widget-header">1</div>
    <div class="scroll-content-item ui-widget-header">2</div>
    <div class="scroll-content-item ui-widget-header">3</div>
    <div class="scroll-content-item ui-widget-header">4</div>
    <div class="scroll-content-item ui-widget-header">5</div>
    <div class="scroll-content-item ui-widget-header">6</div>
    <div class="scroll-content-item ui-widget-header">7</div>
    <div class="scroll-content-item ui-widget-header">8</div>
    <div class="scroll-content-item ui-widget-header">9</div>
    <div class="scroll-content-item ui-widget-header">10</div>
    <div class="scroll-content-item ui-widget-header">11</div>
    <div class="scroll-content-item ui-widget-header">12</div>
    <div class="scroll-content-item ui-widget-header">13</div>
    <div class="scroll-content-item ui-widget-header">14</div>
    <div class="scroll-content-item ui-widget-header">15</div>
    <div class="scroll-content-item ui-widget-header">16</div>
    <div class="scroll-content-item ui-widget-header">17</div>
    <div class="scroll-content-item ui-widget-header">18</div>
    <div class="scroll-content-item ui-widget-header">19</div>
    <div class="scroll-content-item ui-widget-header">20</div>
  </div>
  <div class="scroll-bar-wrap ui-widget-content ui-corner-bottom">
    <div class="scroll-bar"></div>
  </div>
</div>
 Hello
 
</body>
</html>