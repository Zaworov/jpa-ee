<html>
<body>
<h2>Book Manager</h2>
<h3>Save</h3>
<form action="save" method="POST">
    <input type="text" name="isbn" placeholder="ISBN" /><br />
    <input type="text" name="name" placeholder="Name" /><br />
    <input type="text" name="author" placeholder="Author" /><br />
    <input type="submit" value="Save" />
</form>
<h3>Get</h3>
<form action="get" method="POST">
    <input type="number" name="id" placeholder="BookID" /><br />
    <input type="submit" value="Get" />
</form>
<h3>Update</h3>
<form action="update" method="POST">
    <input type="number" name="id" placeholder="ID" /><br />
    <input type="text" name="isbn" placeholder="ISBN" /><br />
    <input type="text" name="name" placeholder="Name" /><br />
    <input type="text" name="author" placeholder="Author" /><br />
    <input type="submit" value="Update" />
</form>
<h3>Delete</h3>
<form action="delete" method="POST">
    <input type="number" name="id" placeholder="ID" /><br />
    <input type="submit" value="Delete" />
</form>
</body>
</html>