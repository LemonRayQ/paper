function mysql() {

    var data = $("#loginData").serialize();
    alert("1")
    $.ajax({
        url: "/mysql/Tlogin",
        type: "post",
        data: data,
        success: function (data) {
            switch (data) {
                case true:
                    alert("登录成功！")
                    break;
                case false:
                    alert("登录失败！")
                    break;
                default:
                    break;
            }
        }
    });
}


function xss() {
    alert("111")
    var data = $("#text1").serialize();

    $.ajax({
        url: "/xss",
        type: "post",
        data: data,
        success: function (data) {
            if (data!=null){
                alert("111")
            }
        }
    });
}