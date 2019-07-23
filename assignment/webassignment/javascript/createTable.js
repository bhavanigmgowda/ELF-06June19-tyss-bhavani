function showTable() {
    let name = document.forms[0].name.value;
    let id = document.forms[0].id.value;
   if(document.getElementById('tab') === null) {
        var containerElem = document.createElement("table");
        containerElem.setAttribute("id", "tab");
        containerElem.setAttribute("class", "container margin-for-element");
        document.body.appendChild(containerElem);
        var heading = document.createElement("tr");
        console.log(containerElem);
        containerElem.appendChild(heading);

        var headName = document.createElement("td");
        headName.setAttribute("class", "tab-head");
        heading.appendChild(headName);
        headName.appendChild(document.createTextNode("Name"));
        var headId = document.createElement("td");
        headId.setAttribute("class", "tab-head");
        heading.appendChild(headId);
        headId.appendChild(document.createTextNode("Id"));
}
    var cont = document.getElementById('tab');
    var tabBody = document.createElement("tr");
    cont.appendChild(tabBody);
    tabName = document.createElement("td");
    tabName.setAttribute("class", "tab-data");
    tabBody.appendChild(tabName);
    tabName.appendChild(document.createTextNode(name));
    tabId = document.createElement("td");
    tabId.setAttribute("class", "tab-data");
    tabBody.appendChild(tabId);
    tabId.appendChild(document.createTextNode(id));

    
}