function validate(data,idd) {
    alert("in validate")
    if (isNaN(data)||data.length == 0) {
        document.getElementById(idd).innerHTML = "Please enter a number"
        
    } else {
        document.getElementById(idd).innerHTML = ""
    }
}


    function readradio() {
        var l = document.frm.rd.length
        let text1 = document.getElementById("t1").value
        let text2 = document.getElementById("t2").value
        let text3 = document.getElementById("t3")
        if(text1.length==0||text1==null) {
            document.getElementById("e1").innerHTML="Please enter a number"
            return false
        } else {
            document.getElementById("e1").innerHTML=""
        }
        if(text2.length==0||text2==null) {
            document.getElementById("e2").innerHTML="Please enter a number"
            return false
        } else {
            document.getElementById("e2").innerHTML=""
        }
        for (let i = 0; i < l; i++) {
            if (document.frm.rd[i].checked) {
                document.getElementById("pp").innerHTML = "You have selected " + document.frm.rd[i].value
            }
        }            
        if (document.frm.rd[0].checked) //
            text3.value=+text1 + +text2
        else
             text3.value=+text1 - +text2
    }
    function cc() {
        document.frm.rd[0].checked = true;
    }