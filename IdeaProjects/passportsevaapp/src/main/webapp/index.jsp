<%@ page language="java" contentType="text/html;charset=UTF-8"  %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Passport Seva - Homepage</title>
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
      position: relative;
      min-height: 100vh;
      width: 100%;
      overflow: hidden;
      display: flex;
      flex-direction: column;
    }

    .bg-container img {
      position: absolute;
      width: 100%;
      height: 100%;
      object-fit: cover;
      z-index: -1;
      filter: brightness(0.6);
    }

    nav {
      width: 100%;
      padding: 16px 40px;
      background-color: rgba(0, 0, 0, 0.6);
      display: flex;
      justify-content: flex-end;
      position: relative;
      z-index: 10;
    }

    nav a {
      color: #e0f7fa;
      text-decoration: none;
      margin-left: 20px;
      font-weight: bold;
      font-size: 1.1em;
      padding: 8px 16px;
      border-radius: 6px;
      background-color: #00bcd4;
      transition: all 0.3s ease;
    }

    nav a:hover {
      background-color: #ffffff;
      color: #00796b;
    }

    .center-content {
      flex: 1;
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      text-align: center;
      color: #e0f7fa;
      padding: 20px;
    }

    .center-content h1 {
      font-size: 3em;
      margin-bottom: 20px;
      color: #00e5ff;
      text-shadow: 1px 1px 4px #000;
    }

    .center-content p {
      font-size: 1.2em;
      max-width: 700px;
      margin-bottom: 30px;
      text-shadow: 1px 1px 3px #000;
    }

    .center-content a.button {
      background-color: #00bcd4;
      color: #ffffff;
      padding: 14px 32px;
      font-weight: bold;
      text-decoration: none;
      border-radius: 8px;
      font-size: 1.1em;
      box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
      transition: all 0.3s ease;
    }

    .center-content a.button:hover {
      background-color: #ffffff;
      color: #00796b;
      transform: scale(1.05);
    }

    .info-text {
      margin-top: 40px;
      max-width: 800px;
      padding: 0 20px;
    }

    .info-text h2 {
      color: #00e5ff;
      margin-bottom: 10px;
      text-shadow: 1px 1px 3px #000;
    }

    .info-text p {
      font-size: 1em;
      color: #b2ebf2;
      line-height: 1.6;
      text-shadow: 1px 1px 2px #000;
    }

    footer {
      background-color: rgba(0, 0, 0, 0.6);
      color: #e0f7fa;
      text-align: center;
      padding: 15px 0;
      font-size: 0.9em;
      position: relative;
      z-index: 10;
    }

    footer a {
      color: #80deea;
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
    <img src="passportimage.jpg" alt="Passport Background" />

    <!-- Navigation Bar -->
    <nav>
      <a href="index.jsp">Home</a>
      <a href="register.jsp">Register</a>
    </nav>

    <!-- Main Content Section -->
    <div class="center-content">
      <h1>Passport Seva</h1>
      <p>Welcome to the official Passport Seva portal. Start your passport application by registering now.</p>
      <a href="register.jsp" class="button">New Register</a><br>
      <a href="getAllUsers" class="button">get all Users</a>

      <!-- Informational Text Section -->
      <div class="info-text">
        <h2>What is Passport Seva?</h2>
        <p>
          Passport Seva is a citizen-friendly platform developed by the Ministry of External Affairs, Government of India.
          It enables users to apply for fresh passports, renew existing ones, schedule appointments at Passport Seva Kendras (PSKs),
          and track application status in real-time. The service ensures quick, secure, and transparent delivery of passport-related services.
        </p>
      </div>
    </div>

    <!-- Footer Section -->
    <footer>
      &copy; 2025 Passport Seva. All rights reserved. |
      <a href="#">Terms</a> |
      <a href="#">Privacy Policy</a> |
      <a href="#">Contact Us</a>
    </footer>
  </div>
</body>
</html>
