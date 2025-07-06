<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Index Page</title>
  <style>
    body {
      background-color: #0f2027;
      background-image: linear-gradient(to right, #2c5364, #203a43, #0f2027);
      color: #e0f7fa;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh;
    }

    h1 {
      color: #00bcd4;
      margin-bottom: 20px;
      font-size: 3em;
      text-align: center;
      letter-spacing: 1px;
    }

    p {
      max-width: 600px;
      text-align: center;
      font-size: 1.2em;
      margin-bottom: 40px;
      line-height: 1.6;
      color: #b2ebf2;
    }

    a.button {
      background-color: #00bcd4;
      color: #ffffff;
      padding: 14px 32px;
      font-weight: 600;
      text-decoration: none;
      border-radius: 8px;
      font-size: 1.1em;
      transition: all 0.3s ease;
      box-shadow: 0 4px 12px rgba(0, 188, 212, 0.3);
    }

    a.button:hover {
      background-color: #ffffff;
      color: #00796b;
      transform: scale(1.05);
    }
  </style>
</head>
<body>

  <h1>Welcome to Our Web Application</h1>
  <p>Start your journey by registering your information. Click the button below to access the registration form.</p>
  <a href="register.jsp" class="button">Go to Registration</a>

</body>
</html>
