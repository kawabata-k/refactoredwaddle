<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>いろんなパラメータ</h2>
	<form action="ParamListServlet">
		<p>テキストフィールド
		<input type="text" name="text1" value="テキストフィールド">

		<p>テキストエリア
		<textarea name="textarea1" cols="30" rows="5">テキストエリア</textarea>

		<p>ラジオボタン
		<input type="radio" name="radio1" value="value1" checked>左
		<input type="radio" name="radio1" value="value2">右

		<p>チェックボックス
		<input type="checkbox" name="check1">ゴルフ
		<input type="checkbox" name="check2">テニス
		<input type="checkbox" name="check3">サッカー

		<p>セレクト
		<select name="lang" size="3" multiple="true">
		<option value="sel1">VB
		<option value="sel2">C
		<option value="sel3">Java
		</select>

		<p>
		<input type="submit">
		<input type="reset">

	</form>
</body>
</html>