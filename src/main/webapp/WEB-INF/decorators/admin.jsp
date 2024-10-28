<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file ="/common/admin/header.jsp" %>
	<sitemesh:write property="body" />
	
	<%@ include file = "/common/admin/footer.jsp" %>
	
	<script src="${URL}assets/global/plugins/jquery.min.js" type="text/javascript"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
	function chooseFile(fileInput) {
        console.log("File input change detected");
        if (fileInput.files && fileInput.files[0]) {
            var reader = new FileReader();
            reader.onload = function(e) {
                var imgElement = $('#imagess');
                if (imgElement.length > 0) {
                    imgElement.attr('src', e.target.result);
                    console.log("Image updated successfully");
                } else {
                    console.log("Image element not found");
                }
            }
            reader.readAsDataURL(fileInput.files[0]);
        }
    }
	</script>
</body>
</html>