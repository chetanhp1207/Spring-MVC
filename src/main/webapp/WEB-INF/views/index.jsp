
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>People Details</title>

<style>
body {
	font-family: Arial, sans-serif;
	background-color: rgb(192, 192, 192);
	margin: 0;
	padding: 40px;
}

h2 {
	text-align: center;
	color: #2c3e50;
	margin-bottom: 25px;
}

table {
	width: 100%;
	border-collapse: collapse;
	background-color: aqua;
	box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
	border-radius: 10px;
	overflow: hidden;
}

th {
	background-color: #34495e;
	color: white;
	padding: 15px;
	text-align: center;
	font-size: 15px;
}

td {
	padding: 13px;
	text-align: center;
	color: #333;
	border-bottom: 1px solid rgb(170, 177, 196);
}

tr:nth-child(even) {
	background-color: rgb(245, 247, 248);
}

tr:hover {
	background-color: #dceeff;
	transition: 0.3s;
}

tr:last-child td {
	border-bottom: none;
}
</style>

</head>
<body>

	<h2>People Details</h2>

	<table>
		<tr>
			<th>Name</th>
			<th>Id</th>
			<th>Course Name</th>
			<th>Skills</th>
			<th>Amount Paid</th>
			<th>Organisation Name</th>
			<th>Status</th>
			<th>Grade</th>
		</tr>

		<tr>
			<td>${name1}</td>
			<td>${id1}</td>
			<td>${course1}</td>
			<td>${skills1}</td>
			<td>${amount1}</td>
			<td>${organisation1}</td>
			<td>${status1}</td>
			<td>${grade1}</td>
		</tr>

		<tr>
			<td>${name2}</td>
			<td>${id2}</td>
			<td>${course2}</td>
			<td>${skills2}</td>
			<td>${amount2}</td>
			<td>${organisation2}</td>
			<td>${status2}</td>
			<td>${grade2}</td>
		</tr>

		<tr>
			<td>${name3}</td>
			<td>${id3}</td>
			<td>${course3}</td>
			<td>${skills3}</td>
			<td>${amount3}</td>
			<td>${organisation3}</td>
			<td>${status3}</td>
			<td>${grade3}</td>
		</tr>

		<tr>
			<td>${name4}</td>
			<td>${id4}</td>
			<td>${course4}</td>
			<td>${skills4}</td>
			<td>${amount4}</td>
			<td>${organisation4}</td>
			<td>${status4}</td>
			<td>${grade4}</td>
		</tr>

		<tr>
			<td>${name5}</td>
			<td>${id5}</td>
			<td>${course5}</td>
			<td>${skills5}</td>
			<td>${amount5}</td>
			<td>${organisation5}</td>
			<td>${status5}</td>
			<td>${grade5}</td>
		</tr>

		<tr>
			<td>${name6}</td>
			<td>${id6}</td>
			<td>${course6}</td>
			<td>${skills6}</td>
			<td>${amount6}</td>
			<td>${organisation6}</td>
			<td>${status6}</td>
			<td>${grade6}</td>
		</tr>

		<tr>
			<td>${name7}</td>
			<td>${id7}</td>
			<td>${course7}</td>
			<td>${skills7}</td>
			<td>${amount7}</td>
			<td>${organisation7}</td>
			<td>${status7}</td>
			<td>${grade7}</td>
		</tr>

		<tr>
			<td>${name8}</td>
			<td>${id8}</td>
			<td>${course8}</td>
			<td>${skills8}</td>
			<td>${amount8}</td>
			<td>${organisation8}</td>
			<td>${status8}</td>
			<td>${grade8}</td>
		</tr>

		<tr>
			<td>${name9}</td>
			<td>${id9}</td>
			<td>${course9}</td>
			<td>${skills9}</td>
			<td>${amount9}</td>
			<td>${organisation9}</td>
			<td>${status9}</td>
			<td>${grade9}</td>
		</tr>

		<tr>
			<td>${name10}</td>
			<td>${id10}</td>
			<td>${course10}</td>
			<td>${skills10}</td>
			<td>${amount10}</td>
			<td>${organisation10}</td>
			<td>${status10}</td>
			<td>${grade10}</td>
		</tr>

	</table>

</body>
</html>
