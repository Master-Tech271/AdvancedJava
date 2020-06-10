<%@page pageEncoding="UTF-8" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>

<!DOCTYPE html>
<html>
<head>
	<title>JSTL Functions</title>
</head>
<body>
	${'JSTL Functions'}
	<c:set var="name" value="master-tech786"></c:set>
	<%-- contains --%><br/>
	<c:if test="${f:contains(name, 'master-tech786')}">
		${'your name contains master-tech786'}
	</c:if>
	<%-- containsIgnoreCase --%> <br/>
	<c:choose>
		<c:when test="${f:containsIgnoreCase(name, 'master-Tech786')}">
		${'your name contains master-Tech786'} <%-- ignore case --%>
	</c:when>
	<c:otherwise>
		${'your name does not contains master-Tech786'}
	</c:otherwise>
	</c:choose>
	<%-- endsWith --%><br/>
	${f:endsWith(name, '786')}
	<%-- escapeXml --%><br/>
	<c:set var='se' value='</html><!DOCTYPE html><html><head><title></title></head><body><h1>master</h1></body></html>'> </c:set>
	<%-- without escapeXml --%>
	${se} <br>
	<%-- with escapeXml --%>
	${f:escapeXml(se)}
	<%-- indexOf --%> <br/>
	${f:indexOf(name, 't')}
	<%-- split --%><br>
	<c:set var="sp" value="${f:split(name, '-')}" ></c:set>
	${sp[0]} <br>
	${sp[1]} <br>

	<%-- join --%>
	${f:join(sp, 'umar')}
	<br>
	<!-- length -->
	${'length of name = '} ${f:length(name)}

	<!-- replace --> <br>
	${'replace tech786 to umar = '} ${f:replace(name, 'tech786', 'umar')} 

	<!-- startsWith --> <br>
	${'name starts with master = '} ${f:startsWith(name, 'master')}

	<!-- substring --><br>
	${'substring of name 3 to 9 means 9-1 = '} ${f:substring(name, 3, 9)}	

	<!-- substringAfter --> <br>
	${'substring after master = '} ${f:substringAfter(name, 'master')}

	<!-- substringBefor --> <br>
	${'substring before 786 = '} ${f:substringBefore(name, '786')}

	<!-- toLowerCase --><br>
	${'name in lower case = '} ${f:toLowerCase(name)}

	<!-- toUpperCase --> <br>
	${'name in upper case = '} ${f:toUpperCase(name)}

	<!-- trim = remove the starting and ending spaces from a string--> <br>
	${'name with trim function = '} ${f:trim(name)}
</body>
