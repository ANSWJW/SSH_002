<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>积极分子学习时间</title>

    <style type="text/css">
        #times {
            width: 200px;
            height: 20px;
            border: 3px solid black; /*如果不加实线无法显示边框  123456*/
            text-align: center;
        }
    </style>
</head>

<body>
    <div style="text-align: center" id="tips">
        <h1>温馨提醒欧丽敏</h1>
        <h2>现在是北京时间</h2>
    </div>
    <div   id="times">

    </div>
</body>
<script type="text/javascript">
    //得到时间并写入div
    function getDate() {
        //获取当前时间
        var date = new Date();
        //格式化为本地时间格式
        var date1 = date.toLocaleString();
        //获取div
        var div1 = document.getElementById("times");
        //将时间写入div
        div1.innerHTML = date1;
    }
    //使用定时器每秒向div写入当前时间
    setInterval("getDate()", 1000);
</script>
</html>