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
                    window.location.reload()
                    break;
                case false:
                    alert("登录失败！")
                    window.location.reload()
                    break;
                default:
                    window.location.reload()

                    break;
            }
        }
    });
}


function Sxss() {
    var data = $("#text1").serialize();

    $.ajax({
        url: "/security/xss",
        type: "post",
        data: data,
        success: function (data) {
            data
        }
    });
}