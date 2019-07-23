function showImages() {
  
     document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://www.photon.in/sites/default/files/styles/hero_image/public/detailpage/1440x1024_Digital%20Transformation%202017.jpg?itok=xO7P21zk'/>";
     document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://static.toiimg.com/thumb/msid-55477639,width-640,resizemode-4,imgsize-30289/55477639.jpg'/>";
     document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://res.cloudinary.com/people-matters/image/upload/w_624,h_351,c_scale,q_80/v1437722198/1437722196.jpg'/>";

      var containerElem = document.createElement("div");
      containerElem.setAttribute("id", "container");
      containerElem.setAttribute("class", "container row margin-for-element");
      document.body.appendChild(containerElem);
      var firstImg = document.createElement("img");
      firstImg.setAttribute("class", "col-3 imgheight");
      firstImg.setAttribute("src", 'https://www.digitaltechnology.institute/wp-content/uploads/2018/07/Facebook-200x200-v2.png');
      containerElem.appendChild(firstImg);
      var SecondImg = document.createElement("img");
      SecondImg.setAttribute("class", "col-3 imgheight");
      SecondImg.setAttribute("src", 'http://www.trutechtalent.com/wp-content/uploads/2017/04/digital-tech-320x320.gif');
      containerElem.appendChild(SecondImg);
      var thirdImg = document.createElement("img");
      thirdImg.setAttribute("class", "col-3 imgheight");
      thirdImg.setAttribute("src", 'http://stalwartsoft.com/images/slider/images/02.jpg');
      containerElem.appendChild(thirdImg);
    }
    
    function hideImages() {
        //change back other images
        document.getElementById('im2').innerHTML = "<img class='imgheight' src='https://erpinnews.com/wp-content/uploads/2017/11/technology.jpeg'/>";
        document.getElementById('im3').innerHTML = "<img class='imgheight' src='https://www.telegraph.co.uk/content/dam/news/2018/03/15/TELEMMGLPICT000156566408_trans_NvBQzQNjv4BqQDfO_Li8BnuRdRCVfSGXuQvhzdjcZien2ya59CfVOfk.jpeg?imwidth=1240'/>";
        document.getElementById('im4').innerHTML = "<img class='imgheight' src='https://www.indiacelebrating.com/wp-content/uploads/Digital-India.jpg'/>";
        //remove elements
        var container = document.getElementById('container');
        document.body.removeChild(container);
    }