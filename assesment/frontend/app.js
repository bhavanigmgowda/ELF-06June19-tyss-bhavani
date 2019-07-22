function compile() {
    var html = document.getElementById("html");
   /* The contentWindow property returns the Window object of an <iframe> element. 
   You can use this Window object to access the iframe's document and its internal DOM
    */
    var code = document.getElementById("code").contentWindow.document;
  
    document.body.onkeyup = function() {
      code.open();
      code.writeln(
        html.value +
          "<style>" +
       
          "</style>" +
          "<script>" +
        
          "</script>"
      );
      code.close();
    };
  }
  
  compile();