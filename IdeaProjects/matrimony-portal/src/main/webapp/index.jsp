<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Matrimony Portal - Homepage</title>
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
    }

    html, body {
      height: 100%;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    }

    .bg-container {
      min-height: 100vh;
      width: 100%;
      display: flex;
      flex-direction: column;
      background: linear-gradient(135deg, #fef6e4, #fde2e4);
    }

    nav {
      width: 100%;
      padding: 16px 40px;
      background-color: #d63447;
      display: flex;
      justify-content: flex-end;
    }

    nav a {
      color: #fff4f4;
      text-decoration: none;
      margin-left: 20px;
      font-weight: bold;
      font-size: 1.1em;
      padding: 8px 16px;
      border-radius: 6px;
      background-color: #f45d48;
      transition: all 0.3s ease;
    }

    nav a:hover {
      background-color: #fff;
      color: #d63447;
    }

    .center-content {
      flex: 1;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      text-align: center;
      color: #4b2e2e;
      padding: 30px;
    }

    .center-content h1 {
      font-size: 3em;
      margin-bottom: 20px;
      color: #c70039;
      text-shadow: 1px 1px 3px #f8c8dc;
    }

    .center-content p {
      font-size: 1.2em;
      max-width: 700px;
      margin-bottom: 30px;
    }

    .center-content a.button {
      background-color: #f45d48;
      color: #ffffff;
      padding: 14px 32px;
      font-weight: bold;
      text-decoration: none;
      border-radius: 8px;
      font-size: 1.1em;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
      transition: all 0.3s ease;
    }

    .center-content a.button:hover {
      background-color: #fff;
      color: #d63447;
      transform: scale(1.05);
    }

    .info-text {
      margin-top: 40px;
      max-width: 800px;
      padding: 0 20px;
    }

    .info-text h2 {
      color: #b9143c;
      margin-bottom: 10px;
    }

    .info-text p {
      font-size: 1em;
      color: #4e2c2c;
      line-height: 1.6;
    }

    footer {
      background-color: #d63447;
      color: #fff4f4;
      text-align: center;
      padding: 15px 0;
      font-size: 0.9em;
    }

    footer a {
      color: #ffe3e3;
      text-decoration: none;
      margin: 0 10px;
    }

    footer a:hover {
      text-decoration: underline;
    }
  </style>
</head>

<body>
  <div class="bg-container">
    <!-- Navigation Bar -->
    <nav>
      <a href="index.jsp">Home</a>
      <a href="registration.jsp">Register</a>
    </nav>

    <!-- Main Content Section -->
    <div class="center-content">
      <h1>Matrimony Portal</h1>
      <p>Welcome to the official Matrimony Portal. Start your journey to find your perfect life partner by registering now.</p>
      <a href="registration.jsp" class="button">New Register</a>

      <!-- Informational Text Section -->
      <div class="info-text">
        <h2>About Matrimony Portal</h2>
        <p>
          Our Matrimony Portal is designed to connect individuals seeking life partners in a secure, transparent, and culturally respectful environment.
          With personalized matches, profile verification, and user-friendly registration, we make your partner search effortless and meaningful.
        </p>
      </div>
    </div>

    <!-- Footer Section -->
    <footer>
      &copy; 2025 Matrimony Portal. All rights reserved. |
      <a href="#">Terms</a> |
      <a href="#">Privacy Policy</a> |
      <a href="#">Contact Us</a>
    </footer>
  </div>
</body>

</html>
