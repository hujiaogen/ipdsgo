<!doctype html>
<html lang="en">
<head>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


</head>
<body>
<h1 class="nav justify-content-center" class='charcoal rounded-box'>Intelligent Patient Data Server</h1>
<ul class="nav justify-content-center">
    <li class="nav-item">
        <a class="nav-link active" href="/html/upload.html">Accept</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/html/store.html">Store</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/html/store.html">Convert</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/html/store.html">Serve</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="/html/login.html">Login</a>
    </li>
</ul>
<ul class="nav justify-content-center">
    <form enctype="multipart/form-data" action="/upload" method="post">
        <input type="file" name="uploadfile"/>
        <input type="hidden" name="token" value="{{.}}"/>
        <input type="submit" value="upload"/>
    </form>
</ul>
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>