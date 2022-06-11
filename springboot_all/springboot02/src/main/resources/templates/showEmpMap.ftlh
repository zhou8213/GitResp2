<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #empTable{
            width: 80%;
            border: 1px solid blue;
            margin: 0px auto;
        }
        #empTable th,td{
            border: 1px solid green;
            text-align: center;
        }
    </style>
</head>
<body>
<#--查看map集合中单独的一个元素-->
查看7521员工信息
工号:${empMap['7521'].empno}<br>
信息:${empMap['7521'].ename}<br>
岗位:${empMap['7521'].job}<br>
薪资:${empMap['7521'].sal}<br>
部门号:${empMap['7521'].deptno}<br>

<table id="empTable" cellpadding="0px" cellspacing="0px">
    <tr>
        <th>索引</th>
        <th>工号</th>
        <th>姓名</th>
        <th>岗位</th>
        <th>薪资</th>
        <th>部门号</th>
    </tr>
    <#list empMap?keys as key>
        <tr>
            <td>${key_index}</td>
            <td>${empMap[key].empno}</td>
            <td>${empMap[key].ename}</td>
            <td>${empMap[key].job}</td>
            <td>${empMap[key].sal}</td>
            <td>${empMap[key].deptno}</td>
        </tr>
    </#list>
</table>
</body>
</html>